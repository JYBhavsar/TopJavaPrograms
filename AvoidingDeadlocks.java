

public class AvoidingDeadlocks {

    // Shared resources
    public static final Object resource1 = new Object();
    public static final Object resource2 = new Object();

    // Method to access resources in a specific order
    public static void accessResources(String threadName) {

        // Determine locking order based on hash codes
        Object firstResource = (System.identityHashCode(resource1) < System.identityHashCode(resource2)) 
                                ? resource1 : resource2;
        Object secondResource = (firstResource == resource1) ? resource2 : resource1;

        // Acquire the first resource
        synchronized (firstResource) {
            System.out.println(threadName + " acquired " + firstResource);

            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Acquire the second resource
            synchronized (secondResource) {
                System.out.println(threadName + " acquired " + secondResource);

                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(threadName + " is working with both resources.");
            }

            System.out.println(threadName + " released " + secondResource);
        }

        System.out.println(threadName + " released " + firstResource);
    }

    public static void main(String[] args) throws InterruptedException {
        // Create and start threads
        Thread t1 = new Thread(() -> accessResources("Thread-1"));
        Thread t2 = new Thread(() -> accessResources("Thread-2"));
        Thread t3 = new Thread(() -> accessResources("Thread-3"));

        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        t1.join();
        t2.join();
        t3.join();
    }
}


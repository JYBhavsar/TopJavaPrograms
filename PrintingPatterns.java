public class PrintingPatterns {

    /*Program to print a given pattern composed of ASCII characters. 
    The solution is required to employ an effective algorithm, as opposed to directly printing the pattern as it is.
    */

    public static void main(String[] args) {
        // The pattern to be printed
        String pattern = "*****\n*****\n*****\n*****\n*****\n";
        // The number of times the pattern is to be printed
        int n = 5;
        // Print the pattern n times
        printPattern(pattern, n);
    } 

    private static void printPattern(String pattern, int n) {
        // Split the pattern into lines
        String[] lines = pattern.split("\n");
        // Print the pattern n times
        for (int i = 0; i < n; i++) {
            for (String line : lines) {
                System.out.println(line);
            }
        }
    }   
}

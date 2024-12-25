import java.util.Scanner;

public class Fibonacci {

    /*
     * Program to display any given number of integers of the Fibonacci series. 
     * In the Fibonacci series, each number is equal to the sum of the two numbers that precede it.
    */
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
        int x=0, y=1, z;
        System.out.println(0+"\n"+1);
        
        for(int i=2; i<count; i++){
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
        }

    }

}

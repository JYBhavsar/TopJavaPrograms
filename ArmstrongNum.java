import java.util.Scanner;

public class ArmstrongNum {

    /*
     * Program to verify whether a given number is an Armstrong number. 
     * An Armstrong number is equal to the sum of the cubes of its digits.
    */
    public static void main(String[] args) {
        System.out.print("Enter digit:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(IsArmstrong(num));
    }

    static boolean IsArmstrong(int num) {

        int n,r, sum=0;
        n = num;
        while (n > 0) {
            r = n%10;
            sum = sum + (r*r*r);
            n /= 10;
        }

        return num == sum;
    } 
    
}

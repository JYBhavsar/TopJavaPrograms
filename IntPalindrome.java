import java.util.Scanner;

public class IntPalindrome {

        /*Program to verify whether a given integer is a palindrome or not.*/
        
        public static void main(String[] args) {
            System.out.print("Enter integer:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.close();
            System.out.println(IsPalin(num));
        }

        static boolean IsPalin(int num){

            int rev = 0;
            int x = num;
            if(x == 0 || x%10==0){
                return false;
            }
            while (x > 0) {
                rev = 10 * rev + x % 10;
                x /= 10;
            }

            return rev == num;
        }
}

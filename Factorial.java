import java.util.Scanner;

public class Factorial {

    /*Program to find the factorial of a given number.*/
    
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("Result:"+Facto(num));
    }

    static int Facto(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * Facto(n-1);
        }
    }
}

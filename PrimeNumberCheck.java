import java.util.Scanner;

public class PrimeNumberCheck {
    
    /*Program to verify whether a given number is a prime or composite.*/
    
    public static void main(String[] args) {
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(Fibo(num));
    }

    @SuppressWarnings("unused")
    static boolean Fibo(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }else{
                return true;
            }
        }
                return true;
    
    }
}

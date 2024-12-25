import java.util.Scanner;

public class StringPalindrome {

    /*
     * Program to verify whether a given string is a palindrome or not. 
     * A string is a palindrome if it is equal to the reverse of itself.
    */
   public static void main(String[] args) {
        System.out.print("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(IsPalin(str));
    }

    static boolean IsPalin(String str){
        int j=1;
        str = str.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == str.charAt(str.length()-j)){
                j++;
            }else{
                return false;
            }
        }

        return true;
    }
}

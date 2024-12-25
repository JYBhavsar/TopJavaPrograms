import java.util.Scanner;

public class ReverseString {
    
        /*Program to reverse the order of characters in any given string.*/

        public static void main(String[] args) {
            System.out.print("Enter string:");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();
            System.out.println("Reversed string is: "+Reverse(str)); // By custom method

            StringBuilder builder = new  StringBuilder(str);
            builder.reverse();
            System.out.println("By StringBuilder: "+builder.toString()); // By StringBuilder

        }

        static String Reverse(String str){
            String newStr = "";
            int temp = 1;
            for(int i=0; i<str.length(); i++){
                newStr += str.charAt(str.length()-temp);
                temp ++;
            }

            return newStr;
        }
}

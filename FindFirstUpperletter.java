public class FindFirstUpperletter {
    
    public static void main(String[] args) {
        String str = "i am jOhn smith";
        System.out.println("First Uppercase Letter:"+Firstletter(str));
    }

    static char Firstletter(String str){
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }
        }

        return 0;
    }
}

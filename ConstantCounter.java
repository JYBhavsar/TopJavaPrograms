import java.util.HashMap;

public class ConstantCounter{

    public static void main(String[] args) {
        
        String str = "Hello World I am Jay bhavsar";
        HashMap<String,Integer> hashMap = CountConstant(str);
        System.out.println("Total Constants are:"+hashMap.get("c"));
    }
        
    public static HashMap<String,Integer> CountConstant(String str){

        str = str.toLowerCase();
        System.out.println("Stringis:"+str);
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("c", 0);
        
        for (int j=0; j<str.length(); j++) {
            if(str.charAt(j) != 'a' && str.charAt(j) != 'e' && str.charAt(j) != 'i'
                && str.charAt(j) != 'o' && str.charAt(j) != 'u' && str.charAt(j) != ' '){
                hashMap.put("c",hashMap.get("c") + 1);
            }
            
        }

        return hashMap;
    }
}

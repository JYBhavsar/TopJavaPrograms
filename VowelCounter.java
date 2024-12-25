import java.util.HashMap;

public class VowelCounter{

    public static void main(String[] args) {
        
        String str = "Hello World I am Jay bhavsar";
        HashMap<String,Integer> hashMap = CountVowels(str);
        System.out.println("hashMap:=="+hashMap);
        
    }
        
    public static HashMap<String,Integer> CountVowels(String str){

        str = str.toLowerCase();
        System.out.println("Stringis:"+str);
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);
        System.out.println("Size of string:"+str.length());
        for (int j=0; j<str.length(); j++) {
            switch (str.charAt(j)) {
                case 'a' -> hashMap.put("a", hashMap.get("a") + 1);
                case 'e' -> hashMap.put("e", hashMap.get("e") + 1);
                case 'i' -> hashMap.put("i", hashMap.get("i") + 1);
                case 'o' -> hashMap.put("o", hashMap.get("o") + 1);
                case 'u' -> hashMap.put("u", hashMap.get("u") + 1);
                default -> {
                }
            }
            
        }

        return hashMap;
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class RemoveRepeatElement {
    
    /*Program to identify and remove all repeated elements from an array. 
    Arrays could be of various types like integer, character or string.*/

    public static void main(String[] args) {
        
        Integer[] intArray  =  {1, 2, 2, 3, 4, 4, 5}; 
        Integer[] newIntArr =  removeDuplicates(intArray );
        System.out.println("New int array: "+Arrays.toString(newIntArr));
        
        Character[] charArray = {'a', 'b', 'a', 'c', 'd', 'd'};
        Character[] uniqueChars = removeDuplicates(charArray);
        System.out.println("Unique characters: " + Arrays.toString(uniqueChars));

        String[] strArray = {"apple", "banana", "apple", "orange", "banana"};
        String[] uniqueStrings = removeDuplicates(strArray);
        System.out.println("Unique strings: " + Arrays.toString(uniqueStrings));
    }

    static <T> T[] removeDuplicates(T[] array){
        HashSet<T> uniqueElements = new LinkedHashSet<>(Arrays.asList(array)); 
        System.out.println("uniqueElements: "+uniqueElements);
        
        T[] result = uniqueElements.toArray(Arrays.copyOf(array, uniqueElements.size()));

        return result;
    }

}

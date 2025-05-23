
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
        
        String[] strings = {"hi", "this", "is", "Minh Trang"};
        sort(strings);
        System.out.println(Arrays.toString(strings));
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort (String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}

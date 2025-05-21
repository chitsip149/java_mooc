import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
        
    }
    
    public static int smallest (int[] array){
        int ret = array[0];
        for (int num:array){
            if (num<ret){
                ret = num;
            }
        }
        return ret;
    }
    
    public static int indexOfSmallest (int[] array){
        int s = smallest(array);
        for (int i=0; i<array.length; i++){
            if (array[i]==s) {
                return i;
            }
        }
        return 0;
    }
    
    public static int indexOfSmallestFrom (int[] table, int startIndex){
        int [] copy = new int[table.length-startIndex];
        System.arraycopy(table, startIndex, copy, 0, table.length-startIndex);
        return indexOfSmallest(copy)+startIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int tmp=array[index1];
        array[index1] = array[index2];
        array[index2]=tmp;
    }
    
    public static void sort (int [] array){
        System.out.println(Arrays.toString(array));
        for (int i=0; i<array.length; i++){
            int index = MainProgram.indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }

}

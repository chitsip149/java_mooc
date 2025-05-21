
public class Smallest {

    public static int smallest(int num1, int num2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        return (num1<num2)?num1:num2;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}

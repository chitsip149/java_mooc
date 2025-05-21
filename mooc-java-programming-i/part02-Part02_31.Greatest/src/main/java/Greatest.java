
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int res=number1;
        if (number2>res){
            res=number2;
        }
        if (number3>res){
            res=number3;
        }
        return res;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num=Integer.valueOf(scanner.nextLine());
        int res=1;
        for (int i=1; i<=num; i++){
            res*=i;
        }
        System.out.println("Factorial: "+res);
    }
}


import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        int s=num1+num2;
        double res=Math.sqrt(s);
        System.out.println(res);
    }
}

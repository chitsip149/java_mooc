
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int val = Integer.valueOf(scan.nextLine());
        double tax = 0;
        if (val>=1000000){
            tax = (val-1000000)*0.17 + 142100;
        } else if (val>=200000) {
            tax = (val-200000)*0.15 + 22100;
        } else if (val>=55000) {
            tax = (val-55000)*0.12 + 4700;
        } else if (val>=25000) {
            tax = (val-25000)*0.1 + 1700;
        } else if (val>=5000) {
            tax = (val-5000)*0.08 + 100;
        }
        if (tax==0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: "+tax);
        }
    }
}

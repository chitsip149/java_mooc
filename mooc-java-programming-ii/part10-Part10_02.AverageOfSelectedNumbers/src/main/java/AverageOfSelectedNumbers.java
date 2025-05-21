
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> inp = new ArrayList<>();
        while (true){
            String text = scanner.nextLine();
            if (text.equals("end")){
                break;
            }
            inp.add(text);
        }
        System.out.println("");
        System.out.println("Print the average of the nmbers or the positive numbers? (n/p)");
        String sign = scanner.nextLine();
        if (sign.equals("n")){
            double ans = inp.stream().mapToInt(s->Integer.valueOf(s)).filter(number -> (number<0)).average().getAsDouble();
            System.out.println("Average of the negative numbers: "+ans);
        } else {
            double ans = inp.stream().mapToInt(s->Integer.valueOf(s)).filter(number -> (number>0)).average().getAsDouble();
            System.out.println("Average of the positive numbers: "+ans);
        }

    }
}

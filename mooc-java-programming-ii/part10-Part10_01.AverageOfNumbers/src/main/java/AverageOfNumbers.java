
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String inp = scanner.nextLine();
            if (inp.equals("end")){
                break;
            }
            list.add(inp);
        }
        double avg = list.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers: "+avg);

    }
}

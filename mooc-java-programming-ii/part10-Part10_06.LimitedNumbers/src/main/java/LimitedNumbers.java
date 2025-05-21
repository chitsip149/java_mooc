
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        while (true){
            int row = Integer.valueOf(scanner.nextLine());
            if (row==-1){
                break;
            }
            input.add(row);
        }
        ArrayList<Integer> res = input.stream().filter(number -> (number>=1 && number<=5)).collect(Collectors.toCollection(ArrayList::new));
        res.forEach(number -> System.out.println(number));
    }
}


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // test your method here
//        ArrayList<Integer> inp = new ArrayList<>();
//        while (true){
//            String text = scanner.nextLine();
//            if (text.equals("")){
//                break;
//            }
//            inp.add(Integer.valueOf(text));
//        }
//        List<Integer> pos = positive(inp);
//        System.out.println(pos);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        long howManyNumbers = numbers.stream()
            .filter(i -> i < 4)
            .map(i -> i * 2)
            .filter(i -> i > 10)
            .count();

        System.out.println("Numbers: " + howManyNumbers);

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> values = numbers.stream().filter(value -> value>0).collect(Collectors.toList());
        return values;
    }

}


import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        while (true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            }
            input.add(text);
        }
        input.stream().forEach(text -> System.out.println(text));

    }
}

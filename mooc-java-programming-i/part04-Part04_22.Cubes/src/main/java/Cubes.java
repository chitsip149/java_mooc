
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String inp = scanner.nextLine();
            if (inp.equals("end")){
                break;
            }
            int num = Integer.valueOf(inp);
            System.out.println(num*num*num);
        }
    }
}

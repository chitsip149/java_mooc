
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, Integer> map = new HashMap<>();
        map.add("trang", 1);
        map.add("mun", 2);
        map.add("duc", 3);
        System.out.println(map.get("trang"));
        System.out.println(map.remove("duc"));
        System.out.println(map.get("duc"));
        System.out.println(map.get("mun"));
    }

}

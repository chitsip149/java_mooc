
//import java.io.File;
//import java.util.ArrayList;
import java.util.Scanner;
//import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(new RecipeList(), scanner);
        ui.start();

    }

}

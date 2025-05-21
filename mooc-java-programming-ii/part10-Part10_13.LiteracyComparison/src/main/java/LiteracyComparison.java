
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
//        ArrayList<String> readFile = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .map(parts -> new Literacy(parts[3], Integer.valueOf(parts[4]), parts[2].trim().substring(0, parts[2].trim().length()-4), Double.valueOf(parts[5])))
                    .sorted()
                    .forEach(literacy -> System.out.println(literacy));
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

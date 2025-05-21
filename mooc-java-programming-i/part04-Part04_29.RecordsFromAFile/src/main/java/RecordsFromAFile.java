
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()){
                String row = scanFile.nextLine();
                String [] pieces = row.split(",");
                System.out.print(pieces[0]+", age: "+pieces[1]);
                if (Integer.valueOf(pieces[1])==1) {
                    System.out.print(" year");
                } else {
                    System.out.print(" years");
                }
                System.out.println("");
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt=0;
        double sum=0;
        int longest =0;
        String lname = "";
        while (true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            }
            String [] pieces = text.split(",");
            String name = pieces[0];
            if (name.length()>longest){
                longest = name.length();
                lname=name;
            }
            int year = Integer.valueOf(pieces[1]);
            sum+=year;
            cnt+=1;
        }
        System.out.println("Longest name: "+lname);
        System.out.println("Average of the birth years: "+sum/cnt);
    }
}

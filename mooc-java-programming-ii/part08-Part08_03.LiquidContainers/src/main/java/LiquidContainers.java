
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 =0;
        int container2=0;
        while (true) {
            System.out.println("First: "+container1+"/100");
            System.out.println("Second: "+container2+"/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] pieces = input.split(" ");
            String command = pieces[0];
            int amount = Integer.valueOf(pieces[1]);
            if (amount<0){
                continue;
            }
            if (command.equals("add")){
                if (container1+amount<=100){
                    container1+=amount;
                } else {
                    container1=100;
                }
            } else if (command.equals("move")){
                if (container1<amount){
                    amount = container1;
                }
                container1-=amount;
                if (container2+amount<=100){
                    container2+=amount;
                } else {
                    container2=100;
                }
            } else if (command.equals("remove")){
                if (container2<amount){
                    amount = container2;
                }
                container2-=amount;
            }
            
        }
    }

}

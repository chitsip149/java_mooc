/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary book;
    
    public TextUI(Scanner scanner, SimpleDictionary book){
        this.scanner = scanner;
        this.book = book;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")){
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("translation");
                String translation = this.scanner.nextLine();
                this.book.add(word, translation);
                continue;
            }
            if (command.equals("search")){
                System.out.println("To be translated:");
                String word = this.scanner.nextLine();
                String translation = book.translate(word);
                if (translation ==null){
                    System.out.println("Word "+word+" was not found");
                } else {
                    System.out.println("Translation: "+book.translate(word));
                }
                
                continue;
            }
            System.out.println("Unknown command");
        }
    }
    
}

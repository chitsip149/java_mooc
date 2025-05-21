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
public class UserInterface {
    private Scanner scanner;
    private BirdRecord record;
    
    public UserInterface(Scanner scanner, BirdRecord record){
        this.scanner = scanner;
        this.record = record;
    }
    
    public void start(){
        while (true){
            System.out.println("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")){
                break;
            }
            if (command.equals("Add")){
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird newBird = new Bird(name, latinName);
                this.record.addBird(newBird);
                continue;
            }
            if (command.equals("Observation")){
                System.out.println("Bird?");
                String name = scanner.nextLine();
                this.record.observation(name);
                continue;
            }
            if (command.equals("All")){
                this.record.all();
                continue;
            }
            if (command.equals("One")){
                System.out.println("Bird?");
                String name = scanner.nextLine();
                this.record.one(name);
                continue;
            }
        }
    }
    
}

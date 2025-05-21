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
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            if (command.equals("add")){
                System.out.println("To add:");
                String task = scanner.nextLine();
                this.list.add(task);
                continue;
            }
            if (command.equals("remove")){
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(scanner.nextLine());
                this.list.remove(num);
                continue;
            }
            if (command.equals("list")){
                this.list.print();
            }
        }
    }
}

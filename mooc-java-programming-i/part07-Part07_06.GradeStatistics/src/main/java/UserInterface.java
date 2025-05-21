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
    private GradeCollection collection;
    
    public UserInterface(GradeCollection collection, Scanner scanner){
        this.scanner = scanner;
        this.collection = collection;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int point = Integer.valueOf(scanner.nextLine());
            if (point==-1){
                break;
            }
            this.collection.addGrade(point);
            
        }
        
        System.out.println("Point average (all): "+this.collection.averagePoints());
        System.out.print("Point average (passing): ");
        if (this.collection.averagePassingPoints()==-1){
            System.out.print("-\n");
        } else {
            System.out.print(this.collection.averagePassingPoints()+"\n");
        }
        System.out.println("Pass percentage: "+this.collection.passPercentage());
        this.collection.printGradeDistribution();
    }
}

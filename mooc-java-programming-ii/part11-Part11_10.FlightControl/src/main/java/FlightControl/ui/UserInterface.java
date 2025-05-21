/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author minht
 */
public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;
    
    public UserInterface(Scanner scanner, FlightControl flightControl){
        this.scanner = scanner;
        this.flightControl = flightControl;
    }
    
    public void start(){
        assetControl();
        flightControl();
    }
    
    public void assetControl(){
        while (true){
            System.out.print("Airport Asset Control\n[1] Add an airplane\n[2] Add a flight\n[x] Exit Airport Asset Control\n> ");
            String inp = scanner.nextLine();
            if (inp.equals("x")){
                break;
            }
            if (inp.equals("1")){
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                this.flightControl.addAirplane(id, capacity);
                
            
            } else if (inp.equals("2")){
                System.out.print("Give the airplane id: ");
                String airplaneID = scanner.nextLine();
                System.out.println("Give the departure airport id: ");
                String departureID = scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String destinationID = scanner.nextLine();
                this.flightControl.addFlight(airplaneID, departureID, destinationID);
            }
//            System.out.println("");
        }
    }
    
    public void flightControl(){
        while (true){
            System.out.print("Flight Control\n[1] Print airplanes\n[2] Print flights\n[3] Print airplane details\n[x] Quit\n> ");
            String inp = scanner.nextLine();
            if (inp.equals("x")){
                break;
            }
            if (inp.equals("1")){
                this.flightControl.printAirplanes();
            
            } else if (inp.equals("2")){
                this.flightControl.printFlights();
            } else if (inp.equals("3")){
                System.out.print("Give the airplane id:");
                String id = scanner.nextLine();
                this.flightControl.printAirplaneDetail(id);
            }
            System.out.println("");
        }
    }
}

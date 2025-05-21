/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;
import FlightControl.domain.Flight;
import java.util.HashMap;

/**
 *
 * @author minht
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Airport> airports;
    private HashMap<String, Flight> flights;
    
    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.airports = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity){
        airplanes.put(id, new Airplane(id, capacity));
    }
    
    public void addFlight(String planeID, String departureID, String destinationID){
        Airplane airplane = this.airplanes.get(planeID);
        if (airplane==null){
            return;
        }
        Airport departure = new Airport(departureID);
        Airport destination = new Airport(destinationID);
        this.airports.putIfAbsent(departureID, departure);
        this.airports.putIfAbsent(destinationID, destination);
        Flight newFlight = new Flight(airplane, departure, destination);
        flights.put(newFlight.toString(), newFlight);
        
    }
    
    public void printFlights(){
        for (Flight flight:this.flights.values()){
            System.out.println(flight);
        }
    }
    
    public void printAirplaneDetail(String id){
        Airplane airplane = this.airplanes.get(id);
        System.out.println(airplane);
    }
    
    public void printAirplanes(){
        for (Airplane airplane: this.airplanes.values()){
            System.out.println(airplane);
        }
    }
}

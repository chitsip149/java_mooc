/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    public boolean add (LicensePlate licensePlate, String owner){
        String getOwner = this.registry.get(licensePlate);
        if (getOwner==null){
            this.registry.put(licensePlate, owner);
            return true;
        } 
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        String getOwner = this.registry.get(licensePlate);
        return getOwner;
    }
    
    public boolean remove(LicensePlate licensePlate){
        String getOwner = this.registry.get(licensePlate);
        if (getOwner==null){
            return false;
        } 
        this.registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for (LicensePlate licensePlate:this.registry.keySet()){
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for (String owner:this.registry.values()){
            if (!owners.contains(owner)){
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}

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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add (String unit, String item){
        ArrayList<String> list = this.storage.get(unit);
        if (list==null){
            list = new ArrayList<>();
            this.storage.put(unit, list);
        }
        list.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> list = this.storage.get(storageUnit);
        if (list==null){
            list = new ArrayList<>();
        }
        return list;
    }
    
    public void remove(String storageUnit, String item){
        ArrayList <String> list = this.storage.get(storageUnit);
        if (list==null){
            return;
        }
        list.remove(item);
        if (list.isEmpty()){
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for (String unit:this.storage.keySet()){
            ArrayList<String> items = this.storage.get(unit);
            if (!items.isEmpty()){
                list.add(unit);
            }
        }
        return list;
    }
}

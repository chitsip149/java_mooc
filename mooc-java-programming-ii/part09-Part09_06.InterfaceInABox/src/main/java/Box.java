/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.ArrayList;
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double capacity){
        this.capacity=capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if (this.weight()+item.weight()<=capacity){
            this.items.add(item);
        }
        
    }
    
    public double weight(){
        double ret=0;
        for (Packable item:this.items){
            ret+=item.weight();
        }
        return ret;
    }
    
    @Override
    public String toString(){
        return "Box: "+this.items.size()+" items, total weight "+this.weight()+" kg";
    }
}

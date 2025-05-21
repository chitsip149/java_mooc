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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public int sum(){
        int ret=0;
        for (Item item:this.items){
            ret+=item.getWeight();
        }
        return ret;
    }
    
    @Override
    public void add(Item item){
        if (item.getWeight()+sum()<=this.capacity){
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
}

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

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;
    public Suitcase(int weight){
        this.maximumWeight = weight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        int sum=0;
        for (Item addedItem:this.items){
            sum+=addedItem.getWeight();
        }
        if (sum+item.getWeight()<=this.maximumWeight){
            this.items.add(item);
        }
    }
    
    public int totalWeight(){
        int sum=0;
        for (Item item:this.items){
            sum+=item.getWeight();
        }
        return sum;
    }
    
    @Override 
    public String toString(){
        int sum=0;
        for (Item item:this.items){
            sum+=item.getWeight();
        }
        String ret = "";
        if (this.items.size()==0){
            ret = "no items (0 kg)";
        } else if (this.items.size()==1){
            ret = "1 item ("+sum+" kg)";
        } else {
            ret = this.items.size()+" items ("+sum+" kg)";
        }
        return ret;
    }
    
    public void printItems(){
        for (Item item:this.items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        int m = this.items.get(0).getWeight();
        Item ret = this.items.get(0);
        for (Item item:this.items){
            if (item.getWeight()>m){
                m=item.getWeight();
                ret = item;
            }
        }
        return ret;
    }
}

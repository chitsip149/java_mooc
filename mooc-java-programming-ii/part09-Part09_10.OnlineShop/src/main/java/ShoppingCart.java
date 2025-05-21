/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.Map;
import java.util.HashMap;
public class ShoppingCart {
    private Map<String, Item> items;
    public ShoppingCart(){
        this.items = new HashMap<>();
    }
    
    public void add (String product, int price){
        Item item = this.items.get(product);
        if (item==null){
            this.items.put(product, new Item(product, 1, price));

        } else {
            item.increaseQuantity();
        }
    }
    
    public int price(){
        int sum = 0;
        for (Item item:this.items.values()){
            sum+=item.price();
        }
        return sum;
    }
    
    public void print(){
        for (Item item:this.items.values()){
            System.out.println(item);
        }
    }
}

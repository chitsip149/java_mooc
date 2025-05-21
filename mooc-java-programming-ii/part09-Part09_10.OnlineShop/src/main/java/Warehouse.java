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
import java.util.Set;
public class Warehouse {
    private Map<String, Integer> map;
    private Map<String, Integer> mapStock;
    public Warehouse(){
        this.map = new HashMap<>();
        this.mapStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.map.put(product, price);
        this.mapStock.put(product, stock);
    }
    
    public int price(String product){
        Integer ret = this.map.get(product);
        
        if (ret!=null){
            return ret;
        }
        return -99;
    }
    
    public int stock(String product){
        Integer stock = this.mapStock.get(product);
        if (stock==null){
            return 0;
        }
        return stock;
    }
    
    public boolean take(String product){
        int stock = this.stock(product);
        if (stock>0){
            this.mapStock.put(product, stock-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.map.keySet();
    }
}

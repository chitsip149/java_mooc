/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
//    double balance;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.balance = initialBalance;
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(this.balance);
        
    }
    
    public String history(){
        return this.changeHistory.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.changeHistory.add(this.balance);
        
    }
    
    public double takeFromWarehouse(double amount){
        double ret = super.takeFromWarehouse(amount);
        this.changeHistory.add(this.balance);
        return ret;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.changeHistory.toString());
        System.out.println("Largest amount of product: "+this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: "+this.changeHistory.minValue());
        System.out.println("Average: "+this.changeHistory.average());
    }
    
    
}

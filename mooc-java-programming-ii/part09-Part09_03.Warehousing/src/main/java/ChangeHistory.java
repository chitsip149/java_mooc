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
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add (double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    @Override
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        
        double m = 0;
        for (double value: this.history ){
            if (value>m){
                m=value;
            }
        }
        return m;
    }
    
    public double minValue(){
        if (this.history.isEmpty()) {
            return 0;
        }
        double m = this.history.get(0);
        for (double value:this.history){
            if (value<m){
                m=value;
            }
        }
        return m;
    }
    
    public double average(){
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum=0;
        for (double value:this.history){
            sum+=value;
        }
        return sum/this.history.size();
    }
}

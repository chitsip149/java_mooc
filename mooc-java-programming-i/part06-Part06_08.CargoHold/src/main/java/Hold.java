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

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int weight){
        this.maximumWeight = weight;
        this.suitcases = new ArrayList<>();
    }
    
    public int totalWeight(){
        int sum = 0;
        for (Suitcase addedSuitcase:this.suitcases){
            sum+=addedSuitcase.totalWeight();
        }
        return sum;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int sum = this.totalWeight();
        if (sum+suitcase.totalWeight()<=this.maximumWeight){
            suitcases.add(suitcase);
        }
    }
    
    @Override
    public String toString(){
        int sum = this.totalWeight();
        String ret = "";
        if (this.suitcases.size()==0){
            ret = "no suitcases (0 kg)";
        } else if (this.suitcases.size()==1){
            ret = "1 suitcase ("+sum+" kg)";
        } else {
            ret = this.suitcases.size()+" suitcases ("+sum+" kg)";
        }
        return ret;
    }
    
    public void printItems(){
        for (Suitcase suitcase:this.suitcases){
            suitcase.printItems();
        }
    }
}

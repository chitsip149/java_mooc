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

public class Package {
    private ArrayList<Gift> list;
    
    public Package(){
        list = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.list.add(gift);
    }
    
    public int totalWeight(){
        int sum=0;
        for (Gift gift:this.list){
            sum+=gift.getWeight();
        }
        return sum;
    }
}

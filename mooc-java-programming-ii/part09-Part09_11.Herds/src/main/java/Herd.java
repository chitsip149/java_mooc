/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    private List<Movable> list;
    public Herd(){
        this.list = new ArrayList<>();
    }
    @Override
    public String toString(){
        String ret="";
        int cnt=0;
        for (Movable item: this.list){
            if (cnt!=0){
                ret+="\n";
            }
            ret+=item.toString();
            cnt++;
        }
        return ret;
    }
    
    public void addToHerd(Movable movable){
        this.list.add(movable);
    }
    
    public void move (int dx, int dy){
        for (Movable item:this.list){
            item.move(dx, dy);
        }
    }
}

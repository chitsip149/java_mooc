/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Container {
    private int contain;
    public Container(){
        this.contain=0;
    }
    
    public int contains(){
        return this.contain;
    }
    
    public void add (int amount){
        if (amount<0) return;
        if (this.contain+amount<=100){
            this.contain+=amount;
        } else {
            this.contain=100;
        }
    }
    
    public void remove (int amount){
        if (amount<0) return;
        if (this.contain>=amount){
            this.contain-=amount;
        } else {
            this.contain=0;
        }
    }
    
    @Override 
    public String toString(){
        return this.contain+"/100";
    }
}

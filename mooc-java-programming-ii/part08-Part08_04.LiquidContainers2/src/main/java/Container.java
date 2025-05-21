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
    private int contains ;
    
    public Container(){
        this.contains=0;
    }
    
    public int contains(){
        return this.contains;
    }
    
    public void add (int amount){
        if (amount<0){
            return;
        }
        if (this.contains+amount<=100){
            this.contains+=amount;
        } else {
            this.contains=100;
        }
    }
    public void remove(int amount){
        if (amount<0){
            return;
        }
        if (this.contains<amount){
            amount=this.contains;
        }
        this.contains-=amount;
    }
    
    public String toString(){
        return this.contains+"/100";
    }
}

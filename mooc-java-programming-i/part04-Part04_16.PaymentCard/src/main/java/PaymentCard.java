/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance){
        this.balance = balance;
    }
    
    public void eatAffordably(){
        if (this.balance>=2.6) this.balance-=2.6;
    }
    
    public void eatHeartily(){
        if (this.balance>=4.6) this.balance-=4.6;
    }
    
    public void addMoney(double amount){
        if (amount>=0) this.balance+=amount;
        if (this.balance>150){
            this.balance=150;
        }
    }
    
    public String toString(){
        return "The card has a balance of "+balance+ " euros";
    }
}

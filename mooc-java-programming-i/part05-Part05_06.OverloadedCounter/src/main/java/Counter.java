/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Counter {
    private int number;
    
    public Counter(int startValue){
        this.number = startValue;
    }
    
    public Counter(){
        this(0);
    }
    
    public int value(){
        return this.number;
    }
    
    public void increase(){
        this.number+=1;
    }
    
    public void decrease(){
        this.number-=1;
    }
    
    public void increase(int increaseBy){
        if (increaseBy>=0) this.number+=increaseBy;
    }
    
    public void decrease (int decreaseBy){
        if (decreaseBy>=0) this.number-=decreaseBy;
    }
    
}

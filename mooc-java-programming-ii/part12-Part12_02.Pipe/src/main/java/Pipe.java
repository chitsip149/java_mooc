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
public class Pipe<T> {
    private ArrayList<T> elements;
    
    public Pipe(){
        this.elements = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.elements.add(value);
    }
    
    public T takeFromPipe(){
        if (this.elements.isEmpty()){
            return null;
        }
        T ret = this.elements.get(0);
        this.elements.remove(0);
        return ret;
    }
    
    public boolean isInPipe(){
        if (this.elements.isEmpty()){
            return false;
        }
        return true;
    }
}

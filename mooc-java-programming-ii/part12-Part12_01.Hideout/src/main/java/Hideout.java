/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Hideout<T> {
    T hidden;
    public Hideout(){
        hidden = null;
    }
    public void putIntoHideout(T toHide){
        hidden = toHide;
    }
    
    public T takeFromHideout(){
        T ret = hidden;
        hidden = null;
        return ret;
    }
    
    public boolean isInHideout(){
        if (this.hidden==null) {
            return false;
        }
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Pair<K,V> {
    private K key;
    private V value;
    
    public Pair(){
        this.key = null;
        this.value = null;
    }
    
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    public K getKey(){
        return this.key;
    }
    
    public V getValue(){
        return this.value;
    }
    
    public void setValue(V value){
        this.value = value;
    }
}

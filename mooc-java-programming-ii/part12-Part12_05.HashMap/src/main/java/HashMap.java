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
public class HashMap<K, V> {
    private ArrayList<Pair<K, V>> list;
    
    public HashMap(){
        this.list = new ArrayList<>();
    }
    
    public void add(K key, V value){
        boolean isIn = false;
        for (Pair p: this.list){
            if (p.getKey().equals(key)){
                isIn = true;
                p.setValue(value);
            }
        }
        if (!isIn){
            Pair newPair = new Pair(key, value);
            this.list.add(newPair);
        }
    }
    
    public V get(K key){
        
        for (Pair p: this.list){
            if (p.getKey().equals(key)){
                return (V) p.getValue();
            }
        }
        return null;
    }
    
    public V remove(K key){
        Pair<K, V> ret = new Pair();
        for (Pair p:this.list){
//            System.out.println(p.getKey());
            if (p.getKey().equals(key)){
                ret = p;
                break;
            }
        }
//        System.out.println(ret.getKey());
//        System.out.println(ret.getValue());
        if (ret.getKey()!=null){
            this.list.remove(ret);
            return ret.getValue();
        }
        return null;
    }
}

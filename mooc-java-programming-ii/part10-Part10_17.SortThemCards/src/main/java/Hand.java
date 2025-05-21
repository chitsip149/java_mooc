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
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add (Card card){
        this.cards.add(card);
    }
    
    public void print(){
        Iterator<Card> iterator = this.cards.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }
    
    public int getSum(){
        int sum = 0;
        Iterator<Card> iterator = this.cards.iterator();
        while (iterator.hasNext()){
            sum+=iterator.next().getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand hand){
        return (this.getSum()-hand.getSum());
    }
    
    public void sortBySuit(){
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}

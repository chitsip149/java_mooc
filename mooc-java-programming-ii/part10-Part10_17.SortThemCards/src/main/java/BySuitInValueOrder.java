/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.Comparator;
public class BySuitInValueOrder implements Comparator<Card> {
    
    public int compare(Card c1, Card c2){
        if (c1.getSuit()!=c2.getSuit()){
            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        }
        return c1.getValue() - c2.getValue();
    }
    
    
}

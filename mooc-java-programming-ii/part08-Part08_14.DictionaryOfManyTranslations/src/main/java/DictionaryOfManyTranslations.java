/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    public void add (String word, String translation){
        ArrayList <String> list = this.dictionary.get(word);
        if (list==null){
            list = new ArrayList<>();
            list.add(translation);
            this.dictionary.put(word, list);
        } else {
            list.add(translation);
        }
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> list = this.dictionary.get(word);
        if (list==null){
            return new ArrayList<>();
        }
        return list;
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author minht
 */
import java.util.HashMap;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.PrintWriter;

public class SaveableDictionary {
    private HashMap<String, String> dictionary1;
    private HashMap<String, String> dictionary2;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary1 = new HashMap<>();
        this.dictionary2 = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary1 = new HashMap<>();
        this.dictionary2 = new HashMap<>();
        this.file = file;
    }
    
    public boolean load(){
        try {
            Files.lines(Paths.get(file)).
                    map(line -> line.split(":")).
                    forEach(parts -> {
                        this.add(parts[0], parts[1]);
                    });
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public void add(String words, String translation){
        String trans = this.dictionary1.get(words);
        if (trans==null){
            this.dictionary1.put(words, translation);
            this.dictionary2.put(translation, words);
        }
    }
    
    public String translate(String word){
        String ret = this.dictionary1.get(word);
        if (ret==null){
            ret = this.dictionary2.get(word);
        }
        return ret;
    }
    
    public void delete (String word){
        if (this.dictionary1.keySet().contains(word)){
            String trans = this.dictionary1.get(word);
            this.dictionary1.remove(word);
            this.dictionary2.remove(trans);
            
        }
        if (this.dictionary2.keySet().contains(word)){
            String trans = this.dictionary2.get(word);
            this.dictionary2.remove(word);
            this.dictionary1.remove(trans);
        }
    }
    
    public boolean save(){
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String word:this.dictionary1.keySet()){
                writer.println(word+":"+dictionary1.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}

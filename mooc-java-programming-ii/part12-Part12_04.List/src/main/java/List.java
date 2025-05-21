/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class List<T> {
    private T[] array;
    int index;
    
    
    public List(){
        this.array = (T[]) new Object[10];
        this.index = 0;
    }
    
    public void add (T value){
        if (index==this.array.length){
            grow();
        }
        this.array[this.index]=value;
        index++;
    }
    
    private void grow(){
        int newSize = this.array.length + this.array.length/2;
        T[] newArray = (T[]) new Object[newSize];
        for (int i=0; i<this.array.length; i++){
            newArray[i]=this.array[i];
        }
        this.array = newArray;
    }
    
    public boolean contains(T value){
        if (this.indexOfValue(value)>=0){
            return true;
        }
        return false;
    }
    
    public void remove(T value){
        int idx = this.indexOfValue(value);
        if (idx!=-1){
            this.moveToTheLeft(idx);
            index--;
        }
    }
    
    private int indexOfValue (T value){
        for (int i=0; i<index; i++){
            if (this.array[i]==value || this.array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    
    
    private void moveToTheLeft(int fromIndex){
        for (int i=fromIndex; i<index-1; i++){
            this.array[i]=this.array[i+1];
        }
    }
    
    public T value(int index){
        if (index<0 || index>=this.index){
            throw new ArrayIndexOutOfBoundsException("out of bounds");
        }
        return this.array[index];
    }
    
    public int size(){
        return this.index;
    }
    
    
    
}

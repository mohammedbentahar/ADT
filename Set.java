/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import java.util.ArrayList;

/**
 *
 * @author moham
 */
public class Set {
    
    private static final int CAPACITE_INITIALE = 10;
    private static final int INCREMENT = 10;
    
    ArrayList<Object> elements = new ArrayList<>();
    
    public Set(Object obj ){
        elements.add(obj);
    }

    
    public void add (Object obj){
        if(!contains(obj)){
            elements.add(obj);
        }       
    }
    
    public int getNbrElements(){
        return elements.size();
    }
    
    public void remove(Object obj ){
        if(contains(obj)){
            elements.remove(obj);
        }
        
    }
    
    public boolean contains(Object obj){
        return elements.contains(obj);
    }
    
    public void clear(){
        elements.clear();
    }
    
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    
    public void print(){
        elements.forEach(element -> System.out.println(element));
    }
    
    
   
}

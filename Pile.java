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
public class Pile {
    ArrayList<Object> elements = new ArrayList<>();
    
    public Pile(Object elem){
        enfiler(elem);
    }    
    public int getNbrElements(){
        return elements.size();
    }

    public boolean estVide(){
        return elements.isEmpty();
    }
    public Object consulterDebut(){
        return elements.get(elements.size()-1);
    }
    
    public void enfiler(Object elem){
        elements.add(elem);
    }
    public Object defiler(){
        return elements.remove(elements.size()-1);
    }
    
    public void print(){
        System.out.println("----------");
        elements.forEach(elem ->System.out.println(elem));
        System.out.println("----------");
    }
    
    public void vide(){
        elements.clear();
    }
}

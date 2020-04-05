/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author moham
 */
public class Filesimple {

    ArrayList<Object> elements = new ArrayList<>();
    
   public Filesimple(){
       
   }
   public Filesimple(Object elem){
       elements.add(elem);
       
   }
   public int getNbrElements() {
      return elements.size();
   }

   public boolean estVide() {
      return elements.isEmpty();
   }
   
  
   public Object consulterDebut() {   
       return elements.get(0);
 
   }

  
   public void enfiler(Object elem) {
       elements.add(elem);

   }

  
   public Object defiler() {
       return elements.remove(0);
   }


   public void vider() {
    elements.clear();
   }
    public void print(){
        System.out.println("\n----------");
        elements.forEach(elem ->System.out.println(elem));
        System.out.println("----------\n");
    }
    
    public void enfiler(Object [] elem){
        this.elements.addAll(Arrays.asList(elem));
    }
    public Object [] defiler(int taille){
        Object[] e = elements.subList(0, taille).toArray();
        for (int i = 0 ; i < taille ; i++)
            defiler();
        return e;
    }
}

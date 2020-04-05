/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;
import java.util.NoSuchElementException;

public class ListeCycle {
 
    private Maillon debut;
    private int nbrElements;

  
   public boolean estVide() {
      return this.nbrElements == 0; 
   }


   public int taille() { 
      return this.nbrElements; 
   }

   public Object getElement(int pos) { 
        if (pos < 0 || pos > nbrElements - 1) {
         throw new NoSuchElementException();
      }
      return positionner(pos).element;
   }

   
   public Object getElementDebut() {  
       if(!estVide()){
           throw new NoSuchElementException();
       }
      return this.debut.element;
   }

   public Object getElementFin() {
      return positionner(taille()-1).element;
   }


   public void inserer(Object element) {
       Maillon tmp ;
       if(nbrElements == 0){
           tmp = new Maillon(element);
           debut=tmp;
           tmp.suivant=debut;
        }
       else{
            tmp = positionner(this.nbrElements-1);
            tmp.suivant= new Maillon (element,debut);
       }
       this.nbrElements ++;
   }

   public Object supprimer() {
       Object reponse = debut.element;
       Maillon tmp = positionner(this.nbrElements-1);
       tmp.suivant = debut.suivant;
       debut = debut.suivant;
        this.nbrElements --;
        return reponse; 
    }

   public void vider() {
       this.nbrElements = 0;
   }
   
   public void print(){
       System.out.println("\n ---- list de taille : "+this.nbrElements+" ----");
       Maillon tmp = debut;
       for (int i = 0 ; i < (this.nbrElements * 3 ) ; i++ ){
           System.out.println(tmp.element);
           tmp=tmp.suivant;
       } 
       System.out.println(" ---- Fin ---- \n");
   }
   
    private Maillon positionner(int i) {
      Maillon m = debut;

      for (int j = 0; j < i; j++) {
         m = m.suivant;
      }

      return m;
   }
    

    private class Maillon {

      private Object element; 
      private Maillon suivant; 
      public Maillon(Object element, Maillon suivant) {
         this.element = element;
         this.suivant = suivant;
      }

      public Maillon(Object element) {
         this(element, null);
      }
      
   
   }
    
}

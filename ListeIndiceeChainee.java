
package ADT;

import java.util.NoSuchElementException;

/**
 *
 * @author moham
 */
public class ListeIndiceeChainee {
    
    
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


   public void inserer(Object element, int pos) {
       Maillon tmp ;
       Maillon precedent ;
       Maillon suivante ;
       if( pos < 0 || pos > taille())
           throw new NoSuchElementException();
       if(pos == 0 && this.nbrElements == 0)
           debut = new Maillon(element, debut);
       
       if( pos == this.nbrElements){
           tmp = positionner(pos-1);
           tmp.suivant= new Maillon (element);
       }
       else{
           precedent = positionner(pos-1);
           precedent.suivant= new Maillon (element,precedent.suivant);
       }
       
       this.nbrElements ++;
   }


   public void insererDebut(Object element) {
      
      inserer(element,0);
   }

  
   public void insererFin(Object element) {
      
      inserer(element,this.nbrElements);
   }

   public Object supprimer(int pos) {
       if( pos < 0 || pos > taille())
           throw new NoSuchElementException();
        Object tmp = null ;
        Maillon precedent;
        Maillon suivant ;
       if(pos == 0){
            tmp = debut.element;
            debut = debut.suivant;

       }
       else{
           precedent = positionner(pos - 1);
           tmp = precedent.suivant.element;
           precedent.suivant = precedent.suivant.suivant;
       }
      this.nbrElements --;
      return tmp; 
   }


   public Object supprimerDebut() {

      return  supprimer(0) ;
   }

   
   public Object supprimerFin() {

      return  supprimer(taille()-1) ;
   }


   public void vider() {
       this.nbrElements = 0;
   }
   
    private Maillon positionner(int i) {
      Maillon m = debut;

      for (int j = 0; j < i; j++) {
         m = m.suivant;
      }

      return m;
   }

    private class Maillon {

      private Object element;  //element encapsule dans le maillon
      private Maillon suivant; //reference vers le maillon suivant

      
      public Maillon(Object element, Maillon suivant) {
         this.element = element;
         this.suivant = suivant;
      }

      public Maillon(Object element) {
         //utilisation du constructeur ci-dessus
         this(element, null);
      }
      
   
   }
    
}

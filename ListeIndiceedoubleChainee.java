/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import java.util.NoSuchElementException;

/**
 *
 * @author moham
 */
public class ListeIndiceedoubleChainee {
    
    private Maillon debut;
    private Maillon fin;
    private int nbrElements;
     
    public ListeIndiceedoubleChainee(){
        this.nbrElements = 0;
    }
    
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
        if(pos == 0 && this.nbrElements == 0){
            debut = new Maillon(element);
            fin = debut;
        }
        
        else if(pos == 0){
            debut = new Maillon(element,debut,null);
        }
            
        else if( pos == this.nbrElements ){
            fin.suivant = new Maillon (element, null, fin );
            fin = fin.suivant;
        }
        else{
            precedent = positionner(pos-1);
            tmp = new Maillon (element, precedent.suivant,  precedent);
            precedent.suivant = tmp;
            tmp.suivant.precedent = tmp;

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
        if( pos < 0 || pos > taille()|| taille() == 0 )
            throw new NoSuchElementException();
        Object tmp = null ;
        Maillon precedent;
        if(pos == 0){
            tmp = debut.element;
            debut = debut.suivant;
            debut.precedent = null;
        }
        else if( pos == (this.nbrElements - 1 )){
             tmp = fin.element;
             fin = fin.precedent;
             fin.suivant = null;
        }
        else{
           precedent = positionner(pos - 2);
           tmp = precedent.suivant.element;
           precedent.suivant = precedent.suivant.suivant;
           precedent.suivant.precedent =  precedent ;
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
       debut = null ;
       fin = null;
   }
    
    
    public void printAr(){
        Maillon tmp = fin;
        while(tmp != null){
            System.out.println(tmp.element.toString());
            tmp = tmp.precedent;
        }
    }
    
    public void print(){
        Maillon tmp = debut;
        while(tmp != null){
            System.out.println(tmp.element.toString());
            tmp = tmp.suivant;
        }
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
        private Maillon precedent;
      
      public Maillon(Object element, Maillon suivant, Maillon precedent ) {
        this.element = element;
        this.suivant = suivant;
        this.precedent = precedent;
      }

      public Maillon(Object element) {
         //utilisation du constructeur ci-dessus
         this(element, null,null);
      }
      
   
   }
}

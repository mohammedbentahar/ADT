/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author moham
 */
public class main {
    
    public static void main(String[] args) {
        testListeDouble();
        

    }
    public static  Stack mai(Stack s){
        
        Stack<Integer> p2 = new Stack<>();
        Queue<Integer> f = new LinkedList<>();
        
        while(! s.isEmpty()){
            f.add((int)s.pop());
        }         
        for( int i = 0 ; i < f.size(); i++){
            if(f.peek() % 2 == 1)
                p2.push(f.poll());
            else {
                f.add(f.poll());
            }
        }
        System.out.println("f+ size : "+f.toString());
        
        while(! f.isEmpty()){
            p2.push(f.poll());
        }
        while( !p2.empty() ){
            s.push(p2.pop());
        }
            
        
        return s;
    }
    public static void TestDeque(){
        DoubleEndedFile D1 = new DoubleEndedFile(5);
        D1.addLast(6);
        D1.addLast(7);
        D1.addFirst(4);
        D1.addFirst(3);
        D1.addFirst(2);
        D1.addFirst(1);
        D1.print();
        System.out.println("delete 2 first 3 laste");
        D1.removeFirst();
        D1.removeFirst();
        D1.removeLast();
        D1.removeLast();
        D1.removeLast();
        D1.print();
        System.out.println("clear");
        D1.clear();
        System.out.println("est vide : "+ D1.estVide());
    }
    public static void FileSimpleTest(){
        
       Filesimple F1 = new Filesimple(1);
       F1.enfiler(2);
       F1.enfiler(3);
       F1.enfiler(4);
       F1.enfiler(5);
       F1.enfiler(6);
       F1.print();
       F1.defiler();
       F1.defiler();
       System.out.println("taille "+F1.getNbrElements());
       F1.print();
       Object [] t = {7,8,9,10};
       F1.enfiler(t);
       System.out.println("taille + 7-10   "+F1.getNbrElements());
       F1.print();
       Object [] F = F1.defiler(3);
       System.out.println("taille apres def 3   "+F1.getNbrElements());
       F1.print();
       System.out.println("remouve  "+F1.defiler());
       System.out.println("remouve  "+F1.defiler());
       System.out.println("remouve  "+F1.defiler());
       
    }
    public static void PileTest(){
       Pile P1 = new Pile(1);
       P1.enfiler(2);
       P1.enfiler(3);
       P1.enfiler(4);
       P1.enfiler(5);
       P1.enfiler(6);
       P1.print();
       P1.defiler();
       P1.defiler();
       System.out.println("taille "+P1.getNbrElements());
       P1.print();
       
    }   
    public static void ListeCycleTest(){
        ListeCycle L1 = new ListeCycle();
        L1.inserer(1);
        L1.inserer(2);
        L1.inserer(3);
        L1.inserer(4);
        L1.inserer(5);
        L1.print();
        L1.supprimer();
        L1.supprimer();
        L1.print();
        
       
    }
    public static void setTest(){
        Set S1 = new Set(1);
        S1.add(1);
        S1.add(3);
        S1.add(8);
        S1.add(3);
        S1.add(30);
        S1.add(300);
        S1.print();
        System.out.println("taille : "+S1.getNbrElements());
        S1.remove(8);
        S1.print();
        System.out.println("isEmpty : "+S1.isEmpty());
        S1.clear();
        System.out.println("isEmpty : "+S1.isEmpty());
    }
    public static void testListeDouble(){
        ListeIndiceedoubleChainee L = new ListeIndiceedoubleChainee();
        L.insererDebut(1);
        L.insererFin(2);
        L.insererFin(3);
        L.insererFin(4);
        L.insererFin(5);
        L.inserer(100,3);
        System.out.println("-------------------");
        L.print();
        L.insererDebut(0);
        System.out.println("-------------------");
        L.print();
        System.out.println("-------------------");
        System.out.println("*****  : "+ L.supprimerDebut().toString());
        System.out.println("*****  : "+ L.supprimerFin().toString());
        System.out.println("-------------------");
        L.print();
        System.out.println("-------------------");
        L.supprimer(3);
        L.print();
        System.out.println("-------------------");
        L.printAr();
        }
    }
    


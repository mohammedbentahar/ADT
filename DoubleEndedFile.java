
package ADT;

import java.util.ArrayList;

/**
 *
 * @author moham
 */
public class DoubleEndedFile {
    ArrayList<Object> elements = new ArrayList<>();
    
    public DoubleEndedFile(){
        
    }
    public DoubleEndedFile( Object elem){
        elements.add(elem);
    }
    public void addFirst(Object elem){
        elements.add(0, elem);
    }

    public void addLast(Object elem){
        elements.add(elem);
    }
    
    public void print(){
        System.out.println("\n----------");
        elements.forEach(elem ->System.out.println(elem));
        System.out.println("----------\n");
    }
    
    public Object removeFirst(){
        return elements.remove(0);
    }
    
    public Object removeLast(){
        return elements.remove(elements.size()-1);
    }
    public Object getFirst(){
        return elements.get(0);
    }
    public Object getLast(){
        return elements.get(elements.size()-1);
    }
    
    public void clear(){
        elements.clear();
    }
    
    public boolean estVide(){
        return elements.isEmpty();
    }
}

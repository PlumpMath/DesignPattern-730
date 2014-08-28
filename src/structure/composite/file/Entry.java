/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.composite.file;

/**
 *
 * @author dengxt
 */
public abstract class Entry {
    
    abstract int getSize();
    
    abstract String getName();
    
    public Entry add(Entry entry) throws Exception{
        
        throw new Exception("Only support directory.");
    }
    
    public void printList(){
        printList("");
    }
    
    public void printList(String prefix){
        
    }
}

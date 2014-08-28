/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.file;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author dengxt
 */
public class Directory extends Entry{
    
    private Collection<Entry> entries = new LinkedList<Entry>();;
    private String name;
    
    public Directory(String name){
        this.name = name;
    }
    
    @Override
    int getSize() {
        if(entries == null || entries.size() == 0){
            return 0;
        }
        
        int size = 0;
        
        for(Entry entry : entries){
            size += entry.getSize();
        }
        
        return size;
    }

    @Override
    String getName() {
        
        return name;
    }
    
    @Override
    public Entry add(Entry entry){
        
        entries.add(entry);
        
        return this;
    }
    
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    
    public void printList(String prefix){
        System.out.println(prefix + '/'+this);
        for(Entry entry : entries){
            entry.printList(prefix+'/'+ name);
        }
    }
    
    
    public String toString(){
        return name +" ("+ getSize()+")";
//        StringBuilder builder = new StringBuilder();
//        builder.append('/').append("name");
//        
//        if(this.entries == null || this.entries.size() == 0){
//            return builder.toString();
//        }
//        
//        for(Entry entry : entries){
//            builder.append('\n').append('\t').append(entry.toString());
//        }
//        
//        return builder.toString();
    }

    public Collection getEntries() {
       return this.entries;
    }
}

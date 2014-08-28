/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.file;

import java.util.Collection;

/**
 *
 * @author dengxt
 */
public class ListVisitor implements Visitor{
    
    /** Current Path */
    private String prefix = "";
    
    @Override
    public void visit(File file) {
        System.out.println(prefix + '/'+ file);
    }

    @Override
    public void visit(Directory dir) {
        
        String name = dir.getName();
        System.out.println(prefix + '/'+dir);
        
        Collection<Entry> entries = dir.getEntries();
        for(Entry entry : entries){
            entry.printList(prefix+'/'+name);
        }
    }
    
}

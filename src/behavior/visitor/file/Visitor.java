/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.file;

/**
 *
 * @author dengxt
 */
public interface Visitor {
    
    public void visit(File file);
    
    public void visit(Directory dir);
}

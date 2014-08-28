/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.builder.textview;

/**
 *
 * @author dengxt
 */
public interface Builder {
    
    public void makeTitle(String text);
    
    public void makeBody(String text);
    
    public void makeSignature(String text);
    
    public String text();
    
}

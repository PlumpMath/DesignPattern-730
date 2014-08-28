/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.adaptor.stack;

/**
 *
 * @author dengxt
 */
public interface Stack <T>{
    
    T top();
    
    T pop();
    
    void  push(T t);
}

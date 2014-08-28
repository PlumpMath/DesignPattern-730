/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.absfactory;

/**
 * As far as the Abstract Factory is concerned, the product gets returned immediately.
 * @author dengxt
 */
public interface AbstractFactory<T> {
    
    T get(Class<? extends T> t);
}

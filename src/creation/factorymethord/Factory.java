/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.factorymethord;

/**
 *
 * @author dengxt
 */
public class Factory <T> {
  
  public static <E> Factory<E> getFactory() {
    return new Factory<E>();
  }
} // End class Foo

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.adaptor.stack;

/**
 *
 * @author dengxt
 */
public class DListImpStack <T> extends DList<T> implements Stack<T>
 {
	public void push (T t) {
            insertTail (t);
	}

	public T pop () {
            return removeTail ();
	}

	public T top () {
            return getTail ();
	}
 }

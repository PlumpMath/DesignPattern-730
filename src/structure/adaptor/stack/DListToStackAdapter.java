/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.adaptor.stack;

/**
 *
 * @author dengxt
 */
public class DListToStackAdapter<T> implements Stack<T> {

    private DList<T> m_List;

    public DListToStackAdapter(DList<T> m_List) {
        this.m_List = m_List;
    }

    public void push(T t) {
        m_List.insertTail(t);
    }

    public T pop() {
        return m_List.removeTail();
    }

    public T top() {
        return m_List.getTail();
    }
}

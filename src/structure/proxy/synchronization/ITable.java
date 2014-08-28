/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.synchronization;

/**
 *
 * @author dengxt
 */
interface ITable {

    public Object getElementAt(int row, int column);

    public void setElementAt(Object element, int row, int column);

    public int getNumberOfRows();
}

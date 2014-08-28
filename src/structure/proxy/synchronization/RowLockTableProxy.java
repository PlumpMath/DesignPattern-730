/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.synchronization;

/**
 * A row-lock table implementation.
 * Provides multiple accesses to a target object. As the Table which we could not find its source code
 * and has not capability to allow clients to lock individual table rows.
 * 
 * So proxy is implemented for synchronized way to access table.
 * @author dengxt
 */
public class RowLockTableProxy implements ITable {

    private Table realTable;
    private Integer[] locks;

    public RowLockTableProxy(Table toLock) {

        realTable = toLock;

        locks = new Integer[toLock.getNumberOfRows()];

        for (int row = 0; row < toLock.getNumberOfRows(); row++) {
            locks[row] = new Integer(row);
        }
    }

    public Object getElementAt(int row, int column) {
        synchronized (locks[row]) {
            return realTable.getElementAt(row, column);
        }
    }

    public void setElementAt(Object element, int row, int column) {
        synchronized (locks[row]) {
            realTable.setElementAt(element, row, column);
        }
    }

    public int getNumberOfRows() {
        return realTable.getNumberOfRows();
    }
}

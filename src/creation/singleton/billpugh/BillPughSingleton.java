/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.singleton.billpugh;

/**
 *
 * @author dengxt
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class LazyHolder {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.singleton.perfact;

import java.io.Serializable;

/**
 *
 * @author dengxt
 */
public class DemoSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private DemoSingleton() {
        // private constructor
    }

    private static class DemoSingletonHolder {

        public static final DemoSingleton INSTANCE = new DemoSingleton();
    }

    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    //This method will be invoked when you will de-serialize the object. 
    //Inside this method, you must return the existing instance to ensure single instance application wide.
    protected Object readResolve() {
        return getInstance();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.singleton.eager;

/**
 *
 * @author dengxt
 */
public class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    //double-checked locking -> Multi thread version.
    public static EagerSingleton getInstance() {
         if (instance == null) {

            synchronized (EagerSingleton.class) {

                if (instance == null) {
                    instance = new EagerSingleton();
                }
            }
        }

        return instance;
    }

    
    
//  Single thread version.
//  public static EagerSingleton getInstance() {
//            return instance;
//    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.dynamic;

/**
 *
 * @author dengxt
 */
public class RealDBService implements IDBService {

    @Override
    public void storeIntoDB(String content) {
       System.out.println("Store data into DB.");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.proxy.cache;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Keep same interface.
 * @author dengxt
 */
public class TimeCostCalculator implements Calculator {
    
    @Override
    public int calculate(){
        try {
            Thread.sleep(10000);
            return 0;
        } catch (InterruptedException ex) {
            Logger.getLogger(TimeCostCalculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}

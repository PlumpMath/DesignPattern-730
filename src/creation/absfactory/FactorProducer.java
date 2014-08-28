/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.absfactory;

import creation.absfactory.color.Color;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dengxt
 */
public class FactorProducer <T extends AbstractFactory>{
    
    private static HashMap<Class, AbstractFactory> FACTORY = new HashMap<Class, AbstractFactory>();
    
    public static AbstractFactory getFactory(Class<? extends AbstractFactory> t) {
        
        try {
            AbstractFactory factory = FACTORY.get(t);
            if(factory == null){
                factory = t.newInstance();
                FACTORY.put(t, factory);
            }
            
            return factory;
        } catch (InstantiationException ex) {
            Logger.getLogger(FactorProducer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FactorProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

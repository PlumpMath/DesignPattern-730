/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.absfactory;

import creation.absfactory.color.Color;
import java.util.HashMap;

/**
 * 
 * @author dengxt
 */
public class ColorFactory implements AbstractFactory<Color>{
    
    private static HashMap<Class, Color> COLORS = new HashMap<Class, Color>();
    
    @Override
    public Color get(Class<? extends Color> t) {
        
        try {
            Color color = COLORS.get(t);
            if(color == null){
                color = t.newInstance();
                COLORS.put(t, color);
            }
            
            return color;
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        }
        
        return null;
    }
   
}

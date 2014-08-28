/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.absfactory;

import creation.absfactory.shape.Shape;
import java.util.HashMap;

/**
 *
 * @author dengxt
 */
public class ShapeFactory implements AbstractFactory<Shape> {
   
    private static HashMap<Class, Shape> SHAPES = new HashMap<Class, Shape>();
    
    @Override
    public Shape get(Class<? extends Shape> t) {
        
        try {
            Shape shape = SHAPES.get(t);
            if(shape == null){
                shape = t.newInstance();
                SHAPES.put(t, shape);
            }
            
            return shape;
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        }
        
        return null;
    }
   
}

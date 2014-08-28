/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.absfactory;

import creation.absfactory.color.Color;
import creation.absfactory.color.Red;
import creation.absfactory.shape.Circle;
import creation.absfactory.shape.Shape;

/**
 *
 * @author dengxt
 */
public class Demo {
    
    public static void main(String[] args){
    
        AbstractFactory<Color> colorFactory = FactorProducer.getFactory(ColorFactory.class);
        Color red =  colorFactory.get(Red.class);
        red.fill();
        
        red =  colorFactory.get(Red.class);
        red.fill();
        
        AbstractFactory<Shape> shapeFactory = FactorProducer.getFactory(ShapeFactory.class);
        Shape circle =  shapeFactory.get(Circle.class);
        circle.draw();
        
        circle =  shapeFactory.get(Circle.class);
        circle.draw();
    }
}

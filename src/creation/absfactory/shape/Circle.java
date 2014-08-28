/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.absfactory.shape;

/**
 *
 * @author dengxt
 */
public class Circle implements Shape {

    public Circle(){
        System.out.println("Circle Shape Created.");
    }
    
    @Override
    public void draw() {
        System.out.println("Circle Draw is Done.");
    }
}

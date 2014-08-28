/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creation.absfactory.color;

/**
 *
 * @author dengxt
 */
public class Red implements Color{

    public Red(){
        System.out.println("Red Color Created.");
    }
    @Override
    public void fill() {
        System.out.println("Fill Red Color.");
    }
}

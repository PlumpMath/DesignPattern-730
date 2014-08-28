/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.docommand;

import behavior.command.ICommand;
import creation.absfactory.color.Color;
import creation.absfactory.shape.Shape;

/**
 *
 * @author dengxt
 */
public interface IDrawShape<P,R> extends ICommand{
    
    public void setShape();
    
    public void setSize();
    
    public void setLocation();
    
    public void setColor();
}

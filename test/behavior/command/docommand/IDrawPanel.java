/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.docommand;

import behavior.command.IReceiver;

/**
 *
 * @author dengxt
 */
public interface IDrawPanel<P,R> extends IReceiver{
    
    public void drawCircle();
    
    public void drawSqual();
    
    public void drawRect();
    
    public void drawTrig();
}

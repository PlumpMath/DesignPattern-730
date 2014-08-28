/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.docommand;

import behavior.command.IInvoker;

/**
 *
 * @author dengxt
 */
public interface IDrawTool<P,R> extends IInvoker{
    
    public void fillColor();
    
    public void adjustSize();
    
    public void drawShape();
    
    public void fixPoint();
}

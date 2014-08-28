/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.docommand;

import behavior.command.ICommand;
import java.util.ArrayList;

/**
 *
 * @author dengxt
 */
public class DrawInCrayon implements IDrawTool{
    
    ArrayList<IDrawShape> list = new ArrayList<IDrawShape>();
    
    
    @Override
    public void fillColor() {
        
    }

    @Override
    public void adjustSize() {
        
    }

    @Override
    public void drawShape() {
        
    }

    @Override
    public void fixPoint() {
        
    }

    @Override
    public void setCommand(ICommand command) {
        
    }

    @Override
    public Object getResult() throws IllegalStateException {
       return null;
    }

    @Override
    public void invoke() throws IllegalStateException {
        
    }

    @Override
    public void setParameter(Object parameter) {
        
    }
}

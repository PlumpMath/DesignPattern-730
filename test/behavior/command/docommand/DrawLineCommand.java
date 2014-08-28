/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.docommand;

import behavior.command.ICommand;
import behavior.command.IReceiver;
import creation.absfactory.color.Color;
import creation.absfactory.shape.Shape;

/**
 *
 * @author dengxt
 */
public class DrawLineCommand implements ICommand<Color, Shape>{

    //
    private Color color = null;
    //
    private IDrawPanel receiver = null;
    
    
    @Override
    public void setReceiver(IReceiver receiver) throws IllegalArgumentException {

    }

    @Override
    public void execute() throws IllegalStateException {
        receiver.execute();
    }

    @Override
    public void redo() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shape getResult() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setParameter(Color parameter) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.docommand;

import behavior.command.ICommand;
import behavior.command.IReceiver;
import behavior.command.IInvoker;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dengxt
 */
public class Demo {
    
    public Demo() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testMe(){
        
        IInvoker crayonPan = new DrawInCrayon();
        ICommand command = new DrawLineCommand();
        IReceiver receiver = new DrawingBoard();

        crayonPan.setCommand(command);
        command.setReceiver(receiver);
//        crayonPan.setParameter();
        
        crayonPan.invoke();
        
        System.out.println(crayonPan.getResult().toString());
    }
}
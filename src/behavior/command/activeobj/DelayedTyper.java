/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.activeobj;

/**
 *
 * @author dengxt
 */
public class DelayedTyper implements Command{
    private long delay;
    private char ch;
    private static ActiveObjEngine engine = new ActiveObjEngine();
    private static boolean stop = false;
    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

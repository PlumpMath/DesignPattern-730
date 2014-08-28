/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.activeobj;

import java.util.LinkedList;

/**
 * 
 * @author dengxt
 */
public class ActiveObjEngine {
    
    LinkedList<Command> commands = new LinkedList<Command>();
    
    public void addCommand(Command command){
        commands.add(command);
    }
    
    public void run(){
        while(!commands.isEmpty()){
            Command c = commands.removeFirst();
            c.execute();
        }
    }
}

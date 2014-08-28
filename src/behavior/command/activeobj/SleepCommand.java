/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.activeobj;

/**
 *
 * @author dengxt
 */
public class SleepCommand implements Command{

    private WakeupCommand wakeup = null;
    private ActiveObjEngine engine = null;
    private long sleepTime = 0;
    private long startTime = 0;
    private boolean started;
    
    public SleepCommand(long sleepTime, ActiveObjEngine engine, WakeupCommand wakeup){
        this.sleepTime = sleepTime;
        this.engine = engine;
        this.wakeup = wakeup;
    }
    
    @Override
    public void execute() {
        
        long currentTime = System.currentTimeMillis();
        if(!started){
            started = true;
            startTime = currentTime;
            engine.addCommand(this);
        }else if((currentTime - startTime) < sleepTime){
            engine.addCommand(this);
        }else{
            engine.addCommand(wakeup);
        }
    }
    
}

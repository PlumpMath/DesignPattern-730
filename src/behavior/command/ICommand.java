/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command;

/**
 *
 * @author dengxt
 */
public interface ICommand<P,R> {

     /**
     * Returns the result of this <code>ICommand</code> execution.
     * 
     * @return Result of this <code>ICommand</code> execution.
     * @throws IllegalStateException IReceiver was not set.
     * @throws IllegalStateException No result available.
     */
    public R getResult() throws IllegalStateException;

    /**
     * Sets the parameter required for the execution of the target <code>IReceiver</code>.
     * 
     * @param parameter Parameter required for the execution of the target  <code>IReceiver</code>.
     * @throws IllegalArgumentException <code>parameter</code> must not be null.
     */
    public void setParameter(P parameter) throws IllegalArgumentException;


    /**
     * Sets the <code>IReceiver</code> for this <code>ICommand</code>
     *
     * @param receiver to set
     * @throws IllegalArgumentException <code>receiver</code> must not be null.
     */
    public void setReceiver(IReceiver<P, R> receiver) throws IllegalArgumentException;
    
    /**
     * Executes the <code>ICommand</code>.
     *
     * @throws IllegalStateException <link>IReceiver</link> was not set.
     */
    public void execute() throws IllegalStateException;

    /**
     * Repeat the <code>ICommand</code>.
     * @throws IllegalStateException IReceiver was not set.
     * @throws IllegalStateException No <code>ICommand</code> was executed before.
     */
    public void redo()throws IllegalStateException;

    /**
     * Rollback/Undo the <code>ICommand</code>.
     * 
     * @throws IllegalStateException IReceiver was not set.
     * @throws IllegalStateException No <code>ICommand</code> was executed before.
     */
    public void undo()throws IllegalStateException;
}

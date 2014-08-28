/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command;

/**
 *
 * @author dengxt
 */
public interface IReceiver<P, R> {

    /**
     * Sets the input parameter required for the execution of this
     * <code>IReceiver</code>.
     *
     * @param parameter Parameter required for executing the <code>IReceiver</code>.
     * @throws IllegalArgumentException parameter must not be null.
     */
    public void setParameter(P parameter) throws IllegalArgumentException;

    /**
     * Returns result out of executing this <code>IReceiver</code>.
     *
     * @return Result out of executing this <code>IReceiver</code>.
     * @throws IllegalStateException No result available.
     */
    public R getResult() throws IllegalStateException;


    /**
     * Starts the execution of the <code>IReceiver</code>.
     *
     * @throws IllegalStateException Parameter not set.
     */
    public void execute() throws IllegalStateException;
}

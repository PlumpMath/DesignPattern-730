/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command;

/**
 *
 * @author dengxt
 */
public interface IInvoker<P, R> {

    /**
     * Sets the <code>ICommand</code> to start as result of executing the invoke method.
     *
     * @param command <code>ICommand</code> to set.
     */
    public void setCommand(ICommand<P, R> command);

    /**
     * Returns the result of the execution of the <code>ICommand</code>.
     *
     * @return Result of the execution of the <code>ICommand</code>.
     * @throws IllegalStateException  <code>ICommand</code> was not set
     * @throws IllegalStateException  No results available
     */
    public R getResult() throws IllegalStateException;


    /**
     * Starts the appropriate <code>ICommand</code>.
     *
     * @throws IllegalStateException  <code>ICommand</code> was not set
     */
    public void invoke() throws IllegalStateException;

    /**
     * Sets the parameter required for the execution of the target <code>ICommand</code>.
     *
     * @param parameter Parameter required for the execution of the target
     * <code>ICommand</code>.
     *
     * @throws IllegalArgumentException Underlying implementations will impose different preconditions on the parameter argument
     */
    public void setParameter(P parameter);
}

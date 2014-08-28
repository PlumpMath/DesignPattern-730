/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.order;

import behavior.command.IReceiver;

/**
 *
 * @author dengxt
 */
public class StockTrade<P,R> implements IReceiver{
    
    public void buy() {
        System.out.println("You want to buy stocks");
    }
    
    public void sell() {
        System.out.println("You want to sell stocks ");
    }

    @Override
    public void setParameter(Object parameter) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getResult() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute() throws IllegalStateException {
       
    }

}

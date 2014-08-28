/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.command.order;

import behavior.command.ICommand;
import behavior.command.IInvoker;
import java.util.ArrayList;

/**
 *
 * @author dengxt
 */
public class Agent implements IInvoker{
    //
    private ArrayList<Order>  ordersQueue = new ArrayList<Order>();


    @Override
    public Object getResult() throws IllegalStateException {
        return null;
    }

    @Override
    public void invoke() throws IllegalStateException {
        int size = ordersQueue.size() - 1;
        Order order = ordersQueue.remove(size);
        order.execute();
    }

    @Override
    public void setParameter(Object parameter) {
        
    }

    public void setCommand(Order order) {
        ordersQueue.add(order);
    }
    
    
    @Override
    public void setCommand(ICommand order) {
         if(order instanceof Order){
            ordersQueue.add((Order)order);
         }
    }

    void placeOrder(Order bsc) {
        
    }
}

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
public class SellStockOrder implements Order {
    
    private StockTrade stock;
    
    public SellStockOrder ( StockTrade st) {
        stock = st;
    }
    public void execute( ) {
        stock.sell( );
    }

    @Override
    public Object getResult() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setParameter(Object parameter) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setReceiver(IReceiver receiver) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redo() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() throws IllegalStateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

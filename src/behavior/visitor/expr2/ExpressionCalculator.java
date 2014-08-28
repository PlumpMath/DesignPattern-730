/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr2;

/**
 *
 * @author dengxt
 */
public class ExpressionCalculator<Numeric> implements ExpressionVisitor{

    @Override
    public Numeric visitIntExp(ExpInt e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Numeric visitAddExp(ExpAdd e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

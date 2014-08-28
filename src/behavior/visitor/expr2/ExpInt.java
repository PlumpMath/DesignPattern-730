/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr2;

/**
 *
 * @author dengxt
 */
public class ExpInt implements Expression{
    
    int value;
    
    @Override
    public void accept(ExpressionVisitor v) {
        v.visitIntExp(this);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr2;

/**
 * Refers: http://nice.sourceforge.net/visitor.html
 * http://nice.sourceforge.net/index.html
 * @author dengxt
 */
public class ExpAdd implements Expression {

    Expression e1, e2;
    
    @Override
    public void accept(ExpressionVisitor v) {
        v.visitAddExp(this);
    }
}

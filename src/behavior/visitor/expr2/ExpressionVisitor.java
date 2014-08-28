/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr2;

/**
 *
 * @author dengxt
 */
public interface ExpressionVisitor<T> {
    
    T visitIntExp(ExpInt e);
    
    T visitAddExp(ExpAdd e);
}

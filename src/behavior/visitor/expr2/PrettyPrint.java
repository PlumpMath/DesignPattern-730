/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr2;

/**
 *
 * @author dengxt
 */
public class PrettyPrint implements ExpressionVisitor {

    @Override
    public Object visitIntExp(ExpInt e) {
        System.out.print(e.value);
        return null;
    }

    @Override
    public Object visitAddExp(ExpAdd e) {
        e.e1.accept(this);
        System.out.print(" + ");
        e.e2.accept(this);
        return null;
    }
}

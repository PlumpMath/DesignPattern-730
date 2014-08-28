/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr;

/**
 *
 * @author dengxt
 */
public interface IVisitor <T>{
    
    void visitRuleStar(RuleStar star, String target, int index);
    
    void visitRuleChar(RuleChar star, String target, int index);
    
    void visitRuleDot(RuleDot star, String target, int index);
}

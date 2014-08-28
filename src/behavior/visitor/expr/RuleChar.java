/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr;

/**
 *
 * @author dengxt
 */
public class RuleChar extends IRule{
        
    	public static RuleChar newInstance(char c) {

		return new RuleChar(c);
	}

	/**
	 * Constructor for File.
	 * 
	 * @param primaryKey
	 * @param attributes
	 */
	private RuleChar(char c) {
		this.rule = c;
	}

        
    public boolean match(IVisitor v, String target, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

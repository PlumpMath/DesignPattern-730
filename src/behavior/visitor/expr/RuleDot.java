/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr;

/**
 *
 * @author dengxt
 */
public class RuleDot extends IRule{

    	private static final char RULE = '.';
	
	public static RuleDot newInstance() {
		
		return new RuleDot();
	}
	
	/**
	 * Constructor for File.
	 * @param primaryKey
	 * @param attributes
	 */
	private RuleDot() {
	}
    @Override
    public boolean match(IVisitor v, String target, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

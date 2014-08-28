/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.expr;

/**
 *
 * @author dengxt
 */
public abstract class IRule {
    
	protected IRule next;
	
	protected char rule;
    
    	static class Factory{
		
		public IRule buildRule(String pattern) {
                        
                        IRule head = null;
			IRule tail = null, next = null;
			for(int i = 0; i < pattern.length(); i++){
				char c = pattern.charAt(i);
                                
				switch(c){
				case '*':
					next = RuleStar.newInstance();
					break;
				case '.':
					next = RuleDot.newInstance();
					break;
				default:
					next = RuleChar.newInstance(c);
					break;
				}
                                
				if(head == null){
					head = tail = next;
				}else{
					tail.next = next;
					tail = tail.next;
				}
			}
			return head;
		}
		
	};

	public abstract boolean match(IVisitor v, String target, int index);
	
	public char rule(){
		
		return rule;
	}
	
	public IRule next(){
		
		return next;
	}
}

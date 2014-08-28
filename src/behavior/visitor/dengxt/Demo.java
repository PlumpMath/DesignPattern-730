package behavior.visitor.dengxt;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String pattern = "*.ABC";
		String target = "DEFABC";
		
		IRule rule = new IRule.Factory().buildRule(pattern);
		ImplMatchPattern matcher = new ImplMatchPattern();
		boolean match = matcher.visit(rule, target, 0);
                
                System.out.println(String.format("Pattern[%s] %s target[%s].\n", pattern, match? "match":"does not match", target));
                
		
//		ImplPrintPattern printer = new ImplPrintPattern();
//		String trace = printer.visit(rule, target, 0);
//		System.out.println(String.format("Pattern[%s] %s target[%s]. And trace is: \n", pattern, match? "match":"does not match", target, trace));
	}
        
        

}

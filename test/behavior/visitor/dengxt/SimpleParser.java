package behavior.visitor.dengxt;

public class SimpleParser{

    private static boolean ACCEPT = true;
    private static boolean REJECT = false;
    
    private String regex;
    private String candidate;
    
    /**
     * @param regex
    * @throws Exception 
     */
    public SimpleParser(String patternStr, String candidate){
        this.regex = patternStr;
        this.candidate = candidate;
        if (null == regex || null == candidate) {
        	throw new NullPointerException();
        }
    }
    
    public boolean parser(){
    	if (regex.length() == 0 && candidate.length() == 0) return true;
    	if (regex.length() == 0) return false;
		if (regex.charAt(0) == '^') return matchhere(regex, candidate, 1, 0);
		int rIndex = 0;
		int tIndex = 0;
		do { /* 即使字符串为空也必须检查 */
			if (matchhere(regex, candidate, rIndex, tIndex)) return true;
			tIndex++;
		} while (tIndex < candidate.length());
		return false;
	}
    
	/**
	 * 在candidate的开头查找regex
	 * 
	 * @param regex
	 * @param candidate
	 * @param rIndex
	 * @param cIndex
	 * @return
	 */
	public static boolean matchhere(String regex, String candidate, int rIndex, int cIndex) {
		if (rIndex == regex.length()) return true;
		if ((rIndex + 1) < regex.length() && regex.charAt(rIndex + 1) == '*') return matchstar(regex.charAt(rIndex), regex, candidate, rIndex + 2, cIndex);
		if (regex.charAt(rIndex) == '$' && (rIndex + 1) == regex.length()) return cIndex == candidate.length();
		if (cIndex != candidate.length() && (regex.charAt(rIndex) == '.' || regex.charAt(rIndex) == candidate.charAt(cIndex)))
			return matchhere(regex, candidate, ++rIndex, ++cIndex);
		return false;
	}

	/**
	 * 在candidate的开头查找C + regex
	 * 
	 * @param c
	 * @param regex
	 * @param candidate
	 * @param rIndex
	 * @param cIndex
	 * @return
	 */
	public static boolean matchstar(int c, String regex, String candidate, int rIndex, int cIndex) {
		do { /* 通配符*匹配零个或多个实例 */
			if (matchhere(regex, candidate, rIndex, cIndex)) return true;
		} while (cIndex != candidate.length() && (candidate.charAt(cIndex++) == c || c == '.'));
		return false;
	}
	
    public static void assertExpression(boolean expect, SimpleParser parser){
        
        if(expect == parser.parser()) return;
        
        System.out.println(parser.toString());
    }
    
    public String toString(){
        return "Candidate does not match pattern! Pattern :" + regex + " " + candidate.toString();
    }
    
    public static void main(String[] args) {
    
//        assertExpression(ACCEPT, new SimpleParser("abc",   "abcd"));
//        
//        assertExpression(ACCEPT, new SimpleParser("*", "abc"));
//        
//        assertExpression(ACCEPT, new SimpleParser("...",   "abc"));
//                
//        assertExpression(ACCEPT, new SimpleParser("*abc",  "aaabbbabc"));
//        
//        assertExpression(REJECT, new SimpleParser("abc",   "abcd"));
//        
//        assertExpression(REJECT, new SimpleParser("*a",    "abcd"));
        
         assertExpression(ACCEPT, new SimpleParser("a*",	"a"));
    
		assertExpression(ACCEPT, new SimpleParser("abc",	"abc"));
		
		assertExpression(ACCEPT, new SimpleParser("*",	"abc"));
		
		assertExpression(ACCEPT, new SimpleParser("*abc",	"abc"));
		
		assertExpression(ACCEPT, new SimpleParser("*abc",	"aaabbbabc"));
		
		assertExpression(ACCEPT, new SimpleParser("a*bc",	"aaabbbabc"));
		
		assertExpression(ACCEPT, new SimpleParser("a*",	"abc"));
		
		assertExpression(ACCEPT, new SimpleParser("a*",	"a"));
		
		assertExpression(ACCEPT, new SimpleParser("a*",	"aa"));
		
		assertExpression(ACCEPT, new SimpleParser("*abc*","abc"));
		
		assertExpression(ACCEPT, new SimpleParser("...",	"abc"));
		
		assertExpression(ACCEPT, new SimpleParser(".*",	"abc"));
		
		assertExpression(ACCEPT, new SimpleParser(".bc*",		"abc"));
		
		assertExpression(ACCEPT, new SimpleParser(".b*c*a",	"abca"));
		
		assertExpression(ACCEPT, new SimpleParser("*",	""));
		
		
		
		assertExpression(REJECT, new SimpleParser("abc",	"abcd"));
		
		assertExpression(REJECT, new SimpleParser("*a",	"abcd"));
		
		assertExpression(REJECT, new SimpleParser("A",	""));
		
		assertExpression(REJECT, new SimpleParser(".a*c",	"abc"));
		
		assertExpression(REJECT, new SimpleParser("a.*b",	"abc"));
		
		assertExpression(REJECT, new SimpleParser("..",	"abc"));
    }
    
}

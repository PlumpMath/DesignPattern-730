package behavior.visitor.dengxt;

public class RuleChar extends IRule {

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

    @Override
    public boolean match(IVisitor<?> visitor, String target, int index) {

        if (index >= target.length() || rule != target.charAt(index)) {
            return false;
        }

        if (next != null) {
            return next.match(visitor, target, index + 1);
        }

        return index == target.length() - 1;
    }

	public char rule() {

		return rule;
	}
        
        public String toString(){
            return rule + ((next == null)? "#" :next.toString());
        }

}

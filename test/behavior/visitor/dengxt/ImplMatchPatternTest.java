/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.dengxt;

import behavior.visitor.dengxt.IRule;
import behavior.visitor.dengxt.ImplMatchPattern;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dengxt
 */
public class ImplMatchPatternTest {

    private ImplMatchPattern pattern = new ImplMatchPattern();

    public ImplMatchPatternTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void failureCase() {
        
        assertFalse(pattern.visit(new IRule.Factory().buildRule("abc"), "abcd", 0));
        assertFalse(pattern.visit(new IRule.Factory().buildRule("*a"), "abcd", 0));
        assertFalse(pattern.visit(new IRule.Factory().buildRule("A"), "", 0));
        assertFalse(pattern.visit(new IRule.Factory().buildRule(".a*c"), "abc", 0));
        assertFalse(pattern.visit(new IRule.Factory().buildRule("a.*b"), "abc", 0));
        assertFalse(pattern.visit(new IRule.Factory().buildRule(".."), "abc", 0));
    }

    @Test
    public void successCase() {
        
        assertTrue(pattern.visit(new IRule.Factory().buildRule("abc"), "abc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("*"), "abc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("..."), "abc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("*abc"), "aaabbbabc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("*abc"), "aaabbbabc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("a*bc"), "aaabbbabc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("a*"), "abc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("a*"), "a", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("a*"), "aa", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("*abc*"), "abc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule(".*"), "abc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule(".bc*"), "abc", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule(".b*c*a"), "abca", 0));
        assertTrue(pattern.visit(new IRule.Factory().buildRule("*"), "", 0));
    }
}
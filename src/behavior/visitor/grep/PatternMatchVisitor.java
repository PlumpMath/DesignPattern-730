/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior.visitor.grep;

import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.util.List;

/**
 *
 * @author dengxt
 */
public class PatternMatchVisitor extends GrepBaseVisitor<Boolean> {

    List<GrepParser.PatternContext> patterns = null;
    String target = null;
    int index = 0;
    int p = 0;
    boolean match = true;

    private boolean hasNext() {
        return index < target.length() - 1;
    }

    @Override
    public Boolean visitGrep(GrepParser.GrepContext ctx) {

        patterns = ctx.pattern();
        List<GrepParser.TargetContext> targets = ctx.target();

        for (GrepParser.TargetContext target : targets) {
            match = visitTarget(target);
        }
        return match;
    }

    @Override
    public Boolean visitPattern(GrepParser.PatternContext ctx) {

        GrepParser.DotContext dot = ctx.dot();
        if (dot != null) {
            match = visitDot(dot);
        }

        GrepParser.StringContext t = ctx.string();
        if (t != null) {
            match = visitString(t);
        }

        GrepParser.StarContext star = ctx.star();
        if (star != null) {
            match = visitStar(star);
        }

        return match;
    }

    @Override
    public Boolean visitString(GrepParser.StringContext ctx) {

        String str = ctx.getText();

        if (index <= target.length() - str.length()) {
            match = (target.indexOf(str, index) == index);
            index += str.length();
            return match;
        } else {
            return false;
        }
    }

    @Override
    public Boolean visitDot(GrepParser.DotContext ctx) {

        if (index < target.length()) {
            index++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean visitStar(GrepParser.StarContext ctx) {

        if (p == patterns.size() - 1) {
            return true;
        }
        
        //Never more than patterns.size();
        int tmpIndex = index;
        int tmpP = p;
        
        while (hasNext()) {
            boolean m = true;
            while(p+1 <= patterns.size()-1){
                GrepParser.PatternContext pt = patterns.get(++p);
                match = visitPattern(pt);
                System.out.print(pt.getText());
                if(!match) {
                    break;
                }
            }
            if(match){
                return match;
            }else{
                p = tmpP;
                index = tmpIndex++;
            } 
        }
        return match;
    }

    @Override
    public Boolean visitTarget(GrepParser.TargetContext ctx) {

        this.target = ctx.getText();
        this.index = 0;

        for (p = 0; p < patterns.size(); p++) {

            GrepParser.PatternContext pattern = patterns.get(p);
//            match = visitPattern(pattern);
            GrepParser.DotContext dot = pattern.dot();
            if (dot != null) {
                match = visitDot(dot);
            }

            GrepParser.StringContext t = pattern.string();
            if (t != null) {
                match = visitString(t);
            }

            GrepParser.StarContext star = pattern.star();
            if (star != null) {
                match = visitStar(star);
                if(match) break;
            }
            
            if (match == false) {
                System.out.println("\n" + target + " not match pattern.");
                break;
            }
            System.out.print(pattern.getText());
        }
        
         if (match) {
            System.out.println(" match " + target + "\n");
        }
         
        return match;
    }

    public static void main(String[] args) throws IOException {

        InputStream is = PatternMatchVisitor.class.getResourceAsStream("test.case1");
        GrepLexer lexer = new GrepLexer(new ANTLRInputStream(is));
        GrepParser parser = new GrepParser(new CommonTokenStream(lexer));
        GrepParser.GrepContext tree = parser.grep();
        PatternMatchVisitor visitor = new PatternMatchVisitor();
        Boolean match = visitor.visitGrep(tree);
    }
}

// Generated from D:\workspace\Netbean\Grep\src\com\samsung\dsl\grep\Grep.g4 by ANTLR 4.0
package behavior.visitor.grep;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GrepVisitor<T> extends ParseTreeVisitor<T> {
	T visitGrep(GrepParser.GrepContext ctx);

	T visitPattern(GrepParser.PatternContext ctx);

	T visitString(GrepParser.StringContext ctx);

	T visitStar(GrepParser.StarContext ctx);

	T visitTarget(GrepParser.TargetContext ctx);

	T visitDot(GrepParser.DotContext ctx);
}
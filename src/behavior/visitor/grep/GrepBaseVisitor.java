// Generated from D:\workspace\Netbean\Grep\src\com\samsung\dsl\grep\Grep.g4 by ANTLR 4.0
package behavior.visitor.grep;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class GrepBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements GrepVisitor<T> {
	@Override public T visitGrep(GrepParser.GrepContext ctx) { return visitChildren(ctx); }

	@Override public T visitPattern(GrepParser.PatternContext ctx) { return visitChildren(ctx); }

	@Override public T visitString(GrepParser.StringContext ctx) { return visitChildren(ctx); }

	@Override public T visitStar(GrepParser.StarContext ctx) { return visitChildren(ctx); }

	@Override public T visitTarget(GrepParser.TargetContext ctx) { return visitChildren(ctx); }

	@Override public T visitDot(GrepParser.DotContext ctx) { return visitChildren(ctx); }
}
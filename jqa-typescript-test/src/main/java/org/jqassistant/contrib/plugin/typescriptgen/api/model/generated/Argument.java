//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ArgumentContext extends ParserRuleContext {
 *
 *     public SingleExpressionContext singleExpression() {
 *         return getRuleContext(SingleExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(TypeScriptParser.Identifier, 0);
 *     }
 *
 *     public TerminalNode Ellipsis() {
 *         return getToken(TypeScriptParser.Ellipsis, 0);
 *     }
 *
 *     public ArgumentContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_argument;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterArgument(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitArgument(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Argument")
public interface Argument extends TypeScriptGenAST {

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_ELLIPSIS")
    TerminalNodeStrings getEllipsis();

    void setEllipsis(TerminalNodeStrings setEllipsis);
}

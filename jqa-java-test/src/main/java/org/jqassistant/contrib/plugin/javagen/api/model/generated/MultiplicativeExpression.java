//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class MultiplicativeExpressionContext extends ParserRuleContext {
 *
 *     public UnaryExpressionContext unaryExpression() {
 *         return getRuleContext(UnaryExpressionContext.class, 0);
 *     }
 *
 *     public MultiplicativeExpressionContext multiplicativeExpression() {
 *         return getRuleContext(MultiplicativeExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode MUL() {
 *         return getToken(Java8Parser.MUL, 0);
 *     }
 *
 *     public TerminalNode DIV() {
 *         return getToken(Java8Parser.DIV, 0);
 *     }
 *
 *     public TerminalNode MOD() {
 *         return getToken(Java8Parser.MOD, 0);
 *     }
 *
 *     public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_multiplicativeExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterMultiplicativeExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitMultiplicativeExpression(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MultiplicativeExpression")
public interface MultiplicativeExpression extends JavaGenAST {

    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression setUnaryExpression);

    @Relation("HAS_MULTIPLICATIVE_EXPRESSION")
    MultiplicativeExpression getMultiplicativeExpression();

    void setMultiplicativeExpression(MultiplicativeExpression setMultiplicativeExpression);

    @Relation("HAS_MUL")
    TerminalNodeStrings getMUL();

    void setMUL(TerminalNodeStrings setMUL);

    @Relation("HAS_DIV")
    TerminalNodeStrings getDIV();

    void setDIV(TerminalNodeStrings setDIV);

    @Relation("HAS_MOD")
    TerminalNodeStrings getMOD();

    void setMOD(TerminalNodeStrings setMOD);
}

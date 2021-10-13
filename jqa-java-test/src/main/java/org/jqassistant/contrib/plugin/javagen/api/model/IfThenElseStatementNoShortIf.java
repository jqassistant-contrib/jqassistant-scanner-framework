//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
 *
 *     public TerminalNode IF() {
 *         return getToken(Java8Parser.IF, 0);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public ExpressionContext expression() {
 *         return getRuleContext(ExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public List<StatementNoShortIfContext> statementNoShortIf() {
 *         return getRuleContexts(StatementNoShortIfContext.class);
 *     }
 *
 *     public StatementNoShortIfContext statementNoShortIf(int i) {
 *         return getRuleContext(StatementNoShortIfContext.class, i);
 *     }
 *
 *     public TerminalNode ELSE() {
 *         return getToken(Java8Parser.ELSE, 0);
 *     }
 *
 *     public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_ifThenElseStatementNoShortIf;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterIfThenElseStatementNoShortIf(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitIfThenElseStatementNoShortIf(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.IfThenElseStatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("IfThenElseStatementNoShortIf")
public interface IfThenElseStatementNoShortIf extends JavaGen {

    @Relation("HAS_I_F")
    TerminalNodeStrings getIF();

    void setIF(TerminalNodeStrings setIF);

    @Relation("HAS_L_P_A_R_E_N")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_R_P_A_R_E_N")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    List<StatementNoShortIf> getStatementNoShortIf();

    void setStatementNoShortIf(List<StatementNoShortIf> setStatementNoShortIf);

    @Relation("HAS_E_L_S_E")
    TerminalNodeStrings getELSE();

    void setELSE(TerminalNodeStrings setELSE);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

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
 * public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
 *
 *     public TerminalNode FOR() {
 *         return getToken(Java8Parser.FOR, 0);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public List<TerminalNode> SEMI() {
 *         return getTokens(Java8Parser.SEMI);
 *     }
 *
 *     public TerminalNode SEMI(int i) {
 *         return getToken(Java8Parser.SEMI, i);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public StatementNoShortIfContext statementNoShortIf() {
 *         return getRuleContext(StatementNoShortIfContext.class, 0);
 *     }
 *
 *     public ForInitContext forInit() {
 *         return getRuleContext(ForInitContext.class, 0);
 *     }
 *
 *     public ExpressionContext expression() {
 *         return getRuleContext(ExpressionContext.class, 0);
 *     }
 *
 *     public ForUpdateContext forUpdate() {
 *         return getRuleContext(ForUpdateContext.class, 0);
 *     }
 *
 *     public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_basicForStatementNoShortIf;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterBasicForStatementNoShortIf(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitBasicForStatementNoShortIf(this);
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
@Label("BasicForStatementNoShortIf")
public interface BasicForStatementNoShortIf extends JavaGenAST {

    @Relation("HAS_FOR")
    TerminalNodeStrings getFOR();

    void setFOR(TerminalNodeStrings setFOR);

    @Relation("HAS_LPAREN")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_SEMI")
    List<TerminalNodeStrings> getSEMI();

    void setSEMI(List<TerminalNodeStrings> setSEMI);

    @Relation("HAS_RPAREN")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    StatementNoShortIf getStatementNoShortIf();

    void setStatementNoShortIf(StatementNoShortIf setStatementNoShortIf);

    @Relation("HAS_FOR_INIT")
    ForInit getForInit();

    void setForInit(ForInit setForInit);

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_FOR_UPDATE")
    ForUpdate getForUpdate();

    void setForUpdate(ForUpdate setForUpdate);
}

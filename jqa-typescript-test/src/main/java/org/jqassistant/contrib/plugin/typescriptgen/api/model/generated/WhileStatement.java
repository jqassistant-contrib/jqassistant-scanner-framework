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
 * public static class WhileStatementContext extends IterationStatementContext {
 *
 *     public TerminalNode While() {
 *         return getToken(TypeScriptParser.While, 0);
 *     }
 *
 *     public TerminalNode OpenParen() {
 *         return getToken(TypeScriptParser.OpenParen, 0);
 *     }
 *
 *     public ExpressionSequenceContext expressionSequence() {
 *         return getRuleContext(ExpressionSequenceContext.class, 0);
 *     }
 *
 *     public TerminalNode CloseParen() {
 *         return getToken(TypeScriptParser.CloseParen, 0);
 *     }
 *
 *     public StatementContext statement() {
 *         return getRuleContext(StatementContext.class, 0);
 *     }
 *
 *     public WhileStatementContext(IterationStatementContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterWhileStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitWhileStatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("WhileStatement")
public interface WhileStatement extends IterationStatement {

    @Relation("HAS_WHILE")
    TerminalNodeStrings getWhile();

    void setWhile(TerminalNodeStrings setWhile);

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);
}

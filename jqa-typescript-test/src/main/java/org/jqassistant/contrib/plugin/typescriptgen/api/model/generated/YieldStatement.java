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
 * public static class YieldStatementContext extends ParserRuleContext {
 *
 *     public TerminalNode Yield() {
 *         return getToken(TypeScriptParser.Yield, 0);
 *     }
 *
 *     public EosContext eos() {
 *         return getRuleContext(EosContext.class, 0);
 *     }
 *
 *     public ExpressionSequenceContext expressionSequence() {
 *         return getRuleContext(ExpressionSequenceContext.class, 0);
 *     }
 *
 *     public YieldStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_yieldStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterYieldStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitYieldStatement(this);
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
@Label("YieldStatement")
public interface YieldStatement extends TypeScriptGenAST {

    @Relation("HAS_YIELD")
    TerminalNodeStrings getYield();

    void setYield(TerminalNodeStrings setYield);

    @Relation("HAS_EOS")
    Eos getEos();

    void setEos(Eos setEos);

    @Relation("HAS_EXPRESSION_SEQUENCE")
    ExpressionSequence getExpressionSequence();

    void setExpressionSequence(ExpressionSequence setExpressionSequence);
}

//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class ResultContext extends ParserRuleContext {
 *
 *     public UnannTypeContext unannType() {
 *         return getRuleContext(UnannTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode VOID() {
 *         return getToken(Java8Parser.VOID, 0);
 *     }
 *
 *     public ResultContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_result;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterResult(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitResult(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ResultMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Result")
public interface Result extends JavaGen {

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    @Relation("HAS_V_O_I_D")
    TerminalNodeStrings getVOID();

    void setVOID(TerminalNodeStrings setVOID);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

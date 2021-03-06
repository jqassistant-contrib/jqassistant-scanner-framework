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
 * public static class FloatingPointTypeContext extends ParserRuleContext {
 *
 *     public TerminalNode FLOAT() {
 *         return getToken(Java8Parser.FLOAT, 0);
 *     }
 *
 *     public TerminalNode DOUBLE() {
 *         return getToken(Java8Parser.DOUBLE, 0);
 *     }
 *
 *     public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_floatingPointType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterFloatingPointType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitFloatingPointType(this);
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
@Label("FloatingPointType")
public interface FloatingPointType extends JavaGenAST {

    @Relation("HAS_FLOAT")
    TerminalNodeStrings getFLOAT();

    void setFLOAT(TerminalNodeStrings setFLOAT);

    @Relation("HAS_DOUBLE")
    TerminalNodeStrings getDOUBLE();

    void setDOUBLE(TerminalNodeStrings setDOUBLE);
}

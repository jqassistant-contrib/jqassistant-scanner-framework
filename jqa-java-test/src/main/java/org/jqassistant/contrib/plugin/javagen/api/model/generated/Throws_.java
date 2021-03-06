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
 * public static class Throws_Context extends ParserRuleContext {
 *
 *     public TerminalNode THROWS() {
 *         return getToken(Java8Parser.THROWS, 0);
 *     }
 *
 *     public ExceptionTypeListContext exceptionTypeList() {
 *         return getRuleContext(ExceptionTypeListContext.class, 0);
 *     }
 *
 *     public Throws_Context(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_throws_;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterThrows_(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitThrows_(this);
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
@Label("Throws_")
public interface Throws_ extends JavaGenAST {

    @Relation("HAS_THROWS")
    TerminalNodeStrings getTHROWS();

    void setTHROWS(TerminalNodeStrings setTHROWS);

    @Relation("HAS_EXCEPTION_TYPE_LIST")
    ExceptionTypeList getExceptionTypeList();

    void setExceptionTypeList(ExceptionTypeList setExceptionTypeList);
}

//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class SuperclassContext extends ParserRuleContext {
 *
 *     public TerminalNode EXTENDS() {
 *         return getToken(Java8Parser.EXTENDS, 0);
 *     }
 *
 *     public ClassTypeContext classType() {
 *         return getRuleContext(ClassTypeContext.class, 0);
 *     }
 *
 *     public SuperclassContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_superclass;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterSuperclass(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitSuperclass(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SuperclassMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Superclass")
public interface Superclass extends JavaGen {

    @Relation("HAS_E_X_T_E_N_D_S")
    TerminalNodeStrings getEXTENDS();

    void setEXTENDS(TerminalNodeStrings setEXTENDS);

    @Relation("HAS_CLASS_TYPE")
    ClassType getClassType();

    void setClassType(ClassType setClassType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

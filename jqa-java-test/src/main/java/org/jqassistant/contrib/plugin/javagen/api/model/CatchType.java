//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;
import java.util.List;

/**
 * Generated from Parser:
 * <pre>
 * public static class CatchTypeContext extends ParserRuleContext {
 *
 *     public UnannClassTypeContext unannClassType() {
 *         return getRuleContext(UnannClassTypeContext.class, 0);
 *     }
 *
 *     public List<TerminalNode> BITOR() {
 *         return getTokens(Java8Parser.BITOR);
 *     }
 *
 *     public TerminalNode BITOR(int i) {
 *         return getToken(Java8Parser.BITOR, i);
 *     }
 *
 *     public List<ClassTypeContext> classType() {
 *         return getRuleContexts(ClassTypeContext.class);
 *     }
 *
 *     public ClassTypeContext classType(int i) {
 *         return getRuleContext(ClassTypeContext.class, i);
 *     }
 *
 *     public CatchTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_catchType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterCatchType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitCatchType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.CatchTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CatchType")
public interface CatchType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_TYPE")
    UnannClassType getUnannClassType();

    void setUnannClassType(UnannClassType setUnannClassType);

    @Relation("HAS_B_I_T_O_R")
    List<TerminalNodeStrings> getBITOR();

    void setBITOR(List<TerminalNodeStrings> setBITOR);

    @Relation("HAS_CLASS_TYPE")
    List<ClassType> getClassType();

    void setClassType(List<ClassType> setClassType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

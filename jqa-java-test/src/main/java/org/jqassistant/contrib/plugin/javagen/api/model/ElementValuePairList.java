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
 * public static class ElementValuePairListContext extends ParserRuleContext {
 *
 *     public List<ElementValuePairContext> elementValuePair() {
 *         return getRuleContexts(ElementValuePairContext.class);
 *     }
 *
 *     public ElementValuePairContext elementValuePair(int i) {
 *         return getRuleContext(ElementValuePairContext.class, i);
 *     }
 *
 *     public List<TerminalNode> COMMA() {
 *         return getTokens(Java8Parser.COMMA);
 *     }
 *
 *     public TerminalNode COMMA(int i) {
 *         return getToken(Java8Parser.COMMA, i);
 *     }
 *
 *     public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_elementValuePairList;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterElementValuePairList(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitElementValuePairList(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ElementValuePairListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ElementValuePairList")
public interface ElementValuePairList extends JavaGen {

    @Relation("HAS_ELEMENT_VALUE_PAIR")
    List<ElementValuePair> getElementValuePair();

    void setElementValuePair(List<ElementValuePair> setElementValuePair);

    @Relation("HAS_C_O_M_M_A")
    List<TerminalNodeStrings> getCOMMA();

    void setCOMMA(List<TerminalNodeStrings> setCOMMA);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

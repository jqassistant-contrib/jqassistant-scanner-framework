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
 * public static class SwitchBlockContext extends ParserRuleContext {
 *
 *     public TerminalNode LBRACE() {
 *         return getToken(Java8Parser.LBRACE, 0);
 *     }
 *
 *     public TerminalNode RBRACE() {
 *         return getToken(Java8Parser.RBRACE, 0);
 *     }
 *
 *     public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
 *         return getRuleContexts(SwitchBlockStatementGroupContext.class);
 *     }
 *
 *     public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
 *         return getRuleContext(SwitchBlockStatementGroupContext.class, i);
 *     }
 *
 *     public List<SwitchLabelContext> switchLabel() {
 *         return getRuleContexts(SwitchLabelContext.class);
 *     }
 *
 *     public SwitchLabelContext switchLabel(int i) {
 *         return getRuleContext(SwitchLabelContext.class, i);
 *     }
 *
 *     public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_switchBlock;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterSwitchBlock(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitSwitchBlock(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SwitchBlockMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SwitchBlock")
public interface SwitchBlock extends JavaGen {

    @Relation("HAS_L_B_R_A_C_E")
    TerminalNodeStrings getLBRACE();

    void setLBRACE(TerminalNodeStrings setLBRACE);

    @Relation("HAS_R_B_R_A_C_E")
    TerminalNodeStrings getRBRACE();

    void setRBRACE(TerminalNodeStrings setRBRACE);

    @Relation("HAS_SWITCH_BLOCK_STATEMENT_GROUP")
    List<SwitchBlockStatementGroup> getSwitchBlockStatementGroup();

    void setSwitchBlockStatementGroup(List<SwitchBlockStatementGroup> setSwitchBlockStatementGroup);

    @Relation("HAS_SWITCH_LABEL")
    List<SwitchLabel> getSwitchLabel();

    void setSwitchLabel(List<SwitchLabel> setSwitchLabel);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

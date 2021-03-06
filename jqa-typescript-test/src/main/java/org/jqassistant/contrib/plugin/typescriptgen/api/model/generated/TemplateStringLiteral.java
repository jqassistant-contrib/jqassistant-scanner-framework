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
 * public static class TemplateStringLiteralContext extends ParserRuleContext {
 *
 *     public List<TerminalNode> BackTick() {
 *         return getTokens(TypeScriptParser.BackTick);
 *     }
 *
 *     public TerminalNode BackTick(int i) {
 *         return getToken(TypeScriptParser.BackTick, i);
 *     }
 *
 *     public List<TemplateStringAtomContext> templateStringAtom() {
 *         return getRuleContexts(TemplateStringAtomContext.class);
 *     }
 *
 *     public TemplateStringAtomContext templateStringAtom(int i) {
 *         return getRuleContext(TemplateStringAtomContext.class, i);
 *     }
 *
 *     public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_templateStringLiteral;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTemplateStringLiteral(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTemplateStringLiteral(this);
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
@Label("TemplateStringLiteral")
public interface TemplateStringLiteral extends TypeScriptGenAST {

    @Relation("HAS_BACK_TICK")
    List<TerminalNodeStrings> getBackTick();

    void setBackTick(List<TerminalNodeStrings> setBackTick);

    @Relation("HAS_TEMPLATE_STRING_ATOM")
    List<TemplateStringAtom> getTemplateStringAtom();

    void setTemplateStringAtom(List<TemplateStringAtom> setTemplateStringAtom);
}

//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class TypeArgumentsContext extends ParserRuleContext {
 *
 *     public TerminalNode LessThan() {
 *         return getToken(TypeScriptParser.LessThan, 0);
 *     }
 *
 *     public TerminalNode MoreThan() {
 *         return getToken(TypeScriptParser.MoreThan, 0);
 *     }
 *
 *     public TypeArgumentListContext typeArgumentList() {
 *         return getRuleContext(TypeArgumentListContext.class, 0);
 *     }
 *
 *     public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_typeArguments;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTypeArguments(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTypeArguments(this);
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
@Label("TypeArguments")
public interface TypeArguments extends TypeScriptGen {

    @Relation("HAS_LESS_THAN")
    TerminalNodeStrings getLessThan();

    void setLessThan(TerminalNodeStrings setLessThan);

    @Relation("HAS_MORE_THAN")
    TerminalNodeStrings getMoreThan();

    void setMoreThan(TerminalNodeStrings setMoreThan);

    @Relation("HAS_TYPE_ARGUMENT_LIST")
    TypeArgumentList getTypeArgumentList();

    void setTypeArgumentList(TypeArgumentList setTypeArgumentList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

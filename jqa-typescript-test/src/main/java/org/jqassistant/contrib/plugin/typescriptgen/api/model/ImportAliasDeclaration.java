//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class ImportAliasDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode Identifier() {
 *         return getToken(TypeScriptParser.Identifier, 0);
 *     }
 *
 *     public TerminalNode Assign() {
 *         return getToken(TypeScriptParser.Assign, 0);
 *     }
 *
 *     public NamespaceNameContext namespaceName() {
 *         return getRuleContext(NamespaceNameContext.class, 0);
 *     }
 *
 *     public TerminalNode SemiColon() {
 *         return getToken(TypeScriptParser.SemiColon, 0);
 *     }
 *
 *     public ImportAliasDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_importAliasDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterImportAliasDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitImportAliasDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ImportAliasDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ImportAliasDeclaration")
public interface ImportAliasDeclaration extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_ASSIGN")
    TerminalNodeStrings getAssign();

    void setAssign(TerminalNodeStrings setAssign);

    @Relation("HAS_NAMESPACE_NAME")
    NamespaceName getNamespaceName();

    void setNamespaceName(NamespaceName setNamespaceName);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

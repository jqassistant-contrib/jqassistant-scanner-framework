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
 * public static class ConstructorDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode Constructor() {
 *         return getToken(TypeScriptParser.Constructor, 0);
 *     }
 *
 *     public TerminalNode OpenParen() {
 *         return getToken(TypeScriptParser.OpenParen, 0);
 *     }
 *
 *     public TerminalNode CloseParen() {
 *         return getToken(TypeScriptParser.CloseParen, 0);
 *     }
 *
 *     public AccessibilityModifierContext accessibilityModifier() {
 *         return getRuleContext(AccessibilityModifierContext.class, 0);
 *     }
 *
 *     public FormalParameterListContext formalParameterList() {
 *         return getRuleContext(FormalParameterListContext.class, 0);
 *     }
 *
 *     public TerminalNode SemiColon() {
 *         return getToken(TypeScriptParser.SemiColon, 0);
 *     }
 *
 *     public TerminalNode OpenBrace() {
 *         return getToken(TypeScriptParser.OpenBrace, 0);
 *     }
 *
 *     public FunctionBodyContext functionBody() {
 *         return getRuleContext(FunctionBodyContext.class, 0);
 *     }
 *
 *     public TerminalNode CloseBrace() {
 *         return getToken(TypeScriptParser.CloseBrace, 0);
 *     }
 *
 *     public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_constructorDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterConstructorDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitConstructorDeclaration(this);
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
@Label("ConstructorDeclaration")
public interface ConstructorDeclaration extends TypeScriptGen {

    @Relation("HAS_CONSTRUCTOR")
    TerminalNodeStrings getConstructor();

    void setConstructor(TerminalNodeStrings setConstructor);

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList setFormalParameterList);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);

    @Relation("HAS_OPEN_BRACE")
    TerminalNodeStrings getOpenBrace();

    void setOpenBrace(TerminalNodeStrings setOpenBrace);

    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    @Relation("HAS_CLOSE_BRACE")
    TerminalNodeStrings getCloseBrace();

    void setCloseBrace(TerminalNodeStrings setCloseBrace);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}

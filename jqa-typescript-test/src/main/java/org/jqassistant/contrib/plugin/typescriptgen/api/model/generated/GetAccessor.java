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
 * public static class GetAccessorContext extends ParserRuleContext {
 *
 *     public GetterContext getter() {
 *         return getRuleContext(GetterContext.class, 0);
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
 *     public TypeAnnotationContext typeAnnotation() {
 *         return getRuleContext(TypeAnnotationContext.class, 0);
 *     }
 *
 *     public GetAccessorContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_getAccessor;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterGetAccessor(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitGetAccessor(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("GetAccessor")
public interface GetAccessor extends TypeScriptGenAST {

    @Relation("HAS_GETTER")
    Getter getGetter();

    void setGetter(Getter setGetter);

    @Relation("HAS_OPEN_PAREN")
    TerminalNodeStrings getOpenParen();

    void setOpenParen(TerminalNodeStrings setOpenParen);

    @Relation("HAS_CLOSE_PAREN")
    TerminalNodeStrings getCloseParen();

    void setCloseParen(TerminalNodeStrings setCloseParen);

    @Relation("HAS_OPEN_BRACE")
    TerminalNodeStrings getOpenBrace();

    void setOpenBrace(TerminalNodeStrings setOpenBrace);

    @Relation("HAS_FUNCTION_BODY")
    FunctionBody getFunctionBody();

    void setFunctionBody(FunctionBody setFunctionBody);

    @Relation("HAS_CLOSE_BRACE")
    TerminalNodeStrings getCloseBrace();

    void setCloseBrace(TerminalNodeStrings setCloseBrace);

    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);
}

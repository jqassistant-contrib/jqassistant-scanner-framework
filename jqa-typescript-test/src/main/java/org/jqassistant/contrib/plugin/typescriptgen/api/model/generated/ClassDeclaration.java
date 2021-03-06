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
 * public static class ClassDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode Class() {
 *         return getToken(TypeScriptParser.Class, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(TypeScriptParser.Identifier, 0);
 *     }
 *
 *     public ClassHeritageContext classHeritage() {
 *         return getRuleContext(ClassHeritageContext.class, 0);
 *     }
 *
 *     public ClassTailContext classTail() {
 *         return getRuleContext(ClassTailContext.class, 0);
 *     }
 *
 *     public TerminalNode Abstract() {
 *         return getToken(TypeScriptParser.Abstract, 0);
 *     }
 *
 *     public TypeParametersContext typeParameters() {
 *         return getRuleContext(TypeParametersContext.class, 0);
 *     }
 *
 *     public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterClassDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitClassDeclaration(this);
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
@Label("ClassDeclaration")
public interface ClassDeclaration extends TypeScriptGenAST {

    @Relation("HAS_CLASS")
    TerminalNodeStrings getClazz();

    void setClazz(TerminalNodeStrings setClazz);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_CLASS_HERITAGE")
    ClassHeritage getClassHeritage();

    void setClassHeritage(ClassHeritage setClassHeritage);

    @Relation("HAS_CLASS_TAIL")
    ClassTail getClassTail();

    void setClassTail(ClassTail setClassTail);

    @Relation("HAS_ABSTRACT")
    TerminalNodeStrings getAbstract();

    void setAbstract(TerminalNodeStrings setAbstract);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);
}

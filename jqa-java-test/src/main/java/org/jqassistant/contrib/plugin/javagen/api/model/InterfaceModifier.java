//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class InterfaceModifierContext extends ParserRuleContext {
 *
 *     public AnnotationContext annotation() {
 *         return getRuleContext(AnnotationContext.class, 0);
 *     }
 *
 *     public VisibilityModifierContext visibilityModifier() {
 *         return getRuleContext(VisibilityModifierContext.class, 0);
 *     }
 *
 *     public TerminalNode ABSTRACT() {
 *         return getToken(Java8Parser.ABSTRACT, 0);
 *     }
 *
 *     public TerminalNode STATIC() {
 *         return getToken(Java8Parser.STATIC, 0);
 *     }
 *
 *     public TerminalNode STRICTFP() {
 *         return getToken(Java8Parser.STRICTFP, 0);
 *     }
 *
 *     public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterInterfaceModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitInterfaceModifier(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceModifier")
public interface InterfaceModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_VISIBILITY_MODIFIER")
    VisibilityModifier getVisibilityModifier();

    void setVisibilityModifier(VisibilityModifier setVisibilityModifier);

    @Relation("HAS_A_B_S_T_R_A_C_T")
    TerminalNodeStrings getABSTRACT();

    void setABSTRACT(TerminalNodeStrings setABSTRACT);

    @Relation("HAS_S_T_A_T_I_C")
    TerminalNodeStrings getSTATIC();

    void setSTATIC(TerminalNodeStrings setSTATIC);

    @Relation("HAS_S_T_R_I_C_T_F_P")
    TerminalNodeStrings getSTRICTFP();

    void setSTRICTFP(TerminalNodeStrings setSTRICTFP);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

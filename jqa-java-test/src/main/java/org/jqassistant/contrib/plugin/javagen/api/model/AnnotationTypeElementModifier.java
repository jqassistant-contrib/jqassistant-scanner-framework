//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from Parser:
 * <pre>
 * public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
 *
 *     public AnnotationContext annotation() {
 *         return getRuleContext(AnnotationContext.class, 0);
 *     }
 *
 *     public TerminalNode PUBLIC() {
 *         return getToken(Java8Parser.PUBLIC, 0);
 *     }
 *
 *     public TerminalNode ABSTRACT() {
 *         return getToken(Java8Parser.ABSTRACT, 0);
 *     }
 *
 *     public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_annotationTypeElementModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterAnnotationTypeElementModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitAnnotationTypeElementModifier(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.AnnotationTypeElementModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AnnotationTypeElementModifier")
public interface AnnotationTypeElementModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_P_U_B_L_I_C")
    TerminalNodeStrings getPUBLIC();

    void setPUBLIC(TerminalNodeStrings setPUBLIC);

    @Relation("HAS_A_B_S_T_R_A_C_T")
    TerminalNodeStrings getABSTRACT();

    void setABSTRACT(TerminalNodeStrings setABSTRACT);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class MethodModifierContext extends ParserRuleContext {
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
 *     public TerminalNode FINAL() {
 *         return getToken(Java8Parser.FINAL, 0);
 *     }
 *
 *     public TerminalNode SYNCHRONIZED() {
 *         return getToken(Java8Parser.SYNCHRONIZED, 0);
 *     }
 *
 *     public TerminalNode NATIVE() {
 *         return getToken(Java8Parser.NATIVE, 0);
 *     }
 *
 *     public TerminalNode STRICTFP() {
 *         return getToken(Java8Parser.STRICTFP, 0);
 *     }
 *
 *     public MethodModifierContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_methodModifier;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterMethodModifier(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitMethodModifier(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MethodModifier")
public interface MethodModifier extends JavaGenAST {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation setAnnotation);

    @Relation("HAS_VISIBILITY_MODIFIER")
    VisibilityModifier getVisibilityModifier();

    void setVisibilityModifier(VisibilityModifier setVisibilityModifier);

    @Relation("HAS_ABSTRACT")
    TerminalNodeStrings getABSTRACT();

    void setABSTRACT(TerminalNodeStrings setABSTRACT);

    @Relation("HAS_STATIC")
    TerminalNodeStrings getSTATIC();

    void setSTATIC(TerminalNodeStrings setSTATIC);

    @Relation("HAS_FINAL")
    TerminalNodeStrings getFINAL();

    void setFINAL(TerminalNodeStrings setFINAL);

    @Relation("HAS_SYNCHRONIZED")
    TerminalNodeStrings getSYNCHRONIZED();

    void setSYNCHRONIZED(TerminalNodeStrings setSYNCHRONIZED);

    @Relation("HAS_NATIVE")
    TerminalNodeStrings getNATIVE();

    void setNATIVE(TerminalNodeStrings setNATIVE);

    @Relation("HAS_STRICTFP")
    TerminalNodeStrings getSTRICTFP();

    void setSTRICTFP(TerminalNodeStrings setSTRICTFP);
}

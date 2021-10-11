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
 * public static class PrimitiveTypeContext extends ParserRuleContext {
 *
 *     public NumericTypeContext numericType() {
 *         return getRuleContext(NumericTypeContext.class, 0);
 *     }
 *
 *     public List<AnnotationContext> annotation() {
 *         return getRuleContexts(AnnotationContext.class);
 *     }
 *
 *     public AnnotationContext annotation(int i) {
 *         return getRuleContext(AnnotationContext.class, i);
 *     }
 *
 *     public TerminalNode BOOLEAN() {
 *         return getToken(Java8Parser.BOOLEAN, 0);
 *     }
 *
 *     public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_primitiveType;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPrimitiveType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPrimitiveType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimitiveTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimitiveType")
public interface PrimitiveType extends JavaGen {

    @Relation("HAS_NUMERIC_TYPE")
    NumericType getNumericType();

    void setNumericType(NumericType setNumericType);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_B_O_O_L_E_A_N")
    TerminalNodeStrings getBOOLEAN();

    void setBOOLEAN(TerminalNodeStrings setBOOLEAN);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

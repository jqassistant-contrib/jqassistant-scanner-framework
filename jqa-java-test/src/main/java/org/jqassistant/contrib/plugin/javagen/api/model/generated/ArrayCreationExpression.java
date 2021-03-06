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
 * public static class ArrayCreationExpressionContext extends ParserRuleContext {
 *
 *     public TerminalNode NEW() {
 *         return getToken(Java8Parser.NEW, 0);
 *     }
 *
 *     public PrimitiveTypeContext primitiveType() {
 *         return getRuleContext(PrimitiveTypeContext.class, 0);
 *     }
 *
 *     public DimExprsContext dimExprs() {
 *         return getRuleContext(DimExprsContext.class, 0);
 *     }
 *
 *     public DimsContext dims() {
 *         return getRuleContext(DimsContext.class, 0);
 *     }
 *
 *     public ClassOrInterfaceTypeContext classOrInterfaceType() {
 *         return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
 *     }
 *
 *     public ArrayInitializerContext arrayInitializer() {
 *         return getRuleContext(ArrayInitializerContext.class, 0);
 *     }
 *
 *     public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_arrayCreationExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterArrayCreationExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitArrayCreationExpression(this);
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
@Label("ArrayCreationExpression")
public interface ArrayCreationExpression extends JavaGenAST {

    @Relation("HAS_NEW")
    TerminalNodeStrings getNEW();

    void setNEW(TerminalNodeStrings setNEW);

    @Relation("HAS_PRIMITIVE_TYPE")
    PrimitiveType getPrimitiveType();

    void setPrimitiveType(PrimitiveType setPrimitiveType);

    @Relation("HAS_DIM_EXPRS")
    DimExprs getDimExprs();

    void setDimExprs(DimExprs setDimExprs);

    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims setDims);

    @Relation("HAS_CLASS_OR_INTERFACE_TYPE")
    ClassOrInterfaceType getClassOrInterfaceType();

    void setClassOrInterfaceType(ClassOrInterfaceType setClassOrInterfaceType);

    @Relation("HAS_ARRAY_INITIALIZER")
    ArrayInitializer getArrayInitializer();

    void setArrayInitializer(ArrayInitializer setArrayInitializer);
}

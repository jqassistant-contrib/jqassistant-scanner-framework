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
 * public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
 *
 *     public TerminalNode NEW() {
 *         return getToken(Java8Parser.NEW, 0);
 *     }
 *
 *     public List<TerminalNode> Identifier() {
 *         return getTokens(Java8Parser.Identifier);
 *     }
 *
 *     public TerminalNode Identifier(int i) {
 *         return getToken(Java8Parser.Identifier, i);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public TypeArgumentsContext typeArguments() {
 *         return getRuleContext(TypeArgumentsContext.class, 0);
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
 *     public List<TerminalNode> DOT() {
 *         return getTokens(Java8Parser.DOT);
 *     }
 *
 *     public TerminalNode DOT(int i) {
 *         return getToken(Java8Parser.DOT, i);
 *     }
 *
 *     public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
 *         return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
 *     }
 *
 *     public ArgumentListContext argumentList() {
 *         return getRuleContext(ArgumentListContext.class, 0);
 *     }
 *
 *     public ClassBodyContext classBody() {
 *         return getRuleContext(ClassBodyContext.class, 0);
 *     }
 *
 *     public ExpressionNameContext expressionName() {
 *         return getRuleContext(ExpressionNameContext.class, 0);
 *     }
 *
 *     public PrimaryContext primary() {
 *         return getRuleContext(PrimaryContext.class, 0);
 *     }
 *
 *     public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_classInstanceCreationExpression;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassInstanceCreationExpression(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassInstanceCreationExpression(this);
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
@Label("ClassInstanceCreationExpression")
public interface ClassInstanceCreationExpression extends JavaGen {

    @Relation("HAS_NEW")
    TerminalNodeStrings getNEW();

    void setNEW(TerminalNodeStrings setNEW);

    @Relation("HAS_IDENTIFIER")
    List<TerminalNodeStrings> getIdentifier();

    void setIdentifier(List<TerminalNodeStrings> setIdentifier);

    @Relation("HAS_LPAREN")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_RPAREN")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments setTypeArguments);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_DOT")
    List<TerminalNodeStrings> getDOT();

    void setDOT(List<TerminalNodeStrings> setDOT);

    @Relation("HAS_TYPE_ARGUMENTS_OR_DIAMOND")
    TypeArgumentsOrDiamond getTypeArgumentsOrDiamond();

    void setTypeArgumentsOrDiamond(TypeArgumentsOrDiamond setTypeArgumentsOrDiamond);

    @Relation("HAS_ARGUMENT_LIST")
    ArgumentList getArgumentList();

    void setArgumentList(ArgumentList setArgumentList);

    @Relation("HAS_CLASS_BODY")
    ClassBody getClassBody();

    void setClassBody(ClassBody setClassBody);

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName setExpressionName);

    @Relation("HAS_PRIMARY")
    Primary getPrimary();

    void setPrimary(Primary setPrimary);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

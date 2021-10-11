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
 * public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
 *
 *     public LiteralContext literal() {
 *         return getRuleContext(LiteralContext.class, 0);
 *     }
 *
 *     public TypeNameContext typeName() {
 *         return getRuleContext(TypeNameContext.class, 0);
 *     }
 *
 *     public TerminalNode DOT() {
 *         return getToken(Java8Parser.DOT, 0);
 *     }
 *
 *     public TerminalNode CLASS() {
 *         return getToken(Java8Parser.CLASS, 0);
 *     }
 *
 *     public List<TerminalNode> LBRACK() {
 *         return getTokens(Java8Parser.LBRACK);
 *     }
 *
 *     public TerminalNode LBRACK(int i) {
 *         return getToken(Java8Parser.LBRACK, i);
 *     }
 *
 *     public List<TerminalNode> RBRACK() {
 *         return getTokens(Java8Parser.RBRACK);
 *     }
 *
 *     public TerminalNode RBRACK(int i) {
 *         return getToken(Java8Parser.RBRACK, i);
 *     }
 *
 *     public TerminalNode VOID() {
 *         return getToken(Java8Parser.VOID, 0);
 *     }
 *
 *     public TerminalNode THIS() {
 *         return getToken(Java8Parser.THIS, 0);
 *     }
 *
 *     public TerminalNode LPAREN() {
 *         return getToken(Java8Parser.LPAREN, 0);
 *     }
 *
 *     public ExpressionContext expression() {
 *         return getRuleContext(ExpressionContext.class, 0);
 *     }
 *
 *     public TerminalNode RPAREN() {
 *         return getToken(Java8Parser.RPAREN, 0);
 *     }
 *
 *     public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
 *         return getRuleContext(ClassInstanceCreationExpressionContext.class, 0);
 *     }
 *
 *     public FieldAccessContext fieldAccess() {
 *         return getRuleContext(FieldAccessContext.class, 0);
 *     }
 *
 *     public MethodInvocationContext methodInvocation() {
 *         return getRuleContext(MethodInvocationContext.class, 0);
 *     }
 *
 *     public MethodReferenceContext methodReference() {
 *         return getRuleContext(MethodReferenceContext.class, 0);
 *     }
 *
 *     public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_primaryNoNewArray_lfno_arrayAccess;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryNoNewArray_lfno_arrayAccessMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimaryNoNewArray_lfno_arrayAccess")
public interface PrimaryNoNewArray_lfno_arrayAccess extends JavaGen {

    @Relation("HAS_LITERAL")
    Literal getLiteral();

    void setLiteral(Literal setLiteral);

    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    @Relation("HAS_D_O_T")
    TerminalNodeStrings getDOT();

    void setDOT(TerminalNodeStrings setDOT);

    @Relation("HAS_C_L_A_S_S")
    TerminalNodeStrings getClazz();

    void setClazz(TerminalNodeStrings setClazz);

    @Relation("HAS_L_B_R_A_C_K")
    List<TerminalNodeStrings> getLBRACK();

    void setLBRACK(List<TerminalNodeStrings> setLBRACK);

    @Relation("HAS_R_B_R_A_C_K")
    List<TerminalNodeStrings> getRBRACK();

    void setRBRACK(List<TerminalNodeStrings> setRBRACK);

    @Relation("HAS_V_O_I_D")
    TerminalNodeStrings getVOID();

    void setVOID(TerminalNodeStrings setVOID);

    @Relation("HAS_T_H_I_S")
    TerminalNodeStrings getTHIS();

    void setTHIS(TerminalNodeStrings setTHIS);

    @Relation("HAS_L_P_A_R_E_N")
    TerminalNodeStrings getLPAREN();

    void setLPAREN(TerminalNodeStrings setLPAREN);

    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    @Relation("HAS_R_P_A_R_E_N")
    TerminalNodeStrings getRPAREN();

    void setRPAREN(TerminalNodeStrings setRPAREN);

    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION")
    ClassInstanceCreationExpression getClassInstanceCreationExpression();

    void setClassInstanceCreationExpression(ClassInstanceCreationExpression setClassInstanceCreationExpression);

    @Relation("HAS_FIELD_ACCESS")
    FieldAccess getFieldAccess();

    void setFieldAccess(FieldAccess setFieldAccess);

    @Relation("HAS_METHOD_INVOCATION")
    MethodInvocation getMethodInvocation();

    void setMethodInvocation(MethodInvocation setMethodInvocation);

    @Relation("HAS_METHOD_REFERENCE")
    MethodReference getMethodReference();

    void setMethodReference(MethodReference setMethodReference);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

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
 * public static class MethodSignatureContext extends ParserRuleContext {
 *
 *     public PropertyNameContext propertyName() {
 *         return getRuleContext(PropertyNameContext.class, 0);
 *     }
 *
 *     public CallSignatureContext callSignature() {
 *         return getRuleContext(CallSignatureContext.class, 0);
 *     }
 *
 *     public TerminalNode QuestionMark() {
 *         return getToken(TypeScriptParser.QuestionMark, 0);
 *     }
 *
 *     public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_methodSignature;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterMethodSignature(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitMethodSignature(this);
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
@Label("MethodSignature")
public interface MethodSignature extends TypeScriptGenAST {

    @Relation("HAS_PROPERTY_NAME")
    PropertyName getPropertyName();

    void setPropertyName(PropertyName setPropertyName);

    @Relation("HAS_CALL_SIGNATURE")
    CallSignature getCallSignature();

    void setCallSignature(CallSignature setCallSignature);

    @Relation("HAS_QUESTION_MARK")
    TerminalNodeStrings getQuestionMark();

    void setQuestionMark(TerminalNodeStrings setQuestionMark);
}

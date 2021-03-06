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
 * public static class ClassDeclarationContext extends ParserRuleContext {
 *
 *     public NormalClassDeclarationContext normalClassDeclaration() {
 *         return getRuleContext(NormalClassDeclarationContext.class, 0);
 *     }
 *
 *     public EnumDeclarationContext enumDeclaration() {
 *         return getRuleContext(EnumDeclarationContext.class, 0);
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
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterClassDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitClassDeclaration(this);
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
@Label("ClassDeclaration")
public interface ClassDeclaration extends JavaGenAST {

    @Relation("HAS_NORMAL_CLASS_DECLARATION")
    NormalClassDeclaration getNormalClassDeclaration();

    void setNormalClassDeclaration(NormalClassDeclaration setNormalClassDeclaration);

    @Relation("HAS_ENUM_DECLARATION")
    EnumDeclaration getEnumDeclaration();

    void setEnumDeclaration(EnumDeclaration setEnumDeclaration);
}

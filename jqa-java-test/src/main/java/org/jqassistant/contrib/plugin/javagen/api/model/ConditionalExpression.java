//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE conditionalExpression (BLOCK (ALT conditionalOrExpression) (ALT conditionalOrExpression '?' expression ':' conditionalExpression)))
 * </pre>
 *
 * <pre>
 * conditionalExpression
 * 	:	conditionalOrExpression
 * 	|	conditionalOrExpression '?' expression ':' conditionalExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4403-4421
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#conditionalExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConditionalExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConditionalExpression")
public interface ConditionalExpression extends JavaGen {

    @Relation("HAS_CONDITIONAL_OR_EXPRESSION")
    ConditionalOrExpression getConditionalOrExpression();

    void setConditionalOrExpression(ConditionalOrExpression conditionalOrExpression);

    // unhandled TerminalAST token: '?'
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ':'
    @Relation("HAS_CONDITIONAL_EXPRESSION")
    ConditionalExpression getConditionalExpression();

    void setConditionalExpression(ConditionalExpression conditionalExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
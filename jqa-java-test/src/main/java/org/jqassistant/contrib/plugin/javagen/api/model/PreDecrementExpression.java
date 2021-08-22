//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE preDecrementExpression (BLOCK (ALT '--' unaryExpression)))
 * </pre>
 *
 * <pre>
 * preDecrementExpression
 * 	:	'--' unaryExpression
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4709-4717
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#preDecrementExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PreDecrementExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PreDecrementExpression")
public interface PreDecrementExpression extends JavaGen {

    // unhandled TerminalAST token: '--'
    @Relation("HAS_UNARY_EXPRESSION")
    UnaryExpression getUnaryExpression();

    void setUnaryExpression(UnaryExpression setUnaryExpression);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

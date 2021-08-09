//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE enhancedForStatement (BLOCK (ALT 'for' '(' (* (BLOCK (ALT variableModifier))) unannType variableDeclaratorId ':' expression ')' statement)))
 * </pre>
 *
 * <pre>
 * enhancedForStatement
 * 	:	'for' '(' variableModifier* unannType variableDeclaratorId ':' expression ')' statement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2698-2721
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enhancedForStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnhancedForStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("EnhancedForStatement")
public interface EnhancedForStatement extends JavaGen {

    // unhandled TerminalAST token: 'for'
    // unhandled TerminalAST token: '('
    @Relation("HAS_VARIABLE_MODIFIER")
    List<VariableModifier> getVariableModifiers();

    void setVariableModifiers(List<VariableModifier> setVariableModifiers);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType unannType);

    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId variableDeclaratorId);

    // unhandled TerminalAST token: ':'
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression expression);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement statement);
}

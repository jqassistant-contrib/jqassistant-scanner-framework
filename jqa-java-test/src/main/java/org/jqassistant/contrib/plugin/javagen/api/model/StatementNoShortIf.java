//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE statementNoShortIf (BLOCK (ALT statementWithoutTrailingSubstatement) (ALT labeledStatementNoShortIf) (ALT ifThenElseStatementNoShortIf) (ALT whileStatementNoShortIf) (ALT forStatementNoShortIf)))
 * </pre>
 *
 * <pre>
 * statementNoShortIf
 * 	:	statementWithoutTrailingSubstatement
 * 	|	labeledStatementNoShortIf
 * 	|	ifThenElseStatementNoShortIf
 * 	|	whileStatementNoShortIf
 * 	|	forStatementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2216-2238
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#statementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("StatementNoShortIf")
public interface StatementNoShortIf extends JavaGen {

    @Relation("HAS_STATEMENT_WITHOUT_TRAILING_SUBSTATEMENT")
    StatementWithoutTrailingSubstatement getStatementWithoutTrailingSubstatement();

    void setStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatement setStatementWithoutTrailingSubstatement);

    @Relation("HAS_LABELED_STATEMENT_NO_SHORT_IF")
    LabeledStatementNoShortIf getLabeledStatementNoShortIf();

    void setLabeledStatementNoShortIf(LabeledStatementNoShortIf setLabeledStatementNoShortIf);

    @Relation("HAS_IF_THEN_ELSE_STATEMENT_NO_SHORT_IF")
    IfThenElseStatementNoShortIf getIfThenElseStatementNoShortIf();

    void setIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIf setIfThenElseStatementNoShortIf);

    @Relation("HAS_WHILE_STATEMENT_NO_SHORT_IF")
    WhileStatementNoShortIf getWhileStatementNoShortIf();

    void setWhileStatementNoShortIf(WhileStatementNoShortIf setWhileStatementNoShortIf);

    @Relation("HAS_FOR_STATEMENT_NO_SHORT_IF")
    ForStatementNoShortIf getForStatementNoShortIf();

    void setForStatementNoShortIf(ForStatementNoShortIf setForStatementNoShortIf);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

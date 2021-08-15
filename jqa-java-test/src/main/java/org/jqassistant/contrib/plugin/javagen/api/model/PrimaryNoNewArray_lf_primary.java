//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE primaryNoNewArray_lf_primary (BLOCK (ALT classInstanceCreationExpression_lf_primary) (ALT fieldAccess_lf_primary) (ALT arrayAccess_lf_primary) (ALT methodInvocation_lf_primary) (ALT methodReference_lf_primary)))
 * </pre>
 *
 * <pre>
 * primaryNoNewArray_lf_primary
 * 	:	classInstanceCreationExpression_lf_primary
 * 	|	fieldAccess_lf_primary
 * 	|	arrayAccess_lf_primary
 * 	|	methodInvocation_lf_primary
 * 	|	methodReference_lf_primary
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3141-3163
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#primaryNoNewArray_lf_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryNoNewArray_lf_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimaryNoNewArray_lf_primary")
public interface PrimaryNoNewArray_lf_primary extends JavaGen {

    @Relation("HAS_CLASS_INSTANCE_CREATION_EXPRESSION_LF_PRIMARY")
    ClassInstanceCreationExpression_lf_primary getClassInstanceCreationExpression_lf_primary();

    void setClassInstanceCreationExpression_lf_primary(ClassInstanceCreationExpression_lf_primary classInstanceCreationExpression_lf_primary);

    @Relation("HAS_FIELD_ACCESS_LF_PRIMARY")
    FieldAccess_lf_primary getFieldAccess_lf_primary();

    void setFieldAccess_lf_primary(FieldAccess_lf_primary fieldAccess_lf_primary);

    @Relation("HAS_ARRAY_ACCESS_LF_PRIMARY")
    ArrayAccess_lf_primary getArrayAccess_lf_primary();

    void setArrayAccess_lf_primary(ArrayAccess_lf_primary arrayAccess_lf_primary);

    @Relation("HAS_METHOD_INVOCATION_LF_PRIMARY")
    MethodInvocation_lf_primary getMethodInvocation_lf_primary();

    void setMethodInvocation_lf_primary(MethodInvocation_lf_primary methodInvocation_lf_primary);

    @Relation("HAS_METHOD_REFERENCE_LF_PRIMARY")
    MethodReference_lf_primary getMethodReference_lf_primary();

    void setMethodReference_lf_primary(MethodReference_lf_primary methodReference_lf_primary);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
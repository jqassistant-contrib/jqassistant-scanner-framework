//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constructorDeclarator (BLOCK (ALT (? (BLOCK (ALT typeParameters))) simpleTypeName '(' (? (BLOCK (ALT formalParameterList))) ')')))
 * </pre>
 *
 * <pre>
 * constructorDeclarator
 * 	:	typeParameters? simpleTypeName '(' formalParameterList? ')'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1451-1467
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constructorDeclarator()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstructorDeclaratorMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConstructorDeclarator")
public interface ConstructorDeclarator extends JavaGen {

    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_SIMPLE_TYPE_NAME")
    SimpleTypeName getSimpleTypeName();

    void setSimpleTypeName(SimpleTypeName setSimpleTypeName);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList setFormalParameterList);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

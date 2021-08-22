//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE resourceSpecification (BLOCK (ALT '(' resourceList (? (BLOCK (ALT ';'))) ')')))
 * </pre>
 *
 * <pre>
 * resourceSpecification
 * 	:	'(' resourceList ';'? ')'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2925-2938
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#resourceSpecification()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ResourceSpecificationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ResourceSpecification")
public interface ResourceSpecification extends JavaGen {

    // unhandled TerminalAST token: '('
    @Relation("HAS_RESOURCE_LIST")
    ResourceList getResourceList();

    void setResourceList(ResourceList setResourceList);

    // optional: ?
    // unhandled TerminalAST token: ';'
    // unhandled TerminalAST token: ')'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

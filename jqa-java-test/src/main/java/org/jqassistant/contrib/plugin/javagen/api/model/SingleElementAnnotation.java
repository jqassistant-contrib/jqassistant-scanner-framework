//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE singleElementAnnotation (BLOCK (ALT '@' typeName '(' elementValue ')')))
 * </pre>
 *
 * <pre>
 * singleElementAnnotation
 * 	:	'@' typeName '(' elementValue ')'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2076-2090
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#singleElementAnnotation()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SingleElementAnnotationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("SingleElementAnnotation")
public interface SingleElementAnnotation extends JavaGen {

    // unhandled TerminalAST token: '@'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName setTypeName);

    // unhandled TerminalAST token: '('
    @Relation("HAS_ELEMENT_VALUE")
    ElementValue getElementValue();

    void setElementValue(ElementValue setElementValue);

    // unhandled TerminalAST token: ')'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE markerAnnotation (BLOCK (ALT '@' typeName)))
 * </pre>
 *
 * <pre>
 * markerAnnotation
 * 	:	'@' typeName
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2066-2074
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#markerAnnotation()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.MarkerAnnotationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("MarkerAnnotation")
public interface MarkerAnnotation extends JavaGen {

    // unhandled TerminalAST token: '@'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
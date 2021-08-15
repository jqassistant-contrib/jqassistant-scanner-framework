//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE packageModifier (BLOCK (ALT annotation)))
 * </pre>
 *
 * <pre>
 * packageModifier
 * 	:	annotation
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:543-549
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#packageModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PackageModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PackageModifier")
public interface PackageModifier extends JavaGen {

//    @Relation("HAS_ANNOTATION")
//    Annotation getAnnotation();
//
//    void setAnnotation(Annotation annotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
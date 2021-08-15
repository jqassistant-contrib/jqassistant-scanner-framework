//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceMethodModifier (BLOCK (ALT annotation) (ALT 'public') (ALT 'abstract') (ALT 'default') (ALT 'static') (ALT 'strictfp')))
 * </pre>
 *
 * <pre>
 * interfaceMethodModifier
 * 	:	annotation
 * 	|	'public'
 * 	|	'abstract'
 * 	|	'default'
 * 	|	'static'
 * 	|	'strictfp'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1826-1852
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceMethodModifier()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceMethodModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceMethodModifier")
public interface InterfaceMethodModifier extends JavaGen {

    @Relation("HAS_ANNOTATION")
    Annotation getAnnotation();

    void setAnnotation(Annotation annotation);

    // unhandled TerminalAST token: 'public'
    // unhandled TerminalAST token: 'abstract'
    // unhandled TerminalAST token: 'default'
    // unhandled TerminalAST token: 'static'
    // unhandled TerminalAST token: 'strictfp'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
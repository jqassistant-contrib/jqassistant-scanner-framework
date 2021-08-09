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
 * (RULE unannClassType_lf_unannClassOrInterfaceType (BLOCK (ALT '.' (* (BLOCK (ALT annotation))) Identifier (? (BLOCK (ALT typeArguments))))))
 * </pre>
 *
 * <pre>
 * unannClassType_lf_unannClassOrInterfaceType
 * 	:	'.' annotation* Identifier typeArguments?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1040-1054
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannClassType_lf_unannClassOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannClassType_lf_unannClassOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("UnannClassType_lf_unannClassOrInterfaceType")
public interface UnannClassType_lf_unannClassOrInterfaceType extends JavaGen {

    // unhandled TerminalAST token: '.'
    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotations();

    void setAnnotations(List<Annotation> setAnnotations);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // optional: typeArguments
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments typeArguments);
}

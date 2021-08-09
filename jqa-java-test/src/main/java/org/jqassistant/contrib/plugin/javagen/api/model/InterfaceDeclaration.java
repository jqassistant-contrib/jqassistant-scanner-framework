//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceDeclaration (BLOCK (ALT normalInterfaceDeclaration) (ALT annotationTypeDeclaration)))
 * </pre>
 *
 * <pre>
 * interfaceDeclaration
 * 	:	normalInterfaceDeclaration
 * 	|	annotationTypeDeclaration
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1666-1676
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("InterfaceDeclaration")
public interface InterfaceDeclaration extends JavaGen {

    @Relation("HAS_NORMAL_INTERFACE_DECLARATION")
    NormalInterfaceDeclaration getNormalInterfaceDeclaration();

    void setNormalInterfaceDeclaration(NormalInterfaceDeclaration normalInterfaceDeclaration);

    @Relation("HAS_ANNOTATION_TYPE_DECLARATION")
    AnnotationTypeDeclaration getAnnotationTypeDeclaration();

    void setAnnotationTypeDeclaration(AnnotationTypeDeclaration annotationTypeDeclaration);
}

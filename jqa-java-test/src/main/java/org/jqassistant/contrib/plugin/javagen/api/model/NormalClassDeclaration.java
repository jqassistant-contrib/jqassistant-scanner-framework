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
 * (RULE normalClassDeclaration (BLOCK (ALT (* (BLOCK (ALT classModifier))) 'class' Identifier (? (BLOCK (ALT typeParameters))) (? (BLOCK (ALT superclass))) (? (BLOCK (ALT superinterfaces))) classBody)))
 * </pre>
 *
 * <pre>
 * normalClassDeclaration
 * 	:	classModifier* 'class' Identifier typeParameters? superclass? superinterfaces? classBody
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:665-687
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#normalClassDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.NormalClassDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("NormalClassDeclaration")
public interface NormalClassDeclaration extends JavaGen {

    @Relation("HAS_CLASS_MODIFIER")
    List<ClassModifier> getClassModifiers();

    void setClassModifiers(List<ClassModifier> setClassModifiers);

    // unhandled TerminalAST token: 'class'
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // optional: typeParameters
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters typeParameters);

    // optional: superclass
    @Relation("HAS_SUPERCLASS")
    Superclass getSuperclass();

    void setSuperclass(Superclass superclass);

    // optional: superinterfaces
    @Relation("HAS_SUPERINTERFACES")
    Superinterfaces getSuperinterfaces();

    void setSuperinterfaces(Superinterfaces superinterfaces);

    @Relation("HAS_CLASS_BODY")
    ClassBody getClassBody();

    void setClassBody(ClassBody classBody);
}

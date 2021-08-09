//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeArgument (BLOCK (ALT referenceType) (ALT wildcard)))
 * </pre>
 *
 * <pre>
 * typeArgument
 * 	:	referenceType
 * 	|	wildcard
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:377-387
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeArgument()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeArgumentMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("TypeArgument")
public interface TypeArgument extends JavaGen {

    @Relation("HAS_REFERENCE_TYPE")
    ReferenceType getReferenceType();

    void setReferenceType(ReferenceType referenceType);

    @Relation("HAS_WILDCARD")
    Wildcard getWildcard();

    void setWildcard(Wildcard wildcard);
}

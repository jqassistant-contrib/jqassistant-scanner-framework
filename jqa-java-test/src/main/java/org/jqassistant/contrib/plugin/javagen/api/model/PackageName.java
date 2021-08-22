//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE packageName (BLOCK (ALT Identifier) (ALT packageName '.' Identifier)))
 * </pre>
 *
 * <pre>
 * packageName
 * 	:	Identifier
 * 	|	packageName '.' Identifier
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:421-435
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#packageName()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PackageNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PackageName")
public interface PackageName extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_PACKAGE_NAME")
    PackageName getPackageName();

    void setPackageName(PackageName setPackageName);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

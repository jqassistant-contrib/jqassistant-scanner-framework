//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE typeImportOnDemandDeclaration (BLOCK (ALT 'import' packageOrTypeName '.' '*' ';')))
 * </pre>
 *
 * <pre>
 * typeImportOnDemandDeclaration
 * 	:	'import' packageOrTypeName '.' '*' ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:583-597
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#typeImportOnDemandDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TypeImportOnDemandDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TypeImportOnDemandDeclaration")
public interface TypeImportOnDemandDeclaration extends JavaGen {

    // unhandled TerminalAST token: 'import'
    @Relation("HAS_PACKAGE_OR_TYPE_NAME")
    PackageOrTypeName getPackageOrTypeName();

    void setPackageOrTypeName(PackageOrTypeName setPackageOrTypeName);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: '*'
    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE extendsInterfaces (BLOCK (ALT 'extends' interfaceTypeList)))
 * </pre>
 *
 * <pre>
 * extendsInterfaces
 * 	:	'extends' interfaceTypeList
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1731-1739
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#extendsInterfaces()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExtendsInterfacesMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExtendsInterfaces")
public interface ExtendsInterfaces extends JavaGen {

    // unhandled TerminalAST token: 'extends'
    @Relation("HAS_INTERFACE_TYPE_LIST")
    InterfaceTypeList getInterfaceTypeList();

    void setInterfaceTypeList(InterfaceTypeList interfaceTypeList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
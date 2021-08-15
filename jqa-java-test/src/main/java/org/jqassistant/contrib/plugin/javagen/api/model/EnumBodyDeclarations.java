//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE enumBodyDeclarations (BLOCK (ALT ';' (* (BLOCK (ALT classBodyDeclaration))))))
 * </pre>
 *
 * <pre>
 * enumBodyDeclarations
 * 	:	';' classBodyDeclaration*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1653-1662
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enumBodyDeclarations()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumBodyDeclarationsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumBodyDeclarations")
public interface EnumBodyDeclarations extends JavaGen {

    // unhandled TerminalAST token: ';'
    @Relation("HAS_CLASS_BODY_DECLARATION")
    List<ClassBodyDeclaration> getClassBodyDeclaration();

    void setClassBodyDeclaration(List<ClassBodyDeclaration> setClassBodyDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}

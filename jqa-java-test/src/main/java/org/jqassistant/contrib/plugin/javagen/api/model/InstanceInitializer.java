//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE instanceInitializer (BLOCK (ALT block)))
 * </pre>
 *
 * <pre>
 * instanceInitializer
 * 	:	block
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1397-1403
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#instanceInitializer()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InstanceInitializerMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InstanceInitializer")
public interface InstanceInitializer extends JavaGen {

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block block);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}

//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model.generated;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class StaticInitializerContext extends ParserRuleContext {
 *
 *     public TerminalNode STATIC() {
 *         return getToken(Java8Parser.STATIC, 0);
 *     }
 *
 *     public BlockContext block() {
 *         return getRuleContext(BlockContext.class, 0);
 *     }
 *
 *     public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_staticInitializer;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterStaticInitializer(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitStaticInitializer(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("StaticInitializer")
public interface StaticInitializer extends JavaGenAST {

    @Relation("HAS_STATIC")
    TerminalNodeStrings getSTATIC();

    void setSTATIC(TerminalNodeStrings setSTATIC);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);
}

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
 * public static class BlockStatementsContext extends ParserRuleContext {
 *
 *     public List<BlockStatementContext> blockStatement() {
 *         return getRuleContexts(BlockStatementContext.class);
 *     }
 *
 *     public BlockStatementContext blockStatement(int i) {
 *         return getRuleContext(BlockStatementContext.class, i);
 *     }
 *
 *     public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_blockStatements;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterBlockStatements(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitBlockStatements(this);
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
@Label("BlockStatements")
public interface BlockStatements extends JavaGenAST {

    @Relation("HAS_BLOCK_STATEMENT")
    List<BlockStatement> getBlockStatement();

    void setBlockStatement(List<BlockStatement> setBlockStatement);
}

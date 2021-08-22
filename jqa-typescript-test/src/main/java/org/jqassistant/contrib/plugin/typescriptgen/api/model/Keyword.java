//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE keyword (BLOCK (ALT Break) (ALT Do) (ALT Instanceof) (ALT Typeof) (ALT Case) (ALT Else) (ALT New) (ALT Var) (ALT Catch) (ALT Finally) (ALT Return) (ALT Void) (ALT Continue) (ALT For) (ALT Switch) (ALT While) (ALT Debugger) (ALT Function_) (ALT This) (ALT With) (ALT Default) (ALT If) (ALT Throw) (ALT Delete) (ALT In) (ALT Try) (ALT ReadOnly) (ALT Async) (ALT From) (ALT Class) (ALT Enum) (ALT Extends) (ALT Super) (ALT Const) (ALT Export) (ALT Import) (ALT Implements) (ALT Let) (ALT Private) (ALT Public) (ALT Interface) (ALT Package) (ALT Protected) (ALT Static) (ALT Yield) (ALT Get) (ALT Set) (ALT Require) (ALT TypeAlias) (ALT String)))
 * </pre>
 *
 * <pre>
 * keyword
 *     : Break
 *     | Do
 *     | Instanceof
 *     | Typeof
 *     | Case
 *     | Else
 *     | New
 *     | Var
 *     | Catch
 *     | Finally
 *     | Return
 *     | Void
 *     | Continue
 *     | For
 *     | Switch
 *     | While
 *     | Debugger
 *     | Function_
 *     | This
 *     | With
 *     | Default
 *     | If
 *     | Throw
 *     | Delete
 *     | In
 *     | Try
 *     | ReadOnly
 *     | Async
 *     | From
 *     | Class
 *     | Enum
 *     | Extends
 *     | Super
 *     | Const
 *     | Export
 *     | Import
 *     | Implements
 *     | Let
 *     | Private
 *     | Public
 *     | Interface
 *     | Package
 *     | Protected
 *     | Static
 *     | Yield
 *     | Get
 *     | Set
 *     | Require
 *     | TypeAlias
 *     | String
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3567-3769
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#keyword()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.KeywordMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Keyword")
public interface Keyword extends TypeScriptGen {

    @Relation("HAS_BREAK")
    TerminalNodeStrings getBreak();

    void setBreak(TerminalNodeStrings setBreak);

    @Relation("HAS_DO")
    TerminalNodeStrings getDo();

    void setDo(TerminalNodeStrings setDo);

    @Relation("HAS_INSTANCEOF")
    TerminalNodeStrings getInstanceof();

    void setInstanceof(TerminalNodeStrings setInstanceof);

    @Relation("HAS_TYPEOF")
    TerminalNodeStrings getTypeof();

    void setTypeof(TerminalNodeStrings setTypeof);

    @Relation("HAS_CASE")
    TerminalNodeStrings getCase();

    void setCase(TerminalNodeStrings setCase);

    @Relation("HAS_ELSE")
    TerminalNodeStrings getElse();

    void setElse(TerminalNodeStrings setElse);

    @Relation("HAS_NEW")
    TerminalNodeStrings getNew();

    void setNew(TerminalNodeStrings setNew);

    @Relation("HAS_VAR")
    TerminalNodeStrings getVar();

    void setVar(TerminalNodeStrings setVar);

    @Relation("HAS_CATCH")
    TerminalNodeStrings getCatch();

    void setCatch(TerminalNodeStrings setCatch);

    @Relation("HAS_FINALLY")
    TerminalNodeStrings getFinally();

    void setFinally(TerminalNodeStrings setFinally);

    @Relation("HAS_RETURN")
    TerminalNodeStrings getReturn();

    void setReturn(TerminalNodeStrings setReturn);

    @Relation("HAS_VOID")
    TerminalNodeStrings getVoid();

    void setVoid(TerminalNodeStrings setVoid);

    @Relation("HAS_CONTINUE")
    TerminalNodeStrings getContinue();

    void setContinue(TerminalNodeStrings setContinue);

    @Relation("HAS_FOR")
    TerminalNodeStrings getFor();

    void setFor(TerminalNodeStrings setFor);

    @Relation("HAS_SWITCH")
    TerminalNodeStrings getSwitch();

    void setSwitch(TerminalNodeStrings setSwitch);

    @Relation("HAS_WHILE")
    TerminalNodeStrings getWhile();

    void setWhile(TerminalNodeStrings setWhile);

    @Relation("HAS_DEBUGGER")
    TerminalNodeStrings getDebugger();

    void setDebugger(TerminalNodeStrings setDebugger);

    @Relation("HAS_FUNCTION")
    TerminalNodeStrings getFunction_();

    void setFunction_(TerminalNodeStrings setFunction_);

    @Relation("HAS_THIS")
    TerminalNodeStrings getThis();

    void setThis(TerminalNodeStrings setThis);

    @Relation("HAS_WITH")
    TerminalNodeStrings getWith();

    void setWith(TerminalNodeStrings setWith);

    @Relation("HAS_DEFAULT")
    TerminalNodeStrings getDefault();

    void setDefault(TerminalNodeStrings setDefault);

    @Relation("HAS_IF")
    TerminalNodeStrings getIf();

    void setIf(TerminalNodeStrings setIf);

    @Relation("HAS_THROW")
    TerminalNodeStrings getThrow();

    void setThrow(TerminalNodeStrings setThrow);

    @Relation("HAS_DELETE")
    TerminalNodeStrings getDelete();

    void setDelete(TerminalNodeStrings setDelete);

    @Relation("HAS_IN")
    TerminalNodeStrings getIn();

    void setIn(TerminalNodeStrings setIn);

    @Relation("HAS_TRY")
    TerminalNodeStrings getTry();

    void setTry(TerminalNodeStrings setTry);

    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);

    @Relation("HAS_ASYNC")
    TerminalNodeStrings getAsync();

    void setAsync(TerminalNodeStrings setAsync);

    @Relation("HAS_FROM")
    TerminalNodeStrings getFrom();

    void setFrom(TerminalNodeStrings setFrom);

    @Relation("HAS_CLASS")
    TerminalNodeStrings getClazz();

    void setClazz(TerminalNodeStrings setClazz);

    @Relation("HAS_ENUM")
    TerminalNodeStrings getEnum();

    void setEnum(TerminalNodeStrings setEnum);

    @Relation("HAS_EXTENDS")
    TerminalNodeStrings getExtends();

    void setExtends(TerminalNodeStrings setExtends);

    @Relation("HAS_SUPER")
    TerminalNodeStrings getSuper();

    void setSuper(TerminalNodeStrings setSuper);

    @Relation("HAS_CONST")
    TerminalNodeStrings getConst();

    void setConst(TerminalNodeStrings setConst);

    @Relation("HAS_EXPORT")
    TerminalNodeStrings getExport();

    void setExport(TerminalNodeStrings setExport);

    @Relation("HAS_IMPORT")
    TerminalNodeStrings getImport();

    void setImport(TerminalNodeStrings setImport);

    @Relation("HAS_IMPLEMENTS")
    TerminalNodeStrings getImplements();

    void setImplements(TerminalNodeStrings setImplements);

    @Relation("HAS_LET")
    TerminalNodeStrings getLet();

    void setLet(TerminalNodeStrings setLet);

    @Relation("HAS_PRIVATE")
    TerminalNodeStrings getPrivate();

    void setPrivate(TerminalNodeStrings setPrivate);

    @Relation("HAS_PUBLIC")
    TerminalNodeStrings getPublic();

    void setPublic(TerminalNodeStrings setPublic);

    @Relation("HAS_INTERFACE")
    TerminalNodeStrings getInterface();

    void setInterface(TerminalNodeStrings setInterface);

    @Relation("HAS_PACKAGE")
    TerminalNodeStrings getPackage();

    void setPackage(TerminalNodeStrings setPackage);

    @Relation("HAS_PROTECTED")
    TerminalNodeStrings getProtected();

    void setProtected(TerminalNodeStrings setProtected);

    @Relation("HAS_STATIC")
    TerminalNodeStrings getStatic();

    void setStatic(TerminalNodeStrings setStatic);

    @Relation("HAS_YIELD")
    TerminalNodeStrings getYield();

    void setYield(TerminalNodeStrings setYield);

    @Relation("HAS_GET")
    TerminalNodeStrings getGet();

    void setGet(TerminalNodeStrings setGet);

    @Relation("HAS_SET")
    TerminalNodeStrings getSet();

    void setSet(TerminalNodeStrings setSet);

    @Relation("HAS_REQUIRE")
    TerminalNodeStrings getRequire();

    void setRequire(TerminalNodeStrings setRequire);

    @Relation("HAS_TYPE_ALIAS")
    TerminalNodeStrings getTypeAlias();

    void setTypeAlias(TerminalNodeStrings setTypeAlias);

    @Relation("HAS_STRING")
    TerminalNodeStrings getString();

    void setString(TerminalNodeStrings setString);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}

// Generated from Java8Parser by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, LINE_COMMENT=107;
	public static final int
		RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6, RULE_classType = 7, RULE_classType_lf_classOrInterfaceType = 8, RULE_classType_lfno_classOrInterfaceType = 9, RULE_interfaceType = 10, RULE_interfaceType_lf_classOrInterfaceType = 11, RULE_interfaceType_lfno_classOrInterfaceType = 12, RULE_typeVariable = 13, RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeParameterModifier = 17, RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20, RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23, RULE_wildcardBounds = 24, RULE_packageName = 25, RULE_typeName = 26, RULE_packageOrTypeName = 27, RULE_expressionName = 28, RULE_methodName = 29, RULE_ambiguousName = 30, RULE_compilationUnit = 31, RULE_packageDeclaration = 32, RULE_packageModifier = 33, RULE_importDeclaration = 34, RULE_singleTypeImportDeclaration = 35, RULE_typeImportOnDemandDeclaration = 36, RULE_singleStaticImportDeclaration = 37, RULE_staticImportOnDemandDeclaration = 38, RULE_typeDeclaration = 39, RULE_classDeclaration = 40, RULE_normalClassDeclaration = 41, RULE_classModifier = 42, RULE_visibilityModifier = 43, RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46, RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49, RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58, RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63, RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65, RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70, RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103, RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105, RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108, RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111, RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113, RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116, RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119, RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121, RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124, RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127, RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129, RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132, RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134, RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137, RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140, RULE_ifThenElseStatementNoShortIf = 141, RULE_assertStatement = 142, RULE_switchStatement = 143, RULE_switchBlock = 144, RULE_switchBlockStatementGroup = 145, RULE_switchLabels = 146, RULE_switchLabel = 147, RULE_enumConstantName = 148, RULE_whileStatement = 149, RULE_whileStatementNoShortIf = 150, RULE_doStatement = 151, RULE_forStatement = 152, RULE_forStatementNoShortIf = 153, RULE_basicForStatement = 154, RULE_basicForStatementNoShortIf = 155, RULE_forInit = 156, RULE_forUpdate = 157, RULE_statementExpressionList = 158, RULE_enhancedForStatement = 159, RULE_enhancedForStatementNoShortIf = 160, RULE_breakStatement = 161, RULE_continueStatement = 162, RULE_returnStatement = 163, RULE_throwStatement = 164, RULE_synchronizedStatement = 165, RULE_tryStatement = 166, RULE_catches = 167, RULE_catchClause = 168, RULE_catchFormalParameter = 169, RULE_catchType = 170, RULE_finally_ = 171, RULE_tryWithResourcesStatement = 172, RULE_resourceSpecification = 173, RULE_resourceList = 174, RULE_resource = 175, RULE_primary = 176, RULE_primaryNoNewArray = 177, RULE_primaryNoNewArray_lf_arrayAccess = 178, RULE_primaryNoNewArray_lfno_arrayAccess = 179, RULE_primaryNoNewArray_lf_primary = 180, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182, RULE_primaryNoNewArray_lfno_primary = 183, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185, RULE_classInstanceCreationExpression = 186, RULE_classInstanceCreationExpression_lf_primary = 187, RULE_classInstanceCreationExpression_lfno_primary = 188, RULE_typeArgumentsOrDiamond = 189, RULE_fieldAccess = 190, RULE_fieldAccess_lf_primary = 191, RULE_fieldAccess_lfno_primary = 192, RULE_arrayAccess = 193, RULE_arrayAccess_lf_primary = 194, RULE_arrayAccess_lfno_primary = 195, RULE_methodInvocation = 196, RULE_methodInvocation_lf_primary = 197, RULE_methodInvocation_lfno_primary = 198, RULE_argumentList = 199, RULE_methodReference = 200, RULE_methodReference_lf_primary = 201, RULE_methodReference_lfno_primary = 202, RULE_arrayCreationExpression = 203, RULE_dimExprs = 204, RULE_dimExpr = 205, RULE_constantExpression = 206, RULE_expression = 207, RULE_lambdaExpression = 208, RULE_lambdaParameters = 209, RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211, RULE_assignmentExpression = 212, RULE_assignment = 213, RULE_leftHandSide = 214, RULE_assignmentOperator = 215, RULE_conditionalExpression = 216, RULE_conditionalOrExpression = 217, RULE_conditionalAndExpression = 218, RULE_inclusiveOrExpression = 219, RULE_exclusiveOrExpression = 220, RULE_andExpression = 221, RULE_equalityExpression = 222, RULE_relationalExpression = 223, RULE_shiftExpression = 224, RULE_additiveExpression = 225, RULE_multiplicativeExpression = 226, RULE_unaryExpression = 227, RULE_preIncrementExpression = 228, RULE_preDecrementExpression = 229, RULE_unaryExpressionNotPlusMinus = 230, RULE_postfixExpression = 231, RULE_postIncrementExpression = 232, RULE_postIncrementExpression_lf_postfixExpression = 233, RULE_postDecrementExpression = 234, RULE_postDecrementExpression_lf_postfixExpression = 235, RULE_castExpression = 236;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "primitiveType", "numericType", "integralType", "floatingPointType", "referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", "classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", "interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", "dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", "packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", "ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", "importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", "classDeclaration", "normalClassDeclaration", "classModifier", "visibilityModifier", "typeParameters", "typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", "variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", "formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", "throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", "staticInitializer", "constructorDeclaration", "constructorModifier", "constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", "enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", "enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", "interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", "constantDeclaration", "constantModifier", "interfaceMethodDeclaration", "interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", "annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", "annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", "elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", "elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", "variableInitializerList", "block", "blockStatements", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", "labeledStatement", "labeledStatementNoShortIf", "expressionStatement", "statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", "assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", "switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", "doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", "basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", "enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", "continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", "finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", "resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", "primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", "primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", "primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", "arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", "arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", "expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", "lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", "unaryExpression", "preIncrementExpression", "preDecrementExpression", "unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", "postIncrementExpression_lf_postfixExpression", "postDecrementExpression", "postDecrementExpression_lf_postfixExpression", "castExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8Parser"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(Java8Parser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(476);
					annotation();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(483);
					annotation();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(Java8Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(Java8Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(Java8Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(Java8Parser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(Java8Parser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(Java8Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(Java8Parser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(505);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(506);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(511);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(509);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(510);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classType);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(516);
					annotation();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				match(Identifier);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(523);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				classOrInterfaceType();
				setState(527);
				match(DOT);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(528);
					annotation();
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(534);
				match(Identifier);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(535);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(DOT);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(541);
				annotation();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(Identifier);
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(548);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(551);
				annotation();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
			match(Identifier);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(558);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(567);
				annotation();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				primitiveType();
				setState(576);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				classOrInterfaceType();
				setState(579);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				typeVariable();
				setState(582);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(586);
				annotation();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			match(LBRACK);
			setState(593);
			match(RBRACK);
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(594);
						annotation();
						}
						}
						setState(599);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(600);
					match(LBRACK);
					setState(601);
					match(RBRACK);
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(607);
				typeParameterModifier();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(Identifier);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(614);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(EXTENDS);
				setState(620);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(EXTENDS);
				setState(622);
				classOrInterfaceType();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(623);
					additionalBound();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(Java8Parser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(BITAND);
			setState(632);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(LT);
			setState(635);
			typeArgumentList();
			setState(636);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			typeArgument();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(639);
				match(COMMA);
				setState(640);
				typeArgument();
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Java8Parser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(650);
				annotation();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(656);
			match(QUESTION);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(657);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				match(EXTENDS);
				setState(661);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(SUPER);
				setState(663);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(667);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(669);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(670);
					match(DOT);
					setState(671);
					match(Identifier);
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeName);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				packageOrTypeName(0);
				setState(679);
				match(DOT);
				setState(680);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(685);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(687);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(688);
					match(DOT);
					setState(689);
					match(Identifier);
					}
					} 
				}
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionName);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				ambiguousName(0);
				setState(697);
				match(DOT);
				setState(698);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(705);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(707);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(708);
					match(DOT);
					setState(709);
					match(Identifier);
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(715);
				packageDeclaration();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(718);
				importDeclaration();
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(724);
				typeDeclaration();
				}
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(730);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Java8Parser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(732);
				packageModifier();
				}
				}
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(738);
			match(PACKAGE);
			setState(739);
			packageName(0);
			setState(740);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importDeclaration);
		try {
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(747);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(IMPORT);
			setState(751);
			typeName();
			setState(752);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(IMPORT);
			setState(755);
			packageOrTypeName(0);
			setState(756);
			match(DOT);
			setState(757);
			match(MUL);
			setState(758);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(IMPORT);
			setState(761);
			match(STATIC);
			setState(762);
			typeName();
			setState(763);
			match(DOT);
			setState(764);
			match(Identifier);
			setState(765);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java8Parser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(IMPORT);
			setState(768);
			match(STATIC);
			setState(769);
			typeName();
			setState(770);
			match(DOT);
			setState(771);
			match(MUL);
			setState(772);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeDeclaration);
		try {
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classDeclaration);
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(783);
				classModifier();
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			match(CLASS);
			setState(790);
			match(Identifier);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(791);
				typeParameters();
				}
			}

			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(794);
				superclass();
				}
			}

			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(797);
				superinterfaces();
				}
			}

			setState(800);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classModifier);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				annotation();
				}
				break;
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				visibilityModifier();
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(805);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(806);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(807);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java8Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java8Parser.PRIVATE, 0); }
		public VisibilityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVisibilityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVisibilityModifier(this);
		}
	}

	public final VisibilityModifierContext visibilityModifier() throws RecognitionException {
		VisibilityModifierContext _localctx = new VisibilityModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_visibilityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(LT);
			setState(813);
			typeParameterList();
			setState(814);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			typeParameter();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(817);
				match(COMMA);
				setState(818);
				typeParameter();
				}
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(EXTENDS);
			setState(825);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(Java8Parser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(IMPLEMENTS);
			setState(828);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			interfaceType();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(831);
				match(COMMA);
				setState(832);
				interfaceType();
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(LBRACE);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(839);
				classBodyDeclaration();
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(850);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(855);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(857);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(860);
				fieldModifier();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(866);
			unannType();
			setState(867);
			variableDeclaratorList();
			setState(868);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(Java8Parser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(Java8Parser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				annotation();
				}
				break;
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				visibilityModifier();
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(874);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(875);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			variableDeclarator();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(879);
				match(COMMA);
				setState(880);
				variableDeclarator();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			variableDeclaratorId();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(887);
				match(ASSIGN);
				setState(888);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(Identifier);
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(892);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(Java8Parser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(912);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(913);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(916);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(917);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				match(Identifier);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(924);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				unannClassOrInterfaceType();
				setState(928);
				match(DOT);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(929);
					annotation();
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(935);
				match(Identifier);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(936);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(DOT);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(942);
				annotation();
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			match(Identifier);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(949);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(Identifier);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(953);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				unannPrimitiveType();
				setState(965);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				unannClassOrInterfaceType();
				setState(968);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				unannTypeVariable();
				setState(971);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(975);
				methodModifier();
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981);
			methodHeader();
			setState(982);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java8Parser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(Java8Parser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				annotation();
				}
				break;
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				visibilityModifier();
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(987);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(988);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 6);
				{
				setState(989);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 7);
				{
				setState(990);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(991);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				result();
				setState(995);
				methodDeclarator();
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(996);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				typeParameters();
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1000);
					annotation();
					}
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1006);
				result();
				setState(1007);
				methodDeclarator();
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1008);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(Identifier);
			setState(1018);
			match(LPAREN);
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1019);
				formalParameterList();
				}
			}

			setState(1022);
			match(RPAREN);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1023);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				formalParameters();
				setState(1028);
				match(COMMA);
				setState(1029);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				formalParameter();
				setState(1039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1035);
						match(COMMA);
						setState(1036);
						formalParameter();
						}
						} 
					}
					setState(1041);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				receiverParameter();
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1043);
						match(COMMA);
						setState(1044);
						formalParameter();
						}
						} 
					}
					setState(1049);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1052);
				variableModifier();
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
			unannType();
			setState(1059);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1063);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(Java8Parser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1065);
					variableModifier();
					}
					}
					setState(1070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1071);
				unannType();
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1072);
					annotation();
					}
					}
					setState(1077);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1078);
				match(ELLIPSIS);
				setState(1079);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1084);
				annotation();
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1090);
			unannType();
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1091);
				match(Identifier);
				setState(1092);
				match(DOT);
				}
			}

			setState(1095);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(Java8Parser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(THROWS);
			setState(1098);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			exceptionType();
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1101);
				match(COMMA);
				setState(1102);
				exceptionType();
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(STATIC);
			setState(1119);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1121);
				constructorModifier();
				}
				}
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1127);
			constructorDeclarator();
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1128);
				throws_();
				}
			}

			setState(1131);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				annotation();
				}
				break;
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				visibilityModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1137);
				typeParameters();
				}
			}

			setState(1140);
			simpleTypeName();
			setState(1141);
			match(LPAREN);
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1142);
				formalParameterList();
				}
			}

			setState(1145);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(LBRACE);
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1150);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1153);
				blockStatements();
				}
			}

			setState(1156);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1158);
					typeArguments();
					}
				}

				setState(1161);
				match(THIS);
				setState(1162);
				match(LPAREN);
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1163);
					argumentList();
					}
				}

				setState(1166);
				match(RPAREN);
				setState(1167);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1168);
					typeArguments();
					}
				}

				setState(1171);
				match(SUPER);
				setState(1172);
				match(LPAREN);
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1173);
					argumentList();
					}
				}

				setState(1176);
				match(RPAREN);
				setState(1177);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
				expressionName();
				setState(1179);
				match(DOT);
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1180);
					typeArguments();
					}
				}

				setState(1183);
				match(SUPER);
				setState(1184);
				match(LPAREN);
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1185);
					argumentList();
					}
				}

				setState(1188);
				match(RPAREN);
				setState(1189);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1191);
				primary();
				setState(1192);
				match(DOT);
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1193);
					typeArguments();
					}
				}

				setState(1196);
				match(SUPER);
				setState(1197);
				match(LPAREN);
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1198);
					argumentList();
					}
				}

				setState(1201);
				match(RPAREN);
				setState(1202);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Java8Parser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1206);
				classModifier();
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1212);
			match(ENUM);
			setState(1213);
			match(Identifier);
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1214);
				superinterfaces();
				}
			}

			setState(1217);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(LBRACE);
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1220);
				enumConstantList();
				}
			}

			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1223);
				match(COMMA);
				}
			}

			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1226);
				enumBodyDeclarations();
				}
			}

			setState(1229);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			enumConstant();
			setState(1236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1232);
					match(COMMA);
					setState(1233);
					enumConstant();
					}
					} 
				}
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1239);
				enumConstantModifier();
				}
				}
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1245);
			match(Identifier);
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1246);
				match(LPAREN);
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1247);
					argumentList();
					}
				}

				setState(1250);
				match(RPAREN);
				}
			}

			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1253);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(SEMI);
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1259);
				classBodyDeclaration();
				}
				}
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(Java8Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1269);
				interfaceModifier();
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1275);
			match(INTERFACE);
			setState(1276);
			match(Identifier);
			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1277);
				typeParameters();
				}
			}

			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1280);
				extendsInterfaces();
				}
			}

			setState(1283);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VisibilityModifierContext visibilityModifier() {
			return getRuleContext(VisibilityModifierContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285);
				annotation();
				}
				break;
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				visibilityModifier();
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1287);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1288);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1289);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(Java8Parser.EXTENDS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(EXTENDS);
			setState(1293);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			match(LBRACE);
			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1296);
				interfaceMemberDeclaration();
				}
				}
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1302);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1308);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1311);
				constantModifier();
				}
				}
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1317);
			unannType();
			setState(1318);
			variableDeclaratorList();
			setState(1319);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(Java8Parser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1324);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1327);
				interfaceMethodModifier();
				}
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1333);
			methodHeader();
			setState(1334);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(Java8Parser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(Java8Parser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1338);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1339);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1340);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1341);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Java8Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1344);
					interfaceModifier();
					}
					} 
				}
				setState(1349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1350);
			match(AT);
			setState(1351);
			match(INTERFACE);
			setState(1352);
			match(Identifier);
			setState(1353);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(LBRACE);
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1356);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1362);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1366);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1367);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1368);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1371);
				annotationTypeElementModifier();
				}
				}
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1377);
			unannType();
			setState(1378);
			match(Identifier);
			setState(1379);
			match(LPAREN);
			setState(1380);
			match(RPAREN);
			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1381);
				dims();
				}
			}

			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1384);
				defaultValue();
				}
			}

			setState(1387);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java8Parser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java8Parser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1389);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			match(DEFAULT);
			setState(1395);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1399);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(AT);
			setState(1403);
			typeName();
			setState(1404);
			match(LPAREN);
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1405);
				elementValuePairList();
				}
			}

			setState(1408);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			elementValuePair();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1411);
				match(COMMA);
				setState(1412);
				elementValuePair();
				}
				}
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			match(Identifier);
			setState(1419);
			match(ASSIGN);
			setState(1420);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1424);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(LBRACE);
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1428);
				elementValueList();
				}
			}

			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1431);
				match(COMMA);
				}
			}

			setState(1434);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			elementValue();
			setState(1441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1437);
					match(COMMA);
					setState(1438);
					elementValue();
					}
					} 
				}
				setState(1443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(AT);
			setState(1445);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java8Parser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			match(AT);
			setState(1448);
			typeName();
			setState(1449);
			match(LPAREN);
			setState(1450);
			elementValue();
			setState(1451);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java8Parser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			match(LBRACE);
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1454);
				variableInitializerList();
				}
			}

			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1457);
				match(COMMA);
				}
			}

			setState(1460);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			variableInitializer();
			setState(1467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1463);
					match(COMMA);
					setState(1464);
					variableInitializer();
					}
					} 
				}
				setState(1469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			match(LBRACE);
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1471);
				blockStatements();
				}
			}

			setState(1474);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1476);
				blockStatement();
				}
				}
				setState(1479); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1482);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1483);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			localVariableDeclaration();
			setState(1487);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1489);
				variableModifier();
				}
				}
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1495);
			unannType();
			setState(1496);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1501);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1502);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1503);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1508);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1509);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1510);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1515);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1516);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1517);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1518);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1519);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1520);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1521);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1522);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1523);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1524);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			match(Identifier);
			setState(1530);
			match(COLON);
			setState(1531);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(Identifier);
			setState(1534);
			match(COLON);
			setState(1535);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			statementExpression();
			setState(1538);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1540);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1543);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1544);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1545);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1546);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(IF);
			setState(1550);
			match(LPAREN);
			setState(1551);
			expression();
			setState(1552);
			match(RPAREN);
			setState(1553);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Java8Parser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(IF);
			setState(1556);
			match(LPAREN);
			setState(1557);
			expression();
			setState(1558);
			match(RPAREN);
			setState(1559);
			statementNoShortIf();
			setState(1560);
			match(ELSE);
			setState(1561);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Java8Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Java8Parser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(IF);
			setState(1564);
			match(LPAREN);
			setState(1565);
			expression();
			setState(1566);
			match(RPAREN);
			setState(1567);
			statementNoShortIf();
			setState(1568);
			match(ELSE);
			setState(1569);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(Java8Parser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1571);
				match(ASSERT);
				setState(1572);
				expression();
				setState(1573);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1575);
				match(ASSERT);
				setState(1576);
				expression();
				setState(1577);
				match(COLON);
				setState(1578);
				expression();
				setState(1579);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(Java8Parser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(SWITCH);
			setState(1584);
			match(LPAREN);
			setState(1585);
			expression();
			setState(1586);
			match(RPAREN);
			setState(1587);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java8Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java8Parser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(LBRACE);
			setState(1593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1590);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1596);
				switchLabel();
				}
				}
				setState(1601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1602);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			switchLabels();
			setState(1605);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			switchLabel();
			setState(1611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1608);
				switchLabel();
				}
				}
				setState(1613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Java8Parser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Java8Parser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614);
				match(CASE);
				setState(1615);
				constantExpression();
				setState(1616);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				match(CASE);
				setState(1619);
				enumConstantName();
				setState(1620);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1622);
				match(DEFAULT);
				setState(1623);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(WHILE);
			setState(1629);
			match(LPAREN);
			setState(1630);
			expression();
			setState(1631);
			match(RPAREN);
			setState(1632);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(WHILE);
			setState(1635);
			match(LPAREN);
			setState(1636);
			expression();
			setState(1637);
			match(RPAREN);
			setState(1638);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Java8Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Java8Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(DO);
			setState(1641);
			statement();
			setState(1642);
			match(WHILE);
			setState(1643);
			match(LPAREN);
			setState(1644);
			expression();
			setState(1645);
			match(RPAREN);
			setState(1646);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			match(FOR);
			setState(1657);
			match(LPAREN);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1658);
				forInit();
				}
			}

			setState(1661);
			match(SEMI);
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1662);
				expression();
				}
			}

			setState(1665);
			match(SEMI);
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1666);
				forUpdate();
				}
			}

			setState(1669);
			match(RPAREN);
			setState(1670);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(FOR);
			setState(1673);
			match(LPAREN);
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1674);
				forInit();
				}
			}

			setState(1677);
			match(SEMI);
			setState(1679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1678);
				expression();
				}
			}

			setState(1681);
			match(SEMI);
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1682);
				forUpdate();
				}
			}

			setState(1685);
			match(RPAREN);
			setState(1686);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(1690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			statementExpression();
			setState(1699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1695);
				match(COMMA);
				setState(1696);
				statementExpression();
				}
				}
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			match(FOR);
			setState(1703);
			match(LPAREN);
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1704);
				variableModifier();
				}
				}
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1710);
			unannType();
			setState(1711);
			variableDeclaratorId();
			setState(1712);
			match(COLON);
			setState(1713);
			expression();
			setState(1714);
			match(RPAREN);
			setState(1715);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java8Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(FOR);
			setState(1718);
			match(LPAREN);
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1719);
				variableModifier();
				}
				}
				setState(1724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1725);
			unannType();
			setState(1726);
			variableDeclaratorId();
			setState(1727);
			match(COLON);
			setState(1728);
			expression();
			setState(1729);
			match(RPAREN);
			setState(1730);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(Java8Parser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(BREAK);
			setState(1734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1733);
				match(Identifier);
				}
			}

			setState(1736);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(Java8Parser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(CONTINUE);
			setState(1740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1739);
				match(Identifier);
				}
			}

			setState(1742);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Java8Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(RETURN);
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1745);
				expression();
				}
			}

			setState(1748);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(Java8Parser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(THROW);
			setState(1751);
			expression();
			setState(1752);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(Java8Parser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(SYNCHRONIZED);
			setState(1755);
			match(LPAREN);
			setState(1756);
			expression();
			setState(1757);
			match(RPAREN);
			setState(1758);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Java8Parser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760);
				match(TRY);
				setState(1761);
				block();
				setState(1762);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1764);
				match(TRY);
				setState(1765);
				block();
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1766);
					catches();
					}
				}

				setState(1769);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1771);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			catchClause();
			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1775);
				catchClause();
				}
				}
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(Java8Parser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			match(CATCH);
			setState(1782);
			match(LPAREN);
			setState(1783);
			catchFormalParameter();
			setState(1784);
			match(RPAREN);
			setState(1785);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1787);
				variableModifier();
				}
				}
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1793);
			catchType();
			setState(1794);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(Java8Parser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(Java8Parser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			unannClassType();
			setState(1801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1797);
				match(BITOR);
				setState(1798);
				classType();
				}
				}
				setState(1803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(Java8Parser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(FINALLY);
			setState(1805);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Java8Parser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			match(TRY);
			setState(1808);
			resourceSpecification();
			setState(1809);
			block();
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1810);
				catches();
				}
			}

			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1813);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java8Parser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			match(LPAREN);
			setState(1817);
			resourceList();
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1818);
				match(SEMI);
				}
			}

			setState(1821);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Java8Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java8Parser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			resource();
			setState(1828);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1824);
					match(SEMI);
					setState(1825);
					resource();
					}
					} 
				}
				setState(1830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1831);
				variableModifier();
				}
				}
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1837);
			unannType();
			setState(1838);
			variableDeclaratorId();
			setState(1839);
			match(ASSIGN);
			setState(1840);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1842);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1843);
				arrayCreationExpression();
				}
				break;
			}
			setState(1849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1846);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1852);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1853);
				typeName();
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1854);
					match(LBRACK);
					setState(1855);
					match(RBRACK);
					}
					}
					setState(1860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1861);
				match(DOT);
				setState(1862);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1864);
				match(VOID);
				setState(1865);
				match(DOT);
				setState(1866);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1867);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1868);
				typeName();
				setState(1869);
				match(DOT);
				setState(1870);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1872);
				match(LPAREN);
				setState(1873);
				expression();
				setState(1874);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1876);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1877);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1878);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1879);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1880);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1885);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				typeName();
				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1887);
					match(LBRACK);
					setState(1888);
					match(RBRACK);
					}
					}
					setState(1893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1894);
				match(DOT);
				setState(1895);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1897);
				match(VOID);
				setState(1898);
				match(DOT);
				setState(1899);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1900);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1901);
				typeName();
				setState(1902);
				match(DOT);
				setState(1903);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1905);
				match(LPAREN);
				setState(1906);
				expression();
				setState(1907);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1909);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1910);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1911);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1912);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1915);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1917);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1918);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1919);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1925);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1926);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1927);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1931);
				typeName();
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1932);
					match(LBRACK);
					setState(1933);
					match(RBRACK);
					}
					}
					setState(1938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1939);
				match(DOT);
				setState(1940);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1942);
				unannPrimitiveType();
				setState(1947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1943);
					match(LBRACK);
					setState(1944);
					match(RBRACK);
					}
					}
					setState(1949);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1950);
				match(DOT);
				setState(1951);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1953);
				match(VOID);
				setState(1954);
				match(DOT);
				setState(1955);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1956);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1957);
				typeName();
				setState(1958);
				match(DOT);
				setState(1959);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1961);
				match(LPAREN);
				setState(1962);
				expression();
				setState(1963);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1965);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1966);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1967);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1968);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1969);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java8Parser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java8Parser.VOID, 0); }
		public TerminalNode THIS() { return getToken(Java8Parser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				typeName();
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1976);
					match(LBRACK);
					setState(1977);
					match(RBRACK);
					}
					}
					setState(1982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1983);
				match(DOT);
				setState(1984);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1986);
				unannPrimitiveType();
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1987);
					match(LBRACK);
					setState(1988);
					match(RBRACK);
					}
					}
					setState(1993);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1994);
				match(DOT);
				setState(1995);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1997);
				match(VOID);
				setState(1998);
				match(DOT);
				setState(1999);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2000);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2001);
				typeName();
				setState(2002);
				match(DOT);
				setState(2003);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2005);
				match(LPAREN);
				setState(2006);
				expression();
				setState(2007);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2009);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2010);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2011);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2012);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2015);
				match(NEW);
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2016);
					typeArguments();
					}
				}

				setState(2022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2019);
					annotation();
					}
					}
					setState(2024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2025);
				match(Identifier);
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2026);
					match(DOT);
					setState(2030);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2027);
						annotation();
						}
						}
						setState(2032);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2033);
					match(Identifier);
					}
					}
					setState(2038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2039);
					typeArgumentsOrDiamond();
					}
				}

				setState(2042);
				match(LPAREN);
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2043);
					argumentList();
					}
				}

				setState(2046);
				match(RPAREN);
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2047);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2050);
				expressionName();
				setState(2051);
				match(DOT);
				setState(2052);
				match(NEW);
				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2053);
					typeArguments();
					}
				}

				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2056);
					annotation();
					}
					}
					setState(2061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2062);
				match(Identifier);
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2063);
					typeArgumentsOrDiamond();
					}
				}

				setState(2066);
				match(LPAREN);
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2067);
					argumentList();
					}
				}

				setState(2070);
				match(RPAREN);
				setState(2072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2071);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2074);
				primary();
				setState(2075);
				match(DOT);
				setState(2076);
				match(NEW);
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2077);
					typeArguments();
					}
				}

				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2080);
					annotation();
					}
					}
					setState(2085);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2086);
				match(Identifier);
				setState(2088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2087);
					typeArgumentsOrDiamond();
					}
				}

				setState(2090);
				match(LPAREN);
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2091);
					argumentList();
					}
				}

				setState(2094);
				match(RPAREN);
				setState(2096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2095);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			match(DOT);
			setState(2101);
			match(NEW);
			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2102);
				typeArguments();
				}
			}

			setState(2108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2105);
				annotation();
				}
				}
				setState(2110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2111);
			match(Identifier);
			setState(2113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2112);
				typeArgumentsOrDiamond();
				}
			}

			setState(2115);
			match(LPAREN);
			setState(2117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2116);
				argumentList();
				}
			}

			setState(2119);
			match(RPAREN);
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2120);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2123);
				match(NEW);
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2124);
					typeArguments();
					}
				}

				setState(2130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2127);
					annotation();
					}
					}
					setState(2132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2133);
				match(Identifier);
				setState(2144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2134);
					match(DOT);
					setState(2138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2135);
						annotation();
						}
						}
						setState(2140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2141);
					match(Identifier);
					}
					}
					setState(2146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2147);
					typeArgumentsOrDiamond();
					}
				}

				setState(2150);
				match(LPAREN);
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2151);
					argumentList();
					}
				}

				setState(2154);
				match(RPAREN);
				setState(2156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2155);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2158);
				expressionName();
				setState(2159);
				match(DOT);
				setState(2160);
				match(NEW);
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2161);
					typeArguments();
					}
				}

				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2164);
					annotation();
					}
					}
					setState(2169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2170);
				match(Identifier);
				setState(2172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2171);
					typeArgumentsOrDiamond();
					}
				}

				setState(2174);
				match(LPAREN);
				setState(2176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2175);
					argumentList();
					}
				}

				setState(2178);
				match(RPAREN);
				setState(2180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2179);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_typeArgumentsOrDiamond);
		try {
			setState(2187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2184);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2185);
				match(LT);
				setState(2186);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess);
		try {
			setState(2202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2189);
				primary();
				setState(2190);
				match(DOT);
				setState(2191);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2193);
				match(SUPER);
				setState(2194);
				match(DOT);
				setState(2195);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2196);
				typeName();
				setState(2197);
				match(DOT);
				setState(2198);
				match(SUPER);
				setState(2199);
				match(DOT);
				setState(2200);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			match(DOT);
			setState(2205);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lfno_primary);
		try {
			setState(2216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2207);
				match(SUPER);
				setState(2208);
				match(DOT);
				setState(2209);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2210);
				typeName();
				setState(2211);
				match(DOT);
				setState(2212);
				match(SUPER);
				setState(2213);
				match(DOT);
				setState(2214);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2218);
				expressionName();
				setState(2219);
				match(LBRACK);
				setState(2220);
				expression();
				setState(2221);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2223);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2224);
				match(LBRACK);
				setState(2225);
				expression();
				setState(2226);
				match(RBRACK);
				}
				break;
			}
			setState(2237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2230);
				primaryNoNewArray_lf_arrayAccess();
				setState(2231);
				match(LBRACK);
				setState(2232);
				expression();
				setState(2233);
				match(RBRACK);
				}
				}
				setState(2239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2240);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2241);
			match(LBRACK);
			setState(2242);
			expression();
			setState(2243);
			match(RBRACK);
			}
			setState(2252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2245);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2246);
					match(LBRACK);
					setState(2247);
					expression();
					setState(2248);
					match(RBRACK);
					}
					} 
				}
				setState(2254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Java8Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Java8Parser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Java8Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Java8Parser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(2255);
				expressionName();
				setState(2256);
				match(LBRACK);
				setState(2257);
				expression();
				setState(2258);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2260);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2261);
				match(LBRACK);
				setState(2262);
				expression();
				setState(2263);
				match(RBRACK);
				}
				break;
			}
			setState(2274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2267);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2268);
					match(LBRACK);
					setState(2269);
					expression();
					setState(2270);
					match(RBRACK);
					}
					} 
				}
				setState(2276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_methodInvocation);
		int _la;
		try {
			setState(2345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2277);
				methodName();
				setState(2278);
				match(LPAREN);
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2279);
					argumentList();
					}
				}

				setState(2282);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2284);
				typeName();
				setState(2285);
				match(DOT);
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2286);
					typeArguments();
					}
				}

				setState(2289);
				match(Identifier);
				setState(2290);
				match(LPAREN);
				setState(2292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2291);
					argumentList();
					}
				}

				setState(2294);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2296);
				expressionName();
				setState(2297);
				match(DOT);
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2298);
					typeArguments();
					}
				}

				setState(2301);
				match(Identifier);
				setState(2302);
				match(LPAREN);
				setState(2304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2303);
					argumentList();
					}
				}

				setState(2306);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2308);
				primary();
				setState(2309);
				match(DOT);
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2310);
					typeArguments();
					}
				}

				setState(2313);
				match(Identifier);
				setState(2314);
				match(LPAREN);
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2315);
					argumentList();
					}
				}

				setState(2318);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2320);
				match(SUPER);
				setState(2321);
				match(DOT);
				setState(2323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2322);
					typeArguments();
					}
				}

				setState(2325);
				match(Identifier);
				setState(2326);
				match(LPAREN);
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2327);
					argumentList();
					}
				}

				setState(2330);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2331);
				typeName();
				setState(2332);
				match(DOT);
				setState(2333);
				match(SUPER);
				setState(2334);
				match(DOT);
				setState(2336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2335);
					typeArguments();
					}
				}

				setState(2338);
				match(Identifier);
				setState(2339);
				match(LPAREN);
				setState(2341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2340);
					argumentList();
					}
				}

				setState(2343);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(DOT);
			setState(2349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2348);
				typeArguments();
				}
			}

			setState(2351);
			match(Identifier);
			setState(2352);
			match(LPAREN);
			setState(2354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2353);
				argumentList();
				}
			}

			setState(2356);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java8Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java8Parser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2358);
				methodName();
				setState(2359);
				match(LPAREN);
				setState(2361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2360);
					argumentList();
					}
				}

				setState(2363);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2365);
				typeName();
				setState(2366);
				match(DOT);
				setState(2368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2367);
					typeArguments();
					}
				}

				setState(2370);
				match(Identifier);
				setState(2371);
				match(LPAREN);
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2372);
					argumentList();
					}
				}

				setState(2375);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2377);
				expressionName();
				setState(2378);
				match(DOT);
				setState(2380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2379);
					typeArguments();
					}
				}

				setState(2382);
				match(Identifier);
				setState(2383);
				match(LPAREN);
				setState(2385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2384);
					argumentList();
					}
				}

				setState(2387);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2389);
				match(SUPER);
				setState(2390);
				match(DOT);
				setState(2392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2391);
					typeArguments();
					}
				}

				setState(2394);
				match(Identifier);
				setState(2395);
				match(LPAREN);
				setState(2397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2396);
					argumentList();
					}
				}

				setState(2399);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2400);
				typeName();
				setState(2401);
				match(DOT);
				setState(2402);
				match(SUPER);
				setState(2403);
				match(DOT);
				setState(2405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2404);
					typeArguments();
					}
				}

				setState(2407);
				match(Identifier);
				setState(2408);
				match(LPAREN);
				setState(2410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2409);
					argumentList();
					}
				}

				setState(2412);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2416);
			expression();
			setState(2421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2417);
				match(COMMA);
				setState(2418);
				expression();
				}
				}
				setState(2423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodReference);
		int _la;
		try {
			setState(2471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2424);
				expressionName();
				setState(2425);
				match(COLONCOLON);
				setState(2427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2426);
					typeArguments();
					}
				}

				setState(2429);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2431);
				referenceType();
				setState(2432);
				match(COLONCOLON);
				setState(2434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2433);
					typeArguments();
					}
				}

				setState(2436);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2438);
				primary();
				setState(2439);
				match(COLONCOLON);
				setState(2441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2440);
					typeArguments();
					}
				}

				setState(2443);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2445);
				match(SUPER);
				setState(2446);
				match(COLONCOLON);
				setState(2448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2447);
					typeArguments();
					}
				}

				setState(2450);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2451);
				typeName();
				setState(2452);
				match(DOT);
				setState(2453);
				match(SUPER);
				setState(2454);
				match(COLONCOLON);
				setState(2456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2455);
					typeArguments();
					}
				}

				setState(2458);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2460);
				classType();
				setState(2461);
				match(COLONCOLON);
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2462);
					typeArguments();
					}
				}

				setState(2465);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2467);
				arrayType();
				setState(2468);
				match(COLONCOLON);
				setState(2469);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			match(COLONCOLON);
			setState(2475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2474);
				typeArguments();
				}
			}

			setState(2477);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(Java8Parser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java8Parser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java8Parser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2479);
				expressionName();
				setState(2480);
				match(COLONCOLON);
				setState(2482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2481);
					typeArguments();
					}
				}

				setState(2484);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2486);
				referenceType();
				setState(2487);
				match(COLONCOLON);
				setState(2489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2488);
					typeArguments();
					}
				}

				setState(2491);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2493);
				match(SUPER);
				setState(2494);
				match(COLONCOLON);
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2495);
					typeArguments();
					}
				}

				setState(2498);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2499);
				typeName();
				setState(2500);
				match(DOT);
				setState(2501);
				match(SUPER);
				setState(2502);
				match(COLONCOLON);
				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2503);
					typeArguments();
					}
				}

				setState(2506);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2508);
				classType();
				setState(2509);
				match(COLONCOLON);
				setState(2511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2510);
					typeArguments();
					}
				}

				setState(2513);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2515);
				arrayType();
				setState(2516);
				match(COLONCOLON);
				setState(2517);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java8Parser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayCreationExpression);
		try {
			setState(2543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2521);
				match(NEW);
				setState(2522);
				primitiveType();
				setState(2523);
				dimExprs();
				setState(2525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2524);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2527);
				match(NEW);
				setState(2528);
				classOrInterfaceType();
				setState(2529);
				dimExprs();
				setState(2531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2530);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2533);
				match(NEW);
				setState(2534);
				primitiveType();
				setState(2535);
				dims();
				setState(2536);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2538);
				match(NEW);
				setState(2539);
				classOrInterfaceType();
				setState(2540);
				dims();
				setState(2541);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
			dimExpr();
			setState(2549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2546);
					dimExpr();
					}
					} 
				}
				setState(2551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Java8Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Java8Parser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2552);
				annotation();
				}
				}
				setState(2557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2558);
			match(LBRACK);
			setState(2559);
			expression();
			setState(2560);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expression);
		try {
			setState(2566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2564);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2565);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Java8Parser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			lambdaParameters();
			setState(2569);
			match(ARROW);
			setState(2570);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaParameters);
		int _la;
		try {
			setState(2582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2572);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2573);
				match(LPAREN);
				setState(2575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2574);
					formalParameterList();
					}
				}

				setState(2577);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2578);
				match(LPAREN);
				setState(2579);
				inferredFormalParameterList();
				setState(2580);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java8Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java8Parser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			match(Identifier);
			setState(2589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2585);
				match(COMMA);
				setState(2586);
				match(Identifier);
				}
				}
				setState(2591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaBody);
		try {
			setState(2594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2592);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2593);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_assignmentExpression);
		try {
			setState(2598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2596);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2597);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2600);
			leftHandSide();
			setState(2601);
			assignmentOperator();
			setState(2602);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_leftHandSide);
		try {
			setState(2607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2604);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2605);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2606);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Java8Parser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(Java8Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(Java8Parser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(Java8Parser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(Java8Parser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(Java8Parser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(Java8Parser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(Java8Parser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(Java8Parser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(Java8Parser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(Java8Parser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(Java8Parser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Java8Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java8Parser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_conditionalExpression);
		try {
			setState(2618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2611);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2612);
				conditionalOrExpression(0);
				setState(2613);
				match(QUESTION);
				setState(2614);
				expression();
				setState(2615);
				match(COLON);
				setState(2616);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(Java8Parser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2621);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2623);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2624);
					match(OR);
					setState(2625);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(Java8Parser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2632);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2634);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2635);
					match(AND);
					setState(2636);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(Java8Parser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2643);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2645);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2646);
					match(BITOR);
					setState(2647);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(Java8Parser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2654);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2656);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2657);
					match(CARET);
					setState(2658);
					andExpression(0);
					}
					} 
				}
				setState(2663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(Java8Parser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2665);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2667);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2668);
					match(BITAND);
					setState(2669);
					equalityExpression(0);
					}
					} 
				}
				setState(2674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Java8Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Java8Parser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2676);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2684);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2678);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2679);
						match(EQUAL);
						setState(2680);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2681);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2682);
						match(NOTEQUAL);
						setState(2683);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(Java8Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Java8Parser.GT, 0); }
		public TerminalNode LE() { return getToken(Java8Parser.LE, 0); }
		public TerminalNode GE() { return getToken(Java8Parser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(Java8Parser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2690);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2707);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2692);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2693);
						match(LT);
						setState(2694);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2695);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2696);
						match(GT);
						setState(2697);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2698);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2699);
						match(LE);
						setState(2700);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2701);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2702);
						match(GE);
						setState(2703);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2704);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2705);
						match(INSTANCEOF);
						setState(2706);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(Java8Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Java8Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Java8Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Java8Parser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2713);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2728);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2715);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2716);
						match(LT);
						setState(2717);
						match(LT);
						setState(2718);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2719);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2720);
						match(GT);
						setState(2721);
						match(GT);
						setState(2722);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2723);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2724);
						match(GT);
						setState(2725);
						match(GT);
						setState(2726);
						match(GT);
						setState(2727);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2734);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2742);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2736);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2737);
						match(ADD);
						setState(2738);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2739);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2740);
						match(SUB);
						setState(2741);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Java8Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Java8Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Java8Parser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2748);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2759);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2750);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2751);
						match(MUL);
						setState(2752);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2753);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2754);
						match(DIV);
						setState(2755);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2756);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2757);
						match(MOD);
						setState(2758);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(Java8Parser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(Java8Parser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_unaryExpression);
		try {
			setState(2771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2764);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2765);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2766);
				match(ADD);
				setState(2767);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2768);
				match(SUB);
				setState(2769);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2770);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2773);
			match(INC);
			setState(2774);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2776);
			match(DEC);
			setState(2777);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(Java8Parser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(Java8Parser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2779);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2780);
				match(TILDE);
				setState(2781);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2782);
				match(BANG);
				setState(2783);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2784);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2787);
				primary();
				}
				break;
			case 2:
				{
				setState(2788);
				expressionName();
				}
				break;
			}
			setState(2795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2793);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2791);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2792);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			postfixExpression();
			setState(2799);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(Java8Parser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2803);
			postfixExpression();
			setState(2804);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(Java8Parser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2806);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java8Parser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java8Parser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_castExpression);
		int _la;
		try {
			setState(2835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2808);
				match(LPAREN);
				setState(2809);
				primitiveType();
				setState(2810);
				match(RPAREN);
				setState(2811);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2813);
				match(LPAREN);
				setState(2814);
				referenceType();
				setState(2818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2815);
					additionalBound();
					}
					}
					setState(2820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2821);
				match(RPAREN);
				setState(2822);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2824);
				match(LPAREN);
				setState(2825);
				referenceType();
				setState(2829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2826);
					additionalBound();
					}
					}
					setState(2831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2832);
				match(RPAREN);
				setState(2833);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 27:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 30:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 217:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 218:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 219:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 220:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 221:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 222:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 223:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 224:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 225:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 226:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u0b18\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec\4\u00ed\t\u00ed\4\u00ee\t\u00ee\3\2\3\2\3\3\7\3\u01e0\n\3\f\3\16\3\u01e3\13\3\3\3\3\3\7\3\u01e7\n\3\f\3\16\3\u01ea\13\3\3\3\5\3\u01ed\n\3\3\4\3\4\5\4\u01f1\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u01fa\n\7\3\b\3\b\5\b\u01fe\n\b\3\b\3\b\7\b\u0202\n\b\f\b\16\b\u0205\13\b\3\t\7\t\u0208\n\t\f\t\16\t\u020b\13\t\3\t\3\t\5\t\u020f\n\t\3\t\3\t\3\t\7\t\u0214\n\t\f\t\16\t\u0217\13\t\3\t\3\t\5\t\u021b\n\t\5\t\u021d\n\t\3\n\3\n\7\n\u0221\n\n\f\n\16\n\u0224\13\n\3\n\3\n\5\n\u0228\n\n\3\13\7\13\u022b\n\13\f\13\16\13\u022e\13\13\3\13\3\13\5\13\u0232\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\7\17\u023b\n\17\f\17\16\17\u023e\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u024b\n\20\3\21\7\21\u024e\n\21\f\21\16\21\u0251\13\21\3\21\3\21\3\21\7\21\u0256\n\21\f\21\16\21\u0259\13\21\3\21\3\21\7\21\u025d\n\21\f\21\16\21\u0260\13\21\3\22\7\22\u0263\n\22\f\22\16\22\u0266\13\22\3\22\3\22\5\22\u026a\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0273\n\24\f\24\16\24\u0276\13\24\5\24\u0278\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u0284\n\27\f\27\16\27\u0287\13\27\3\30\3\30\5\30\u028b\n\30\3\31\7\31\u028e\n\31\f\31\16\31\u0291\13\31\3\31\3\31\5\31\u0295\n\31\3\32\3\32\3\32\3\32\5\32\u029b\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u02a3\n\33\f\33\16\33\u02a6\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u02ad\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u02b5\n\35\f\35\16\35\u02b8\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u02bf\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u02c9\n \f \16 \u02cc\13 \3!\5!\u02cf\n!\3!\7!\u02d2\n!\f!\16!\u02d5\13!\3!\7!\u02d8\n!\f!\16!\u02db\13!\3!\3!\3\"\7\"\u02e0\n\"\f\"\16\"\u02e3\13\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u02ef\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\5)\u030c\n)\3*\3*\5*\u0310\n*\3+\7+\u0313\n+\f+\16+\u0316\13+\3+\3+\3+\5+\u031b\n+\3+\5+\u031e\n+\3+\5+\u0321\n+\3+\3+\3,\3,\3,\3,\3,\3,\5,\u032b\n,\3-\3-\3.\3.\3.\3.\3/\3/\3/\7/\u0336\n/\f/\16/\u0339\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u0344\n\62\f\62\16\62\u0347\13\62\3\63\3\63\7\63\u034b\n\63\f\63\16\63\u034e\13\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u0356\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u035d\n\65\3\66\7\66\u0360\n\66\f\66\16\66\u0363\13\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u036f\n\67\38\38\38\78\u0374\n8\f8\168\u0377\138\39\39\39\59\u037c\n9\3:\3:\5:\u0380\n:\3;\3;\5;\u0384\n;\3<\3<\5<\u0388\n<\3=\3=\5=\u038c\n=\3>\3>\3>\5>\u0391\n>\3?\3?\5?\u0395\n?\3?\3?\7?\u0399\n?\f?\16?\u039c\13?\3@\3@\5@\u03a0\n@\3@\3@\3@\7@\u03a5\n@\f@\16@\u03a8\13@\3@\3@\5@\u03ac\n@\5@\u03ae\n@\3A\3A\7A\u03b2\nA\fA\16A\u03b5\13A\3A\3A\5A\u03b9\nA\3B\3B\5B\u03bd\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03d0\nG\3H\7H\u03d3\nH\fH\16H\u03d6\13H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03e3\nI\3J\3J\3J\5J\u03e8\nJ\3J\3J\7J\u03ec\nJ\fJ\16J\u03ef\13J\3J\3J\3J\5J\u03f4\nJ\5J\u03f6\nJ\3K\3K\5K\u03fa\nK\3L\3L\3L\5L\u03ff\nL\3L\3L\5L\u0403\nL\3M\3M\3M\3M\3M\3M\5M\u040b\nM\3N\3N\3N\7N\u0410\nN\fN\16N\u0413\13N\3N\3N\3N\7N\u0418\nN\fN\16N\u041b\13N\5N\u041d\nN\3O\7O\u0420\nO\fO\16O\u0423\13O\3O\3O\3O\3P\3P\5P\u042a\nP\3Q\7Q\u042d\nQ\fQ\16Q\u0430\13Q\3Q\3Q\7Q\u0434\nQ\fQ\16Q\u0437\13Q\3Q\3Q\3Q\3Q\5Q\u043d\nQ\3R\7R\u0440\nR\fR\16R\u0443\13R\3R\3R\3R\5R\u0448\nR\3R\3R\3S\3S\3S\3T\3T\3T\7T\u0452\nT\fT\16T\u0455\13T\3U\3U\5U\u0459\nU\3V\3V\5V\u045d\nV\3W\3W\3X\3X\3X\3Y\7Y\u0465\nY\fY\16Y\u0468\13Y\3Y\3Y\5Y\u046c\nY\3Y\3Y\3Z\3Z\5Z\u0472\nZ\3[\5[\u0475\n[\3[\3[\3[\5[\u047a\n[\3[\3[\3\\\3\\\3]\3]\5]\u0482\n]\3]\5]\u0485\n]\3]\3]\3^\5^\u048a\n^\3^\3^\3^\5^\u048f\n^\3^\3^\3^\5^\u0494\n^\3^\3^\3^\5^\u0499\n^\3^\3^\3^\3^\3^\5^\u04a0\n^\3^\3^\3^\5^\u04a5\n^\3^\3^\3^\3^\3^\3^\5^\u04ad\n^\3^\3^\3^\5^\u04b2\n^\3^\3^\3^\5^\u04b7\n^\3_\7_\u04ba\n_\f_\16_\u04bd\13_\3_\3_\3_\5_\u04c2\n_\3_\3_\3`\3`\5`\u04c8\n`\3`\5`\u04cb\n`\3`\5`\u04ce\n`\3`\3`\3a\3a\3a\7a\u04d5\na\fa\16a\u04d8\13a\3b\7b\u04db\nb\fb\16b\u04de\13b\3b\3b\3b\5b\u04e3\nb\3b\5b\u04e6\nb\3b\5b\u04e9\nb\3c\3c\3d\3d\7d\u04ef\nd\fd\16d\u04f2\13d\3e\3e\5e\u04f6\ne\3f\7f\u04f9\nf\ff\16f\u04fc\13f\3f\3f\3f\5f\u0501\nf\3f\5f\u0504\nf\3f\3f\3g\3g\3g\3g\3g\5g\u050d\ng\3h\3h\3h\3i\3i\7i\u0514\ni\fi\16i\u0517\13i\3i\3i\3j\3j\3j\3j\3j\5j\u0520\nj\3k\7k\u0523\nk\fk\16k\u0526\13k\3k\3k\3k\3k\3l\3l\3l\3l\5l\u0530\nl\3m\7m\u0533\nm\fm\16m\u0536\13m\3m\3m\3m\3n\3n\3n\3n\3n\3n\5n\u0541\nn\3o\7o\u0544\no\fo\16o\u0547\13o\3o\3o\3o\3o\3o\3p\3p\7p\u0550\np\fp\16p\u0553\13p\3p\3p\3q\3q\3q\3q\3q\5q\u055c\nq\3r\7r\u055f\nr\fr\16r\u0562\13r\3r\3r\3r\3r\3r\5r\u0569\nr\3r\5r\u056c\nr\3r\3r\3s\3s\3s\5s\u0573\ns\3t\3t\3t\3u\3u\3u\5u\u057b\nu\3v\3v\3v\3v\5v\u0581\nv\3v\3v\3w\3w\3w\7w\u0588\nw\fw\16w\u058b\13w\3x\3x\3x\3x\3y\3y\3y\5y\u0594\ny\3z\3z\5z\u0598\nz\3z\5z\u059b\nz\3z\3z\3{\3{\3{\7{\u05a2\n{\f{\16{\u05a5\13{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3~\3~\5~\u05b2\n~\3~\5~\u05b5\n~\3~\3~\3\177\3\177\3\177\7\177\u05bc\n\177\f\177\16\177\u05bf\13\177\3\u0080\3\u0080\5\u0080\u05c3\n\u0080\3\u0080\3\u0080\3\u0081\6\u0081\u05c8\n\u0081\r\u0081\16\u0081\u05c9\3\u0082\3\u0082\3\u0082\5\u0082\u05cf\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\7\u0084\u05d5\n\u0084\f\u0084\16\u0084\u05d8\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u05e3\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u05ea\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05f8\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u060e\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0630\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\7\u0092\u063a\n\u0092\f\u0092\16\u0092\u063d\13\u0092\3\u0092\7\u0092\u0640\n\u0092\f\u0092\16\u0092\u0643\13\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094\u064c\n\u0094\f\u0094\16\u0094\u064f\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u065b\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u0675\n\u009a\3\u009b\3\u009b\5\u009b\u0679\n\u009b\3\u009c\3\u009c\3\u009c\5\u009c\u067e\n\u009c\3\u009c\3\u009c\5\u009c\u0682\n\u009c\3\u009c\3\u009c\5\u009c\u0686\n\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u068e\n\u009d\3\u009d\3\u009d\5\u009d\u0692\n\u009d\3\u009d\3\u009d\5\u009d\u0696\n\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\5\u009e\u069d\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u06a4\n\u00a0\f\u00a0\16\u00a0\u06a7\13\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u06ac\n\u00a1\f\u00a1\16\u00a1\u06af\13\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u06bb\n\u00a2\f\u00a2\16\u00a2\u06be\13\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u06c9\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u06cf\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u06d5\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u06ea\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u06ef\n\u00a8\3\u00a9\3\u00a9\7\u00a9\u06f3\n\u00a9\f\u00a9\16\u00a9\u06f6\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\7\u00ab\u06ff\n\u00ab\f\u00ab\16\u00ab\u0702\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u070a\n\u00ac\f\u00ac\16\u00ac\u070d\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0716\n\u00ae\3\u00ae\5\u00ae\u0719\n\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u071e\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0725\n\u00b0\f\u00b0\16\u00b0\u0728\13\u00b0\3\u00b1\7\u00b1\u072b\n\u00b1\f\u00b1\16\u00b1\u072e\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u0737\n\u00b2\3\u00b2\7\u00b2\u073a\n\u00b2\f\u00b2\16\u00b2\u073d\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0743\n\u00b3\f\u00b3\16\u00b3\u0746\13\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u075c\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u0764\n\u00b5\f\u00b5\16\u00b5\u0767\13\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u077c\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0783\n\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u078b\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u0791\n\u00b9\f\u00b9\16\u00b9\u0794\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u079c\n\u00b9\f\u00b9\16\u00b9\u079f\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07b5\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07bd\n\u00bb\f\u00bb\16\u00bb\u07c0\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07c8\n\u00bb\f\u00bb\16\u00bb\u07cb\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07e0\n\u00bb\3\u00bc\3\u00bc\5\u00bc\u07e4\n\u00bc\3\u00bc\7\u00bc\u07e7\n\u00bc\f\u00bc\16\u00bc\u07ea\13\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u07ef\n\u00bc\f\u00bc\16\u00bc\u07f2\13\u00bc\3\u00bc\7\u00bc\u07f5\n\u00bc\f\u00bc\16\u00bc\u07f8\13\u00bc\3\u00bc\5\u00bc\u07fb\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u07ff\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0803\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0809\n\u00bc\3\u00bc\7\u00bc\u080c\n\u00bc\f\u00bc\16\u00bc\u080f\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u0813\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0817\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u081b\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0821\n\u00bc\3\u00bc\7\u00bc\u0824\n\u00bc\f\u00bc\16\u00bc\u0827\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u082b\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u082f\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0833\n\u00bc\5\u00bc\u0835\n\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u083a\n\u00bd\3\u00bd\7\u00bd\u083d\n\u00bd\f\u00bd\16\u00bd\u0840\13\u00bd\3\u00bd\3\u00bd\5\u00bd\u0844\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0848\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u084c\n\u00bd\3\u00be\3\u00be\5\u00be\u0850\n\u00be\3\u00be\7\u00be\u0853\n\u00be\f\u00be\16\u00be\u0856\13\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u085b\n\u00be\f\u00be\16\u00be\u085e\13\u00be\3\u00be\7\u00be\u0861\n\u00be\f\u00be\16\u00be\u0864\13\u00be\3\u00be\5\u00be\u0867\n\u00be\3\u00be\3\u00be\5\u00be\u086b\n\u00be\3\u00be\3\u00be\5\u00be\u086f\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0875\n\u00be\3\u00be\7\u00be\u0878\n\u00be\f\u00be\16\u00be\u087b\13\u00be\3\u00be\3\u00be\5\u00be\u087f\n\u00be\3\u00be\3\u00be\5\u00be\u0883\n\u00be\3\u00be\3\u00be\5\u00be\u0887\n\u00be\5\u00be\u0889\n\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u088e\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u089d\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08ab\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08b7\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u08be\n\u00c3\f\u00c3\16\u00c3\u08c1\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u08cd\n\u00c4\f\u00c4\16\u00c4\u08d0\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08dc\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u08e3\n\u00c5\f\u00c5\16\u00c5\u08e6\13\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08eb\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08f2\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08f7\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u08fe\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0903\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u090a\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u090f\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0916\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u091b\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0923\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0928\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u092c\n\u00c6\3\u00c7\3\u00c7\5\u00c7\u0930\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0935\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u093c\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0943\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0948\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u094f\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0954\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u095b\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0960\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0968\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u096d\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u0971\n\u00c8\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u0976\n\u00c9\f\u00c9\16\u00c9\u0979\13\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u097e\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0985\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u098c\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0993\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u099b\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09a2\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09aa\n\u00ca\3\u00cb\3\u00cb\5\u00cb\u09ae\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09b5\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09bc\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09c3\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09cb\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09d2\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09da\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09e0\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09e6\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u09f2\n\u00cd\3\u00ce\3\u00ce\7\u00ce\u09f6\n\u00ce\f\u00ce\16\u00ce\u09f9\13\u00ce\3\u00cf\7\u00cf\u09fc\n\u00cf\f\u00cf\16\u00cf\u09ff\13\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1\5\u00d1\u0a09\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a12\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a19\n\u00d3\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0a1e\n\u00d4\f\u00d4\16\u00d4\u0a21\13\u00d4\3\u00d5\3\u00d5\5\u00d5\u0a25\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a29\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a32\n\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a3d\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db\u0a45\n\u00db\f\u00db\16\u00db\u0a48\13\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a50\n\u00dc\f\u00dc\16\u00dc\u0a53\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0a5b\n\u00dd\f\u00dd\16\u00dd\u0a5e\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0a66\n\u00de\f\u00de\16\u00de\u0a69\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df\u0a71\n\u00df\f\u00df\16\u00df\u0a74\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a7f\n\u00e0\f\u00e0\16\u00e0\u0a82\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0a96\n\u00e1\f\u00e1\16\u00e1\u0a99\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0aab\n\u00e2\f\u00e2\16\u00e2\u0aae\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0ab9\n\u00e3\f\u00e3\16\u00e3\u0abc\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0aca\n\u00e4\f\u00e4\16\u00e4\u0acd\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0ad6\n\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0ae4\n\u00e8\3\u00e9\3\u00e9\5\u00e9\u0ae8\n\u00e9\3\u00e9\3\u00e9\7\u00e9\u0aec\n\u00e9\f\u00e9\16\u00e9\u0aef\13\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b03\n\u00ee\f\u00ee\16\u00ee\u0b06\13\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b0e\n\u00ee\f\u00ee\16\u00ee\u0b11\13\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b16\n\u00ee\3\u00ee\2\17\648>\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u00ef\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\2\7\3\2\65:\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20\20\26\26\3\2#%\4\2DD]g\2\u0bfe\2\u01dc\3\2\2\2\4\u01ec\3\2\2\2\6\u01f0\3\2\2\2\b\u01f2\3\2\2\2\n\u01f4\3\2\2\2\f\u01f9\3\2\2\2\16\u01fd\3\2\2\2\20\u021c\3\2\2\2\22\u021e\3\2\2\2\24\u022c\3\2\2\2\26\u0233\3\2\2\2\30\u0235\3\2\2\2\32\u0237\3\2\2\2\34\u023c\3\2\2\2\36\u024a\3\2\2\2 \u024f\3\2\2\2\"\u0264\3\2\2\2$\u026b\3\2\2\2&\u0277\3\2\2\2(\u0279\3\2\2\2*\u027c\3\2\2\2,\u0280\3\2\2\2.\u028a\3\2\2\2\60\u028f\3\2\2\2\62\u029a\3\2\2\2\64\u029c\3\2\2\2\66\u02ac\3\2\2\28\u02ae\3\2\2\2:\u02be\3\2\2\2<\u02c0\3\2\2\2>\u02c2\3\2\2\2@\u02ce\3\2\2\2B\u02e1\3\2\2\2D\u02e8\3\2\2\2F\u02ee\3\2\2\2H\u02f0\3\2\2\2J\u02f4\3\2\2\2L\u02fa\3\2\2\2N\u0301\3\2\2\2P\u030b\3\2\2\2R\u030f\3\2\2\2T\u0314\3\2\2\2V\u032a\3\2\2\2X\u032c\3\2\2\2Z\u032e\3\2\2\2\\\u0332\3\2\2\2^\u033a\3\2\2\2`\u033d\3\2\2\2b\u0340\3\2\2\2d\u0348\3\2\2\2f\u0355\3\2\2\2h\u035c\3\2\2\2j\u0361\3\2\2\2l\u036e\3\2\2\2n\u0370\3\2\2\2p\u0378\3\2\2\2r\u037d\3\2\2\2t\u0383\3\2\2\2v\u0387\3\2\2\2x\u038b\3\2\2\2z\u0390\3\2\2\2|\u0394\3\2\2\2~\u03ad\3\2\2\2\u0080\u03af\3\2\2\2\u0082\u03ba\3\2\2\2\u0084\u03be\3\2\2\2\u0086\u03c0\3\2\2\2\u0088\u03c2\3\2\2\2\u008a\u03c4\3\2\2\2\u008c\u03cf\3\2\2\2\u008e\u03d4\3\2\2\2\u0090\u03e2\3\2\2\2\u0092\u03f5\3\2\2\2\u0094\u03f9\3\2\2\2\u0096\u03fb\3\2\2\2\u0098\u040a\3\2\2\2\u009a\u041c\3\2\2\2\u009c\u0421\3\2\2\2\u009e\u0429\3\2\2\2\u00a0\u043c\3\2\2\2\u00a2\u0441\3\2\2\2\u00a4\u044b\3\2\2\2\u00a6\u044e\3\2\2\2\u00a8\u0458\3\2\2\2\u00aa\u045c\3\2\2\2\u00ac\u045e\3\2\2\2\u00ae\u0460\3\2\2\2\u00b0\u0466\3\2\2\2\u00b2\u0471\3\2\2\2\u00b4\u0474\3\2\2\2\u00b6\u047d\3\2\2\2\u00b8\u047f\3\2\2\2\u00ba\u04b6\3\2\2\2\u00bc\u04bb\3\2\2\2\u00be\u04c5\3\2\2\2\u00c0\u04d1\3\2\2\2\u00c2\u04dc\3\2\2\2\u00c4\u04ea\3\2\2\2\u00c6\u04ec\3\2\2\2\u00c8\u04f5\3\2\2\2\u00ca\u04fa\3\2\2\2\u00cc\u050c\3\2\2\2\u00ce\u050e\3\2\2\2\u00d0\u0511\3\2\2\2\u00d2\u051f\3\2\2\2\u00d4\u0524\3\2\2\2\u00d6\u052f\3\2\2\2\u00d8\u0534\3\2\2\2\u00da\u0540\3\2\2\2\u00dc\u0545\3\2\2\2\u00de\u054d\3\2\2\2\u00e0\u055b\3\2\2\2\u00e2\u0560\3\2\2\2\u00e4\u0572\3\2\2\2\u00e6\u0574\3\2\2\2\u00e8\u057a\3\2\2\2\u00ea\u057c\3\2\2\2\u00ec\u0584\3\2\2\2\u00ee\u058c\3\2\2\2\u00f0\u0593\3\2\2\2\u00f2\u0595\3\2\2\2\u00f4\u059e\3\2\2\2\u00f6\u05a6\3\2\2\2\u00f8\u05a9\3\2\2\2\u00fa\u05af\3\2\2\2\u00fc\u05b8\3\2\2\2\u00fe\u05c0\3\2\2\2\u0100\u05c7\3\2\2\2\u0102\u05ce\3\2\2\2\u0104\u05d0\3\2\2\2\u0106\u05d6\3\2\2\2\u0108\u05e2\3\2\2\2\u010a\u05e9\3\2\2\2\u010c\u05f7\3\2\2\2\u010e\u05f9\3\2\2\2\u0110\u05fb\3\2\2\2\u0112\u05ff\3\2\2\2\u0114\u0603\3\2\2\2\u0116\u060d\3\2\2\2\u0118\u060f\3\2\2\2\u011a\u0615\3\2\2\2\u011c\u061d\3\2\2\2\u011e\u062f\3\2\2\2\u0120\u0631\3\2\2\2\u0122\u0637\3\2\2\2\u0124\u0646\3\2\2\2\u0126\u0649\3\2\2\2\u0128\u065a\3\2\2\2\u012a\u065c\3\2\2\2\u012c\u065e\3\2\2\2\u012e\u0664\3\2\2\2\u0130\u066a\3\2\2\2\u0132\u0674\3\2\2\2\u0134\u0678\3\2\2\2\u0136\u067a\3\2\2\2\u0138\u068a\3\2\2\2\u013a\u069c\3\2\2\2\u013c\u069e\3\2\2\2\u013e\u06a0\3\2\2\2\u0140\u06a8\3\2\2\2\u0142\u06b7\3\2\2\2\u0144\u06c6\3\2\2\2\u0146\u06cc\3\2\2\2\u0148\u06d2\3\2\2\2\u014a\u06d8\3\2\2\2\u014c\u06dc\3\2\2\2\u014e\u06ee\3\2\2\2\u0150\u06f0\3\2\2\2\u0152\u06f7\3\2\2\2\u0154\u0700\3\2\2\2\u0156\u0706\3\2\2\2\u0158\u070e\3\2\2\2\u015a\u0711\3\2\2\2\u015c\u071a\3\2\2\2\u015e\u0721\3\2\2\2\u0160\u072c\3\2\2\2\u0162\u0736\3\2\2\2\u0164\u075b\3\2\2\2\u0166\u075d\3\2\2\2\u0168\u077b\3\2\2\2\u016a\u0782\3\2\2\2\u016c\u0784\3\2\2\2\u016e\u078a\3\2\2\2\u0170\u07b4\3\2\2\2\u0172\u07b6\3\2\2\2\u0174\u07df\3\2\2\2\u0176\u0834\3\2\2\2\u0178\u0836\3\2\2\2\u017a\u0888\3\2\2\2\u017c\u088d\3\2\2\2\u017e\u089c\3\2\2\2\u0180\u089e\3\2\2\2\u0182\u08aa\3\2\2\2\u0184\u08b6\3\2\2\2\u0186\u08c2\3\2\2\2\u0188\u08db\3\2\2\2\u018a\u092b\3\2\2\2\u018c\u092d\3\2\2\2\u018e\u0970\3\2\2\2\u0190\u0972\3\2\2\2\u0192\u09a9\3\2\2\2\u0194\u09ab\3\2\2\2\u0196\u09d9\3\2\2\2\u0198\u09f1\3\2\2\2\u019a\u09f3\3\2\2\2\u019c\u09fd\3\2\2\2\u019e\u0a04\3\2\2\2\u01a0\u0a08\3\2\2\2\u01a2\u0a0a\3\2\2\2\u01a4\u0a18\3\2\2\2\u01a6\u0a1a\3\2\2\2\u01a8\u0a24\3\2\2\2\u01aa\u0a28\3\2\2\2\u01ac\u0a2a\3\2\2\2\u01ae\u0a31\3\2\2\2\u01b0\u0a33\3\2\2\2\u01b2\u0a3c\3\2\2\2\u01b4\u0a3e\3\2\2\2\u01b6\u0a49\3\2\2\2\u01b8\u0a54\3\2\2\2\u01ba\u0a5f\3\2\2\2\u01bc\u0a6a\3\2\2\2\u01be\u0a75\3\2\2\2\u01c0\u0a83\3\2\2\2\u01c2\u0a9a\3\2\2\2\u01c4\u0aaf\3\2\2\2\u01c6\u0abd\3\2\2\2\u01c8\u0ad5\3\2\2\2\u01ca\u0ad7\3\2\2\2\u01cc\u0ada\3\2\2\2\u01ce\u0ae3\3\2\2\2\u01d0\u0ae7\3\2\2\2\u01d2\u0af0\3\2\2\2\u01d4\u0af3\3\2\2\2\u01d6\u0af5\3\2\2\2\u01d8\u0af8\3\2\2\2\u01da\u0b15\3\2\2\2\u01dc\u01dd\t\2\2\2\u01dd\3\3\2\2\2\u01de\u01e0\5\u00e8u\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01ed\5\6\4\2\u01e5\u01e7\5\u00e8u\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\7\5\2\2\u01ec\u01e1\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ed\5\3\2\2\2\u01ee\u01f1\5\b\5\2\u01ef\u01f1\5\n\6\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1\7\3\2\2\2\u01f2\u01f3\t\3\2\2\u01f3\t\3\2\2\2\u01f4\u01f5\t\4\2\2\u01f5\13\3\2\2\2\u01f6\u01fa\5\16\b\2\u01f7\u01fa\5\34\17\2\u01f8\u01fa\5\36\20\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\r\3\2\2\2\u01fb\u01fe\5\24\13\2\u01fc\u01fe\5\32\16\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0203\3\2\2\2\u01ff\u0202\5\22\n\2\u0200\u0202\5\30\r\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\17\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208\5\u00e8u\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020e\7h\2\2\u020d\u020f\5*\26\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u021d\3\2\2\2\u0210\u0211\5\16\b\2\u0211\u0215\7C\2\2\u0212\u0214\5\u00e8u\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\7h\2\2\u0219\u021b\5*\26\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u0209\3\2\2\2\u021c\u0210\3\2\2\2\u021d\21\3\2\2\2\u021e\u0222\7C\2\2\u021f\u0221\5\u00e8u\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\7h\2\2\u0226\u0228\5*\26\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\23\3\2\2\2\u0229\u022b\5\u00e8u\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0231\7h\2\2\u0230\u0232\5*\26\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\25\3\2\2\2\u0233\u0234\5\20\t\2\u0234\27\3\2\2\2\u0235\u0236\5\22\n\2\u0236\31\3\2\2\2\u0237\u0238\5\24\13\2\u0238\33\3\2\2\2\u0239\u023b\5\u00e8u\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7h\2\2\u0240\35\3\2\2\2\u0241\u0242\5\4\3\2\u0242\u0243\5 \21\2\u0243\u024b\3\2\2\2\u0244\u0245\5\16\b\2\u0245\u0246\5 \21\2\u0246\u024b\3\2\2\2\u0247\u0248\5\34\17\2\u0248\u0249\5 \21\2\u0249\u024b\3\2\2\2\u024a\u0241\3\2\2\2\u024a\u0244\3\2\2\2\u024a\u0247\3\2\2\2\u024b\37\3\2\2\2\u024c\u024e\5\u00e8u\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\7?\2\2\u0253\u025e\7@\2\2\u0254\u0256\5\u00e8u\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7?\2\2\u025b\u025d\7@\2\2\u025c\u0257\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f!\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0263\5$\23\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0269\7h\2\2\u0268\u026a\5&\24\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a#\3\2\2\2\u026b\u026c\5\u00e8u\2\u026c%\3\2\2\2\u026d\u026e\7\23\2\2\u026e\u0278\5\34\17\2\u026f\u0270\7\23\2\2\u0270\u0274\5\16\b\2\u0271\u0273\5(\25\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u026d\3\2\2\2\u0277\u026f\3\2\2\2\u0278\'\3\2\2\2\u0279\u027a\7W\2\2\u027a\u027b\5\26\f\2\u027b)\3\2\2\2\u027c\u027d\7F\2\2\u027d\u027e\5,\27\2\u027e\u027f\7E\2\2\u027f+\3\2\2\2\u0280\u0285\5.\30\2\u0281\u0282\7B\2\2\u0282\u0284\5.\30\2\u0283\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286-\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028b\5\f\7\2\u0289\u028b\5\60\31\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028b/\3\2\2\2\u028c\u028e\5\u00e8u\2\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0294\7I\2\2\u0293\u0295\5\62\32\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\61\3\2\2\2\u0296\u0297\7\23\2\2\u0297\u029b\5\f\7\2\u0298\u0299\7*\2\2\u0299\u029b\5\f\7\2\u029a\u0296\3\2\2\2\u029a\u0298\3\2\2\2\u029b\63\3\2\2\2\u029c\u029d\b\33\1\2\u029d\u029e\7h\2\2\u029e\u02a4\3\2\2\2\u029f\u02a0\f\3\2\2\u02a0\u02a1\7C\2\2\u02a1\u02a3\7h\2\2\u02a2\u029f\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\65\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02ad\7h\2\2\u02a8\u02a9\58\35\2\u02a9\u02aa\7C\2\2\u02aa\u02ab\7h\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02a7\3\2\2\2\u02ac\u02a8\3\2\2\2\u02ad\67\3\2\2\2\u02ae\u02af\b\35\1\2\u02af\u02b0\7h\2\2\u02b0\u02b6\3\2\2\2\u02b1\u02b2\f\3\2\2\u02b2\u02b3\7C\2\2\u02b3\u02b5\7h\2\2\u02b4\u02b1\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b79\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bf\7h\2\2\u02ba\u02bb\5> \2\u02bb\u02bc\7C\2\2\u02bc\u02bd\7h\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b9\3\2\2\2\u02be\u02ba\3\2\2\2\u02bf;\3\2\2\2\u02c0\u02c1\7h\2\2\u02c1=\3\2\2\2\u02c2\u02c3\b \1\2\u02c3\u02c4\7h\2\2\u02c4\u02ca\3\2\2\2\u02c5\u02c6\f\3\2\2\u02c6\u02c7\7C\2\2\u02c7\u02c9\7h\2\2\u02c8\u02c5\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb?\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02cf\5B\"\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d3\3\2\2\2\u02d0\u02d2\5F$\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d9\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\5P)\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\7\2\2\3\u02ddA\3\2\2\2\u02de\u02e0\5D#\2\u02df\u02de\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e5\7\"\2\2\u02e5\u02e6\5\64\33\2\u02e6\u02e7\7A\2\2\u02e7C\3\2\2\2\u02e8\u02e9\5\u00e8u\2\u02e9E\3\2\2\2\u02ea\u02ef\5H%\2\u02eb\u02ef\5J&\2\u02ec\u02ef\5L\'\2\u02ed\u02ef\5N(\2\u02ee\u02ea\3\2\2\2\u02ee\u02eb\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02efG\3\2\2\2\u02f0\u02f1\7\33\2\2\u02f1\u02f2\5\66\34\2\u02f2\u02f3\7A\2\2\u02f3I\3\2\2\2\u02f4\u02f5\7\33\2\2\u02f5\u02f6\58\35\2\u02f6\u02f7\7C\2\2\u02f7\u02f8\7U\2\2\u02f8\u02f9\7A\2\2\u02f9K\3\2\2\2\u02fa\u02fb\7\33\2\2\u02fb\u02fc\7(\2\2\u02fc\u02fd\5\66\34\2\u02fd\u02fe\7C\2\2\u02fe\u02ff\7h\2\2\u02ff\u0300\7A\2\2\u0300M\3\2\2\2\u0301\u0302\7\33\2\2\u0302\u0303\7(\2\2\u0303\u0304\5\66\34\2\u0304\u0305\7C\2\2\u0305\u0306\7U\2\2\u0306\u0307\7A\2\2\u0307O\3\2\2\2\u0308\u030c\5R*\2\u0309\u030c\5\u00c8e\2\u030a\u030c\7A\2\2\u030b\u0308\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030cQ\3\2\2\2\u030d\u0310\5T+\2\u030e\u0310\5\u00bc_\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2\2\u0310S\3\2\2\2\u0311\u0313\5V,\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0318\7\13\2\2\u0318\u031a\7h\2\2\u0319\u031b\5Z.\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031e\5^\60\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u0321\5`\61\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\5d\63\2\u0323U\3\2\2\2\u0324\u032b\5\u00e8u\2\u0325\u032b\5X-\2\u0326\u032b\7\3\2\2\u0327\u032b\7(\2\2\u0328\u032b\7\24\2\2\u0329\u032b\7)\2\2\u032a\u0324\3\2\2\2\u032a\u0325\3\2\2\2\u032a\u0326\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032bW\3\2\2\2\u032c\u032d\t\5\2\2\u032dY\3\2\2\2\u032e\u032f\7F\2\2\u032f\u0330\5\\/\2\u0330\u0331\7E\2\2\u0331[\3\2\2\2\u0332\u0337\5\"\22\2\u0333\u0334\7B\2\2\u0334\u0336\5\"\22\2\u0335\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338]\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033b\7\23\2\2\u033b\u033c\5\20\t\2\u033c_\3\2\2\2\u033d\u033e\7\32\2\2\u033e\u033f\5b\62\2\u033fa\3\2\2\2\u0340\u0345\5\26\f\2\u0341\u0342\7B\2\2\u0342\u0344\5\26\f\2\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346c\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u034c\7=\2\2\u0349\u034b\5f\64\2\u034a\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\7>\2\2\u0350e\3\2\2\2\u0351\u0356\5h\65\2\u0352\u0356\5\u00acW\2\u0353\u0356\5\u00aeX\2\u0354\u0356\5\u00b0Y\2\u0355\u0351\3\2\2\2\u0355\u0352\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356g\3\2\2\2\u0357\u035d\5j\66\2\u0358\u035d\5\u008eH\2\u0359\u035d\5R*\2\u035a\u035d\5\u00c8e\2\u035b\u035d\7A\2\2\u035c\u0357\3\2\2\2\u035c\u0358\3\2\2\2\u035c\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2\u035di\3\2\2\2\u035e\u0360\5l\67\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\5v<\2\u0365\u0366\5n8\2\u0366\u0367\7A\2\2\u0367k\3\2\2\2\u0368\u036f\5\u00e8u\2\u0369\u036f\5X-\2\u036a\u036f\7(\2\2\u036b\u036f\7\24\2\2\u036c\u036f\7\60\2\2\u036d\u036f\7\63\2\2\u036e\u0368\3\2\2\2\u036e\u0369\3\2\2\2\u036e\u036a\3\2\2\2\u036e\u036b\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036d\3\2\2\2\u036fm\3\2\2\2\u0370\u0375\5p9\2\u0371\u0372\7B\2\2\u0372\u0374\5p9\2\u0373\u0371\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376o\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u037b\5r:\2\u0379\u037a\7D\2\2\u037a\u037c\5t;\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037cq\3\2\2\2\u037d\u037f\7h\2\2\u037e\u0380\5 \21\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380s\3\2\2\2\u0381\u0384\5\u01a0\u00d1\2\u0382\u0384\5\u00fa~\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2\2\u0384u\3\2\2\2\u0385\u0388\5x=\2\u0386\u0388\5z>\2\u0387\u0385\3\2\2\2\u0387\u0386\3\2\2\2\u0388w\3\2\2\2\u0389\u038c\5\6\4\2\u038a\u038c\7\5\2\2\u038b\u0389\3\2\2\2\u038b\u038a\3\2\2\2\u038cy\3\2\2\2\u038d\u0391\5|?\2\u038e\u0391\5\u008aF\2\u038f\u0391\5\u008cG\2\u0390\u038d\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391{\3\2\2\2\u0392\u0395\5\u0082B\2\u0393\u0395\5\u0088E\2\u0394\u0392\3\2\2\2\u0394\u0393\3\2\2\2\u0395\u039a\3\2\2\2\u0396\u0399\5\u0080A\2\u0397\u0399\5\u0086D\2\u0398\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b}\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039f\7h\2\2\u039e\u03a0\5*\26\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03ae\3\2\2\2\u03a1\u03a2\5|?\2\u03a2\u03a6\7C\2\2\u03a3\u03a5\5\u00e8u\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03ab\7h\2\2\u03aa\u03ac\5*\26\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u039d\3\2\2\2\u03ad\u03a1\3\2\2\2\u03ae\177\3\2\2\2\u03af\u03b3\7C\2\2\u03b0\u03b2\5\u00e8u\2\u03b1\u03b0\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b8\7h\2\2\u03b7\u03b9\5*\26\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u0081\3\2\2\2\u03ba\u03bc\7h\2\2\u03bb\u03bd\5*\26\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u0083\3\2\2\2\u03be\u03bf\5~@\2\u03bf\u0085\3\2\2\2\u03c0\u03c1\5\u0080A\2\u03c1\u0087\3\2\2\2\u03c2\u03c3\5\u0082B\2\u03c3\u0089\3\2\2\2\u03c4\u03c5\7h\2\2\u03c5\u008b\3\2\2\2\u03c6\u03c7\5x=\2\u03c7\u03c8\5 \21\2\u03c8\u03d0\3\2\2\2\u03c9\u03ca\5|?\2\u03ca\u03cb\5 \21\2\u03cb\u03d0\3\2\2\2\u03cc\u03cd\5\u008aF\2\u03cd\u03ce\5 \21\2\u03ce\u03d0\3\2\2\2\u03cf\u03c6\3\2\2\2\u03cf\u03c9\3\2\2\2\u03cf\u03cc\3\2\2\2\u03d0\u008d\3\2\2\2\u03d1\u03d3\5\u0090I\2\u03d2\u03d1\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d8\5\u0092J\2\u03d8\u03d9\5\u00aaV\2\u03d9\u008f\3\2\2\2\u03da\u03e3\5\u00e8u\2\u03db\u03e3\5X-\2\u03dc\u03e3\7\3\2\2\u03dd\u03e3\7(\2\2\u03de\u03e3\7\24\2\2\u03df\u03e3\7,\2\2\u03e0\u03e3\7 \2\2\u03e1\u03e3\7)\2\2\u03e2\u03da\3\2\2\2\u03e2\u03db\3\2\2\2\u03e2\u03dc\3\2\2\2\u03e2\u03dd\3\2\2\2\u03e2\u03de\3\2\2\2\u03e2\u03df\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3\u0091\3\2\2\2\u03e4\u03e5\5\u0094K\2\u03e5\u03e7\5\u0096L\2\u03e6\u03e8\5\u00a4S\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03f6\3\2\2\2\u03e9\u03ed\5Z.\2\u03ea\u03ec\5\u00e8u\2\u03eb\u03ea\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f1\5\u0094K\2\u03f1\u03f3\5\u0096L\2\u03f2\u03f4\5\u00a4S\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03e4\3\2\2\2\u03f5\u03e9\3\2\2\2\u03f6\u0093\3\2\2\2\u03f7\u03fa\5v<\2\u03f8\u03fa\7\62\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa\u0095\3\2\2\2\u03fb\u03fc\7h\2\2\u03fc\u03fe\7;\2\2\u03fd\u03ff\5\u0098M\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\7<\2\2\u0401\u0403\5 \21\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0097\3\2\2\2\u0404\u040b\5\u00a2R\2\u0405\u0406\5\u009aN\2\u0406\u0407\7B\2\2\u0407\u0408\5\u00a0Q\2\u0408\u040b\3\2\2\2\u0409\u040b\5\u00a0Q\2\u040a\u0404\3\2\2\2\u040a\u0405\3\2\2\2\u040a\u0409\3\2\2\2\u040b\u0099\3\2\2\2\u040c\u0411\5\u009cO\2\u040d\u040e\7B\2\2\u040e\u0410\5\u009cO\2\u040f\u040d\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u041d\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0419\5\u00a2R\2\u0415\u0416\7B\2\2\u0416\u0418\5\u009cO\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u040c\3\2\2\2\u041c\u0414\3\2\2\2\u041d\u009b\3\2\2\2\u041e\u0420\5\u009eP\2\u041f\u041e\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0425\5v<\2\u0425\u0426\5r:\2\u0426\u009d\3\2\2\2\u0427\u042a\5\u00e8u\2\u0428\u042a\7\24\2\2\u0429\u0427\3\2\2\2\u0429\u0428\3\2\2\2\u042a\u009f\3\2\2\2\u042b\u042d\5\u009eP\2\u042c\u042b\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0435\5v<\2\u0432\u0434\5\u00e8u\2\u0433\u0432\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u0439\7j\2\2\u0439\u043a\5r:\2\u043a\u043d\3\2\2\2\u043b\u043d\5\u009cO\2\u043c\u042e\3\2\2\2\u043c\u043b\3\2\2\2\u043d\u00a1\3\2\2\2\u043e\u0440\5\u00e8u\2\u043f\u043e\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u0447\5v<\2\u0445\u0446\7h\2\2\u0446\u0448\7C\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\7-\2\2\u044a\u00a3\3\2\2\2\u044b\u044c\7/\2\2\u044c\u044d\5\u00a6T\2\u044d\u00a5\3\2\2\2\u044e\u0453\5\u00a8U\2\u044f\u0450\7B\2\2\u0450\u0452\5\u00a8U\2\u0451\u044f\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u00a7\3\2\2\2\u0455\u0453\3\2\2\2\u0456\u0459\5\20\t\2\u0457\u0459\5\34\17\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2\2\2\u0459\u00a9\3\2\2\2\u045a\u045d\5\u00fe\u0080\2\u045b\u045d\7A\2\2\u045c\u045a\3\2\2\2\u045c\u045b\3\2\2\2\u045d\u00ab\3\2\2\2\u045e\u045f\5\u00fe\u0080\2\u045f\u00ad\3\2\2\2\u0460\u0461\7(\2\2\u0461\u0462\5\u00fe\u0080\2\u0462\u00af\3\2\2\2\u0463\u0465\5\u00b2Z\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046b\5\u00b4[\2\u046a\u046c\5\u00a4S\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\5\u00b8]\2\u046e\u00b1\3\2\2\2\u046f\u0472\5\u00e8u\2\u0470\u0472\5X-\2\u0471\u046f\3\2\2\2\u0471\u0470\3\2\2\2\u0472\u00b3\3\2\2\2\u0473\u0475\5Z.\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\5\u00b6\\\2\u0477\u0479\7;\2\2\u0478\u047a\5\u0098M\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\7<\2\2\u047c\u00b5\3\2\2\2\u047d\u047e\7h\2\2\u047e\u00b7\3\2\2\2\u047f\u0481\7=\2\2\u0480\u0482\5\u00ba^\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u0485\5\u0100\u0081\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\7>\2\2\u0487\u00b9\3\2\2\2\u0488\u048a\5*\26\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\7-\2\2\u048c\u048e\7;\2\2\u048d\u048f\5\u0190\u00c9\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\7<\2\2\u0491\u04b7\7A\2\2\u0492\u0494\5*\26\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\7*\2\2\u0496\u0498\7;\2\2\u0497\u0499\5\u0190\u00c9\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\7<\2\2\u049b\u04b7\7A\2\2\u049c\u049d\5:\36\2\u049d\u049f\7C\2\2\u049e\u04a0\5*\26\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\7*\2\2\u04a2\u04a4\7;\2\2\u04a3\u04a5\5\u0190\u00c9\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\7<\2\2\u04a7\u04a8\7A\2\2\u04a8\u04b7\3\2\2\2\u04a9\u04aa\5\u0162\u00b2\2\u04aa\u04ac\7C\2\2\u04ab\u04ad\5*\26\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\7*\2\2\u04af\u04b1\7;\2\2\u04b0\u04b2\5\u0190\u00c9\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\7<\2\2\u04b4\u04b5\7A\2\2\u04b5\u04b7\3\2\2\2\u04b6\u0489\3\2\2\2\u04b6\u0493\3\2\2\2\u04b6\u049c\3\2\2\2\u04b6\u04a9\3\2\2\2\u04b7\u00bb\3\2\2\2\u04b8\u04ba\5V,\2\u04b9\u04b8\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be\u04bf\7\22\2\2\u04bf\u04c1\7h\2\2\u04c0\u04c2\5`\61\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\5\u00be`\2\u04c4\u00bd\3\2\2\2\u04c5\u04c7\7=\2\2\u04c6\u04c8\5\u00c0a\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04cb\7B\2\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04ce\5\u00c6d\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\7>\2\2\u04d0\u00bf\3\2\2\2\u04d1\u04d6\5\u00c2b\2\u04d2\u04d3\7B\2\2\u04d3\u04d5\5\u00c2b\2\u04d4\u04d2\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u00c1\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04db\5\u00c4c\2\u04da\u04d9\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04dc\3\2\2\2\u04df\u04e5\7h\2\2\u04e0\u04e2\7;\2\2\u04e1\u04e3\5\u0190\u00c9\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\7<\2\2\u04e5\u04e0\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7\u04e9\5d\63\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00c3\3\2\2\2\u04ea\u04eb\5\u00e8u\2\u04eb\u00c5\3\2\2\2\u04ec\u04f0\7A\2\2\u04ed\u04ef\5f\64\2\u04ee\u04ed\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u00c7\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f6\5\u00caf\2\u04f4\u04f6\5\u00dco\2\u04f5\u04f3\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6\u00c9\3\2\2\2\u04f7\u04f9\5\u00ccg\2\u04f8\u04f7\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd\u04fe\7\36\2\2\u04fe\u0500\7h\2\2\u04ff\u0501\5Z.\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u0504\5\u00ceh\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\5\u00d0i\2\u0506\u00cb\3\2\2\2\u0507\u050d\5\u00e8u\2\u0508\u050d\5X-\2\u0509\u050d\7\3\2\2\u050a\u050d\7(\2\2\u050b\u050d\7)\2\2\u050c\u0507\3\2\2\2\u050c\u0508\3\2\2\2\u050c\u0509\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050b\3\2\2\2\u050d\u00cd\3\2\2\2\u050e\u050f\7\23\2\2\u050f\u0510\5b\62\2\u0510\u00cf\3\2\2\2\u0511\u0515\7=\2\2\u0512\u0514\5\u00d2j\2\u0513\u0512\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0515\3\2\2\2\u0518\u0519\7>\2\2\u0519\u00d1\3\2\2\2\u051a\u0520\5\u00d4k\2\u051b\u0520\5\u00d8m\2\u051c\u0520\5R*\2\u051d\u0520\5\u00c8e\2\u051e\u0520\7A\2\2\u051f\u051a\3\2\2\2\u051f\u051b\3\2\2\2\u051f\u051c\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u051e\3\2\2\2\u0520\u00d3\3\2\2\2\u0521\u0523\5\u00d6l\2\u0522\u0521\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0524\3\2\2\2\u0527\u0528\5v<\2\u0528\u0529\5n8\2\u0529\u052a\7A\2\2\u052a\u00d5\3\2\2\2\u052b\u0530\5\u00e8u\2\u052c\u0530\7%\2\2\u052d\u0530\7(\2\2\u052e\u0530\7\24\2\2\u052f\u052b\3\2\2\2\u052f\u052c\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u052e\3\2\2\2\u0530\u00d7\3\2\2\2\u0531\u0533\5\u00dan\2\u0532\u0531\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538\5\u0092J\2\u0538\u0539\5\u00aaV\2\u0539\u00d9\3\2\2\2\u053a\u0541\5\u00e8u\2\u053b\u0541\7%\2\2\u053c\u0541\7\3\2\2\u053d\u0541\7\16\2\2\u053e\u0541\7(\2\2\u053f\u0541\7)\2\2\u0540\u053a\3\2\2\2\u0540\u053b\3\2\2\2\u0540\u053c\3\2\2\2\u0540\u053d\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u053f\3\2\2\2\u0541\u00db\3\2\2\2\u0542\u0544\5\u00ccg\2\u0543\u0542\3\2\2\2\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0548\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u0549\7i\2\2\u0549\u054a\7\36\2\2\u054a\u054b\7h\2\2\u054b\u054c\5\u00dep\2\u054c\u00dd\3\2\2\2\u054d\u0551\7=\2\2\u054e\u0550\5\u00e0q\2\u054f\u054e\3\2\2\2\u0550\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u0555\7>\2\2\u0555\u00df\3\2\2\2\u0556\u055c\5\u00e2r\2\u0557\u055c\5\u00d4k\2\u0558\u055c\5R*\2\u0559\u055c\5\u00c8e\2\u055a\u055c\7A\2\2\u055b\u0556\3\2\2\2\u055b\u0557\3\2\2\2\u055b\u0558\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055a\3\2\2\2\u055c\u00e1\3\2\2\2\u055d\u055f\5\u00e4s\2\u055e\u055d\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u0564\5v<\2\u0564\u0565\7h\2\2\u0565\u0566\7;\2\2\u0566\u0568\7<\2\2\u0567\u0569\5 \21\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2\2\2\u056a\u056c\5\u00e6t\2\u056b\u056a\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\7A\2\2\u056e\u00e3\3\2\2\2\u056f\u0573\5\u00e8u\2\u0570\u0573\7%\2\2\u0571\u0573\7\3\2\2\u0572\u056f\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0571\3\2\2\2\u0573\u00e5\3\2\2\2\u0574\u0575\7\16\2\2\u0575\u0576\5\u00f0y\2\u0576\u00e7\3\2\2\2\u0577\u057b\5\u00eav\2\u0578\u057b\5\u00f6|\2\u0579\u057b\5\u00f8}\2\u057a\u0577\3\2\2\2\u057a\u0578\3\2\2\2\u057a\u0579\3\2\2\2\u057b\u00e9\3\2\2\2\u057c\u057d\7i\2\2\u057d\u057e\5\66\34\2\u057e\u0580\7;\2\2\u057f\u0581\5\u00ecw\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\7<\2\2\u0583\u00eb\3\2\2\2\u0584\u0589\5\u00eex\2\u0585\u0586\7B\2\2\u0586\u0588\5\u00eex\2\u0587\u0585\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u00ed\3\2\2\2\u058b\u0589\3\2\2\2\u058c\u058d\7h\2\2\u058d\u058e\7D\2\2\u058e\u058f\5\u00f0y\2\u058f\u00ef\3\2\2\2\u0590\u0594\5\u01b2\u00da\2\u0591\u0594\5\u00f2z\2\u0592\u0594\5\u00e8u\2\u0593\u0590\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0592\3\2\2\2\u0594\u00f1\3\2\2\2\u0595\u0597\7=\2\2\u0596\u0598\5\u00f4{\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059a\3\2\2\2\u0599\u059b\7B\2\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\7>\2\2\u059d\u00f3\3\2\2\2\u059e\u05a3\5\u00f0y\2\u059f\u05a0\7B\2\2\u05a0\u05a2\5\u00f0y\2\u05a1\u059f\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u00f5\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a7\7i\2\2\u05a7\u05a8\5\66\34\2\u05a8\u00f7\3\2\2\2\u05a9\u05aa\7i\2\2\u05aa\u05ab\5\66\34\2\u05ab\u05ac\7;\2\2\u05ac\u05ad\5\u00f0y\2\u05ad\u05ae\7<\2\2\u05ae\u00f9\3\2\2\2\u05af\u05b1\7=\2\2\u05b0\u05b2\5\u00fc\177\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b5\7B\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\7>\2\2\u05b7\u00fb\3\2\2\2\u05b8\u05bd\5t;\2\u05b9\u05ba\7B\2\2\u05ba\u05bc\5t;\2\u05bb\u05b9\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u00fd\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05c2\7=\2\2\u05c1\u05c3\5\u0100\u0081\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\7>\2\2\u05c5\u00ff\3\2\2\2\u05c6\u05c8\5\u0102\u0082\2\u05c7\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u0101\3\2\2\2\u05cb\u05cf\5\u0104\u0083\2\u05cc\u05cf\5R*\2\u05cd\u05cf\5\u0108\u0085\2\u05ce\u05cb\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cd\3\2\2\2\u05cf\u0103\3\2\2\2\u05d0\u05d1\5\u0106\u0084\2\u05d1\u05d2\7A\2\2\u05d2\u0105\3\2\2\2\u05d3\u05d5\5\u009eP\2\u05d4\u05d3\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9\u05da\5v<\2\u05da\u05db\5n8\2\u05db\u0107\3\2\2\2\u05dc\u05e3\5\u010c\u0087\2\u05dd\u05e3\5\u0110\u0089\2\u05de\u05e3\5\u0118\u008d\2\u05df\u05e3\5\u011a\u008e\2\u05e0\u05e3\5\u012c\u0097\2\u05e1\u05e3\5\u0132\u009a\2\u05e2\u05dc\3\2\2\2\u05e2\u05dd\3\2\2\2\u05e2\u05de\3\2\2\2\u05e2\u05df\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e1\3\2\2\2\u05e3\u0109\3\2\2\2\u05e4\u05ea\5\u010c\u0087\2\u05e5\u05ea\5\u0112\u008a\2\u05e6\u05ea\5\u011c\u008f\2\u05e7\u05ea\5\u012e\u0098\2\u05e8\u05ea\5\u0134\u009b\2\u05e9\u05e4\3\2\2\2\u05e9\u05e5\3\2\2\2\u05e9\u05e6\3\2\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05e8\3\2\2\2\u05ea\u010b\3\2\2\2\u05eb\u05f8\5\u00fe\u0080\2\u05ec\u05f8\5\u010e\u0088\2\u05ed\u05f8\5\u0114\u008b\2\u05ee\u05f8\5\u011e\u0090\2\u05ef\u05f8\5\u0120\u0091\2\u05f0\u05f8\5\u0130\u0099\2\u05f1\u05f8\5\u0144\u00a3\2\u05f2\u05f8\5\u0146\u00a4\2\u05f3\u05f8\5\u0148\u00a5\2\u05f4\u05f8\5\u014c\u00a7\2\u05f5\u05f8\5\u014a\u00a6\2\u05f6\u05f8\5\u014e\u00a8\2\u05f7\u05eb\3\2\2\2\u05f7\u05ec\3\2\2\2\u05f7\u05ed\3\2\2\2\u05f7\u05ee\3\2\2\2\u05f7\u05ef\3\2\2\2\u05f7\u05f0\3\2\2\2\u05f7\u05f1\3\2\2\2\u05f7\u05f2\3\2\2\2\u05f7\u05f3\3\2\2\2\u05f7\u05f4\3\2\2\2\u05f7\u05f5\3\2\2\2\u05f7\u05f6\3\2\2\2\u05f8\u010d\3\2\2\2\u05f9\u05fa\7A\2\2\u05fa\u010f\3\2\2\2\u05fb\u05fc\7h\2\2\u05fc\u05fd\7J\2\2\u05fd\u05fe\5\u0108\u0085\2\u05fe\u0111\3\2\2\2\u05ff\u0600\7h\2\2\u0600\u0601\7J\2\2\u0601\u0602\5\u010a\u0086\2\u0602\u0113\3\2\2\2\u0603\u0604\5\u0116\u008c\2\u0604\u0605\7A\2\2\u0605\u0115\3\2\2\2\u0606\u060e\5\u01ac\u00d7\2\u0607\u060e\5\u01ca\u00e6\2\u0608\u060e\5\u01cc\u00e7\2\u0609\u060e\5\u01d2\u00ea\2\u060a\u060e\5\u01d6\u00ec\2\u060b\u060e\5\u018a\u00c6\2\u060c\u060e\5\u0176\u00bc\2\u060d\u0606\3\2\2\2\u060d\u0607\3\2\2\2\u060d\u0608\3\2\2\2\u060d\u0609\3\2\2\2\u060d\u060a\3\2\2\2\u060d\u060b\3\2\2\2\u060d\u060c\3\2\2\2\u060e\u0117\3\2\2\2\u060f\u0610\7\30\2\2\u0610\u0611\7;\2\2\u0611\u0612\5\u01a0\u00d1\2\u0612\u0613\7<\2\2\u0613\u0614\5\u0108\u0085\2\u0614\u0119\3\2\2\2\u0615\u0616\7\30\2\2\u0616\u0617\7;\2\2\u0617\u0618\5\u01a0\u00d1\2\u0618\u0619\7<\2\2\u0619\u061a\5\u010a\u0086\2\u061a\u061b\7\21\2\2\u061b\u061c\5\u0108\u0085\2\u061c\u011b\3\2\2\2\u061d\u061e\7\30\2\2\u061e\u061f\7;\2\2\u061f\u0620\5\u01a0\u00d1\2\u0620\u0621\7<\2\2\u0621\u0622\5\u010a\u0086\2\u0622\u0623\7\21\2\2\u0623\u0624\5\u010a\u0086\2\u0624\u011d\3\2\2\2\u0625\u0626\7\4\2\2\u0626\u0627\5\u01a0\u00d1\2\u0627\u0628\7A\2\2\u0628\u0630\3\2\2\2\u0629\u062a\7\4\2\2\u062a\u062b\5\u01a0\u00d1\2\u062b\u062c\7J\2\2\u062c\u062d\5\u01a0\u00d1\2\u062d\u062e\7A\2\2\u062e\u0630\3\2\2\2\u062f\u0625\3\2\2\2\u062f\u0629\3\2\2\2\u0630\u011f\3\2\2\2\u0631\u0632\7+\2\2\u0632\u0633\7;\2\2\u0633\u0634\5\u01a0\u00d1\2\u0634\u0635\7<\2\2\u0635\u0636\5\u0122\u0092\2\u0636\u0121\3\2\2\2\u0637\u063b\7=\2\2\u0638\u063a\5\u0124\u0093\2\u0639\u0638\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u0641\3\2\2\2\u063d\u063b\3\2\2\2\u063e\u0640\5\u0128\u0095\2\u063f\u063e\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0644\3\2\2\2\u0643\u0641\3\2\2\2\u0644\u0645\7>\2\2\u0645\u0123\3\2\2\2\u0646\u0647\5\u0126\u0094\2\u0647\u0648\5\u0100\u0081\2\u0648\u0125\3\2\2\2\u0649\u064d\5\u0128\u0095\2\u064a\u064c\5\u0128\u0095\2\u064b\u064a\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0127\3\2\2\2\u064f\u064d\3\2\2\2\u0650\u0651\7\b\2\2\u0651\u0652\5\u019e\u00d0\2\u0652\u0653\7J\2\2\u0653\u065b\3\2\2\2\u0654\u0655\7\b\2\2\u0655\u0656\5\u012a\u0096\2\u0656\u0657\7J\2\2\u0657\u065b\3\2\2\2\u0658\u0659\7\16\2\2\u0659\u065b\7J\2\2\u065a\u0650\3\2\2\2\u065a\u0654\3\2\2\2\u065a\u0658\3\2\2\2\u065b\u0129\3\2\2\2\u065c\u065d\7h\2\2\u065d\u012b\3\2\2\2\u065e\u065f\7\64\2\2\u065f\u0660\7;\2\2\u0660\u0661\5\u01a0\u00d1\2\u0661\u0662\7<\2\2\u0662\u0663\5\u0108\u0085\2\u0663\u012d\3\2\2\2\u0664\u0665\7\64\2\2\u0665\u0666\7;\2\2\u0666\u0667\5\u01a0\u00d1\2\u0667\u0668\7<\2\2\u0668\u0669\5\u010a\u0086\2\u0669\u012f\3\2\2\2\u066a\u066b\7\17\2\2\u066b\u066c\5\u0108\u0085\2\u066c\u066d\7\64\2\2\u066d\u066e\7;\2\2\u066e\u066f\5\u01a0\u00d1\2\u066f\u0670\7<\2\2\u0670\u0671\7A\2\2\u0671\u0131\3\2\2\2\u0672\u0675\5\u0136\u009c\2\u0673\u0675\5\u0140\u00a1\2\u0674\u0672\3\2\2\2\u0674\u0673\3\2\2\2\u0675\u0133\3\2\2\2\u0676\u0679\5\u0138\u009d\2\u0677\u0679\5\u0142\u00a2\2\u0678\u0676\3\2\2\2\u0678\u0677\3\2\2\2\u0679\u0135\3\2\2\2\u067a\u067b\7\27\2\2\u067b\u067d\7;\2\2\u067c\u067e\5\u013a\u009e\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0681\7A\2\2\u0680\u0682\5\u01a0\u00d1\2\u0681\u0680\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0685\7A\2\2\u0684\u0686\5\u013c\u009f\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0688\7<\2\2\u0688\u0689\5\u0108\u0085\2\u0689\u0137\3\2\2\2\u068a\u068b\7\27\2\2\u068b\u068d\7;\2\2\u068c\u068e\5\u013a\u009e\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0691\7A\2\2\u0690\u0692\5\u01a0\u00d1\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\7A\2\2\u0694\u0696\5\u013c\u009f\2\u0695\u0694\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\7<\2\2\u0698\u0699\5\u010a\u0086\2\u0699\u0139\3\2\2\2\u069a\u069d\5\u013e\u00a0\2\u069b\u069d\5\u0106\u0084\2\u069c\u069a\3\2\2\2\u069c\u069b\3\2\2\2\u069d\u013b\3\2\2\2\u069e\u069f\5\u013e\u00a0\2\u069f\u013d\3\2\2\2\u06a0\u06a5\5\u0116\u008c\2\u06a1\u06a2\7B\2\2\u06a2\u06a4\5\u0116\u008c\2\u06a3\u06a1\3\2\2\2\u06a4\u06a7\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u013f\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a8\u06a9\7\27\2\2\u06a9\u06ad\7;\2\2\u06aa\u06ac\5\u009eP\2\u06ab\u06aa\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b0\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b1\5v<\2\u06b1\u06b2\5r:\2\u06b2\u06b3\7J\2\2\u06b3\u06b4\5\u01a0\u00d1\2\u06b4\u06b5\7<\2\2\u06b5\u06b6\5\u0108\u0085\2\u06b6\u0141\3\2\2\2\u06b7\u06b8\7\27\2\2\u06b8\u06bc\7;\2\2\u06b9\u06bb\5\u009eP\2\u06ba\u06b9\3\2\2\2\u06bb\u06be\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06bf\3\2\2\2\u06be\u06bc\3\2\2\2\u06bf\u06c0\5v<\2\u06c0\u06c1\5r:\2\u06c1\u06c2\7J\2\2\u06c2\u06c3\5\u01a0\u00d1\2\u06c3\u06c4\7<\2\2\u06c4\u06c5\5\u010a\u0086\2\u06c5\u0143\3\2\2\2\u06c6\u06c8\7\6\2\2\u06c7\u06c9\7h\2\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\7A\2\2\u06cb\u0145\3\2\2\2\u06cc\u06ce\7\r\2\2\u06cd\u06cf\7h\2\2\u06ce\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\7A\2\2\u06d1\u0147\3\2\2\2\u06d2\u06d4\7&\2\2\u06d3\u06d5\5\u01a0\u00d1\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\7A\2\2\u06d7\u0149\3\2\2\2\u06d8\u06d9\7.\2\2\u06d9\u06da\5\u01a0\u00d1\2\u06da\u06db\7A\2\2\u06db\u014b\3\2\2\2\u06dc\u06dd\7,\2\2\u06dd\u06de\7;\2\2\u06de\u06df\5\u01a0\u00d1\2\u06df\u06e0\7<\2\2\u06e0\u06e1\5\u00fe\u0080\2\u06e1\u014d\3\2\2\2\u06e2\u06e3\7\61\2\2\u06e3\u06e4\5\u00fe\u0080\2\u06e4\u06e5\5\u0150\u00a9\2\u06e5\u06ef\3\2\2\2\u06e6\u06e7\7\61\2\2\u06e7\u06e9\5\u00fe\u0080\2\u06e8\u06ea\5\u0150\u00a9\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\5\u0158\u00ad\2\u06ec\u06ef\3\2\2\2\u06ed\u06ef\5\u015a\u00ae\2\u06ee\u06e2\3\2\2\2\u06ee\u06e6\3\2\2\2\u06ee\u06ed\3\2\2\2\u06ef\u014f\3\2\2\2\u06f0\u06f4\5\u0152\u00aa\2\u06f1\u06f3\5\u0152\u00aa\2\u06f2\u06f1\3\2\2\2\u06f3\u06f6\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u0151\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7\u06f8\7\t\2\2\u06f8\u06f9\7;\2\2\u06f9\u06fa\5\u0154\u00ab\2\u06fa\u06fb\7<\2\2\u06fb\u06fc\5\u00fe\u0080\2\u06fc\u0153\3\2\2\2\u06fd\u06ff\5\u009eP\2\u06fe\u06fd\3\2\2\2\u06ff\u0702\3\2\2\2\u0700\u06fe\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0703\3\2\2\2\u0702\u0700\3\2\2\2\u0703\u0704\5\u0156\u00ac\2\u0704\u0705\5r:\2\u0705\u0155\3\2\2\2\u0706\u070b\5~@\2\u0707\u0708\7X\2\2\u0708\u070a\5\20\t\2\u0709\u0707\3\2\2\2\u070a\u070d\3\2\2\2\u070b\u0709\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u0157\3\2\2\2\u070d\u070b\3\2\2\2\u070e\u070f\7\25\2\2\u070f\u0710\5\u00fe\u0080\2\u0710\u0159\3\2\2\2\u0711\u0712\7\61\2\2\u0712\u0713\5\u015c\u00af\2\u0713\u0715\5\u00fe\u0080\2\u0714\u0716\5\u0150\u00a9\2\u0715\u0714\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0718\3\2\2\2\u0717\u0719\5\u0158\u00ad\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u015b\3\2\2\2\u071a\u071b\7;\2\2\u071b\u071d\5\u015e\u00b0\2\u071c\u071e\7A\2\2\u071d\u071c\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\7<\2\2\u0720\u015d\3\2\2\2\u0721\u0726\5\u0160\u00b1\2\u0722\u0723\7A\2\2\u0723\u0725\5\u0160\u00b1\2\u0724\u0722\3\2\2\2\u0725\u0728\3\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u015f\3\2\2\2\u0728\u0726\3\2\2\2\u0729\u072b\5\u009eP\2\u072a\u0729\3\2\2\2\u072b\u072e\3\2\2\2\u072c\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072f\3\2\2\2\u072e\u072c\3\2\2\2\u072f\u0730\5v<\2\u0730\u0731\5r:\2\u0731\u0732\7D\2\2\u0732\u0733\5\u01a0\u00d1\2\u0733\u0161\3\2\2\2\u0734\u0737\5\u0170\u00b9\2\u0735\u0737\5\u0198\u00cd\2\u0736\u0734\3\2\2\2\u0736\u0735\3\2\2\2\u0737\u073b\3\2\2\2\u0738\u073a\5\u016a\u00b6\2\u0739\u0738\3\2\2\2\u073a\u073d\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0163\3\2\2\2\u073d\u073b\3\2\2\2\u073e\u075c\5\2\2\2\u073f\u0744\5\66\34\2\u0740\u0741\7?\2\2\u0741\u0743\7@\2\2\u0742\u0740\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0747\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0748\7C\2\2\u0748\u0749\7\13\2\2\u0749\u075c\3\2\2\2\u074a\u074b\7\62\2\2\u074b\u074c\7C\2\2\u074c\u075c\7\13\2\2\u074d\u075c\7-\2\2\u074e\u074f\5\66\34\2\u074f\u0750\7C\2\2\u0750\u0751\7-\2\2\u0751\u075c\3\2\2\2\u0752\u0753\7;\2\2\u0753\u0754\5\u01a0\u00d1\2\u0754\u0755\7<\2\2\u0755\u075c\3\2\2\2\u0756\u075c\5\u0176\u00bc\2\u0757\u075c\5\u017e\u00c0\2\u0758\u075c\5\u0184\u00c3\2\u0759\u075c\5\u018a\u00c6\2\u075a\u075c\5\u0192\u00ca\2\u075b\u073e\3\2\2\2\u075b\u073f\3\2\2\2\u075b\u074a\3\2\2\2\u075b\u074d\3\2\2\2\u075b\u074e\3\2\2\2\u075b\u0752\3\2\2\2\u075b\u0756\3\2\2\2\u075b\u0757\3\2\2\2\u075b\u0758\3\2\2\2\u075b\u0759\3\2\2\2\u075b\u075a\3\2\2\2\u075c\u0165\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0167\3\2\2\2\u075f\u077c\5\2\2\2\u0760\u0765\5\66\34\2\u0761\u0762\7?\2\2\u0762\u0764\7@\2\2\u0763\u0761\3\2\2\2\u0764\u0767\3\2\2\2\u0765\u0763\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0768\3\2\2\2\u0767\u0765\3\2\2\2\u0768\u0769\7C\2\2\u0769\u076a\7\13\2\2\u076a\u077c\3\2\2\2\u076b\u076c\7\62\2\2\u076c\u076d\7C\2\2\u076d\u077c\7\13\2\2\u076e\u077c\7-\2\2\u076f\u0770\5\66\34\2\u0770\u0771\7C\2\2\u0771\u0772\7-\2\2\u0772\u077c\3\2\2\2\u0773\u0774\7;\2\2\u0774\u0775\5\u01a0\u00d1\2\u0775\u0776\7<\2\2\u0776\u077c\3\2\2\2\u0777\u077c\5\u0176\u00bc\2\u0778\u077c\5\u017e\u00c0\2\u0779\u077c\5\u018a\u00c6\2\u077a\u077c\5\u0192\u00ca\2\u077b\u075f\3\2\2\2\u077b\u0760\3\2\2\2\u077b\u076b\3\2\2\2\u077b\u076e\3\2\2\2\u077b\u076f\3\2\2\2\u077b\u0773\3\2\2\2\u077b\u0777\3\2\2\2\u077b\u0778\3\2\2\2\u077b\u0779\3\2\2\2\u077b\u077a\3\2\2\2\u077c\u0169\3\2\2\2\u077d\u0783\5\u0178\u00bd\2\u077e\u0783\5\u0180\u00c1\2\u077f\u0783\5\u0186\u00c4\2\u0780\u0783\5\u018c\u00c7\2\u0781\u0783\5\u0194\u00cb\2\u0782\u077d\3\2\2\2\u0782\u077e\3\2\2\2\u0782\u077f\3\2\2\2\u0782\u0780\3\2\2\2\u0782\u0781\3\2\2\2\u0783\u016b\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u016d\3\2\2\2\u0786\u078b\5\u0178\u00bd\2\u0787\u078b\5\u0180\u00c1\2\u0788\u078b\5\u018c\u00c7\2\u0789\u078b\5\u0194\u00cb\2\u078a\u0786\3\2\2\2\u078a\u0787\3\2\2\2\u078a\u0788\3\2\2\2\u078a\u0789\3\2\2\2\u078b\u016f\3\2\2\2\u078c\u07b5\5\2\2\2\u078d\u0792\5\66\34\2\u078e\u078f\7?\2\2\u078f\u0791\7@\2\2\u0790\u078e\3\2\2\2\u0791\u0794\3\2\2\2\u0792\u0790\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\3\2\2\2\u0794\u0792\3\2\2\2\u0795\u0796\7C\2\2\u0796\u0797\7\13\2\2\u0797\u07b5\3\2\2\2\u0798\u079d\5x=\2\u0799\u079a\7?\2\2\u079a\u079c\7@\2\2\u079b\u0799\3\2\2\2\u079c\u079f\3\2\2\2\u079d\u079b\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u07a0\3\2\2\2\u079f\u079d\3\2\2\2\u07a0\u07a1\7C\2\2\u07a1\u07a2\7\13\2\2\u07a2\u07b5\3\2\2\2\u07a3\u07a4\7\62\2\2\u07a4\u07a5\7C\2\2\u07a5\u07b5\7\13\2\2\u07a6\u07b5\7-\2\2\u07a7\u07a8\5\66\34\2\u07a8\u07a9\7C\2\2\u07a9\u07aa\7-\2\2\u07aa\u07b5\3\2\2\2\u07ab\u07ac\7;\2\2\u07ac\u07ad\5\u01a0\u00d1\2\u07ad\u07ae\7<\2\2\u07ae\u07b5\3\2\2\2\u07af\u07b5\5\u017a\u00be\2\u07b0\u07b5\5\u0182\u00c2\2\u07b1\u07b5\5\u0188\u00c5\2\u07b2\u07b5\5\u018e\u00c8\2\u07b3\u07b5\5\u0196\u00cc\2\u07b4\u078c\3\2\2\2\u07b4\u078d\3\2\2\2\u07b4\u0798\3\2\2\2\u07b4\u07a3\3\2\2\2\u07b4\u07a6\3\2\2\2\u07b4\u07a7\3\2\2\2\u07b4\u07ab\3\2\2\2\u07b4\u07af\3\2\2\2\u07b4\u07b0\3\2\2\2\u07b4\u07b1\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b3\3\2\2\2\u07b5\u0171\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u0173\3\2\2\2\u07b8\u07e0\5\2\2\2\u07b9\u07be\5\66\34\2\u07ba\u07bb\7?\2\2\u07bb\u07bd\7@\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1\u07c2\7C\2\2\u07c2\u07c3\7\13\2\2\u07c3\u07e0\3\2\2\2\u07c4\u07c9\5x=\2\u07c5\u07c6\7?\2\2\u07c6\u07c8\7@\2\2\u07c7\u07c5\3\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cc\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cc\u07cd\7C\2\2\u07cd\u07ce\7\13\2\2\u07ce\u07e0\3\2\2\2\u07cf\u07d0\7\62\2\2\u07d0\u07d1\7C\2\2\u07d1\u07e0\7\13\2\2\u07d2\u07e0\7-\2\2\u07d3\u07d4\5\66\34\2\u07d4\u07d5\7C\2\2\u07d5\u07d6\7-\2\2\u07d6\u07e0\3\2\2\2\u07d7\u07d8\7;\2\2\u07d8\u07d9\5\u01a0\u00d1\2\u07d9\u07da\7<\2\2\u07da\u07e0\3\2\2\2\u07db\u07e0\5\u017a\u00be\2\u07dc\u07e0\5\u0182\u00c2\2\u07dd\u07e0\5\u018e\u00c8\2\u07de\u07e0\5\u0196\u00cc\2\u07df\u07b8\3\2\2\2\u07df\u07b9\3\2\2\2\u07df\u07c4\3\2\2\2\u07df\u07cf\3\2\2\2\u07df\u07d2\3\2\2\2\u07df\u07d3\3\2\2\2\u07df\u07d7\3\2\2\2\u07df\u07db\3\2\2\2\u07df\u07dc\3\2\2\2\u07df\u07dd\3\2\2\2\u07df\u07de\3\2\2\2\u07e0\u0175\3\2\2\2\u07e1\u07e3\7!\2\2\u07e2\u07e4\5*\26\2\u07e3\u07e2\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e8\3\2\2\2\u07e5\u07e7\5\u00e8u\2\u07e6\u07e5\3\2\2\2\u07e7\u07ea\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07eb\3\2\2\2\u07ea\u07e8\3\2\2\2\u07eb\u07f6\7h\2\2\u07ec\u07f0\7C\2\2\u07ed\u07ef\5\u00e8u\2\u07ee\u07ed\3\2\2\2\u07ef\u07f2\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f3\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f3\u07f5\7h\2\2\u07f4\u07ec\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07fa\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fb\5\u017c\u00bf\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fe\7;\2\2\u07fd\u07ff\5\u0190\u00c9\2\u07fe\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0802\7<\2\2\u0801\u0803\5d\63\2\u0802\u0801\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0835\3\2\2\2\u0804\u0805\5:\36\2\u0805\u0806\7C\2\2\u0806\u0808\7!\2\2\u0807\u0809\5*\26\2\u0808\u0807\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080d\3\2\2\2\u080a\u080c\5\u00e8u\2\u080b\u080a\3\2\2\2\u080c\u080f\3\2\2\2\u080d\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0810\3\2\2\2\u080f\u080d\3\2\2\2\u0810\u0812\7h\2\2\u0811\u0813\5\u017c\u00bf\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\7;\2\2\u0815\u0817\5\u0190\u00c9\2\u0816\u0815\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\7<\2\2\u0819\u081b\5d\63\2\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u0835\3\2\2\2\u081c\u081d\5\u0162\u00b2\2\u081d\u081e\7C\2\2\u081e\u0820\7!\2\2\u081f\u0821\5*\26\2\u0820\u081f\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0825\3\2\2\2\u0822\u0824\5\u00e8u\2\u0823\u0822\3\2\2\2\u0824\u0827\3\2\2\2\u0825\u0823\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0828\3\2\2\2\u0827\u0825\3\2\2\2\u0828\u082a\7h\2\2\u0829\u082b\5\u017c\u00bf\2\u082a\u0829\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082e\7;\2\2\u082d\u082f\5\u0190\u00c9\2\u082e\u082d\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0832\7<\2\2\u0831\u0833\5d\63\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0835\3\2\2\2\u0834\u07e1\3\2\2\2\u0834\u0804\3\2\2\2\u0834\u081c\3\2\2\2\u0835\u0177\3\2\2\2\u0836\u0837\7C\2\2\u0837\u0839\7!\2\2\u0838\u083a\5*\26\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083e\3\2\2\2\u083b\u083d\5\u00e8u\2\u083c\u083b\3\2\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0841\3\2\2\2\u0840\u083e\3\2\2\2\u0841\u0843\7h\2\2\u0842\u0844\5\u017c\u00bf\2\u0843\u0842\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0847\7;\2\2\u0846\u0848\5\u0190\u00c9\2\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084b\7<\2\2\u084a\u084c\5d\63\2\u084b\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u0179\3\2\2\2\u084d\u084f\7!\2\2\u084e\u0850\5*\26\2\u084f\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0854\3\2\2\2\u0851\u0853\5\u00e8u\2\u0852\u0851\3\2\2\2\u0853\u0856\3\2\2\2\u0854\u0852\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0857\3\2\2\2\u0856\u0854\3\2\2\2\u0857\u0862\7h\2\2\u0858\u085c\7C\2\2\u0859\u085b\5\u00e8u\2\u085a\u0859\3\2\2\2\u085b\u085e\3\2\2\2\u085c\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u085f\3\2\2\2\u085e\u085c\3\2\2\2\u085f\u0861\7h\2\2\u0860\u0858\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0866\3\2\2\2\u0864\u0862\3\2\2\2\u0865\u0867\5\u017c\u00bf\2\u0866\u0865\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u086a\7;\2\2\u0869\u086b\5\u0190\u00c9\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086e\7<\2\2\u086d\u086f\5d\63\2\u086e\u086d\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0889\3\2\2\2\u0870\u0871\5:\36\2\u0871\u0872\7C\2\2\u0872\u0874\7!\2\2\u0873\u0875\5*\26\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0879\3\2\2\2\u0876\u0878\5\u00e8u\2\u0877\u0876\3\2\2\2\u0878\u087b\3\2\2\2\u0879\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087c\3\2\2\2\u087b\u0879\3\2\2\2\u087c\u087e\7h\2\2\u087d\u087f\5\u017c\u00bf\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0882\7;\2\2\u0881\u0883\5\u0190\u00c9\2\u0882\u0881\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0886\7<\2\2\u0885\u0887\5d\63\2\u0886\u0885\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\3\2\2\2\u0888\u084d\3\2\2\2\u0888\u0870\3\2\2\2\u0889\u017b\3\2\2\2\u088a\u088e\5*\26\2\u088b\u088c\7F\2\2\u088c\u088e\7E\2\2\u088d\u088a\3\2\2\2\u088d\u088b\3\2\2\2\u088e\u017d\3\2\2\2\u088f\u0890\5\u0162\u00b2\2\u0890\u0891\7C\2\2\u0891\u0892\7h\2\2\u0892\u089d\3\2\2\2\u0893\u0894\7*\2\2\u0894\u0895\7C\2\2\u0895\u089d\7h\2\2\u0896\u0897\5\66\34\2\u0897\u0898\7C\2\2\u0898\u0899\7*\2\2\u0899\u089a\7C\2\2\u089a\u089b\7h\2\2\u089b\u089d\3\2\2\2\u089c\u088f\3\2\2\2\u089c\u0893\3\2\2\2\u089c\u0896\3\2\2\2\u089d\u017f\3\2\2\2\u089e\u089f\7C\2\2\u089f\u08a0\7h\2\2\u08a0\u0181\3\2\2\2\u08a1\u08a2\7*\2\2\u08a2\u08a3\7C\2\2\u08a3\u08ab\7h\2\2\u08a4\u08a5\5\66\34\2\u08a5\u08a6\7C\2\2\u08a6\u08a7\7*\2\2\u08a7\u08a8\7C\2\2\u08a8\u08a9\7h\2\2\u08a9\u08ab\3\2\2\2\u08aa\u08a1\3\2\2\2\u08aa\u08a4\3\2\2\2\u08ab\u0183\3\2\2\2\u08ac\u08ad\5:\36\2\u08ad\u08ae\7?\2\2\u08ae\u08af\5\u01a0\u00d1\2\u08af\u08b0\7@\2\2\u08b0\u08b7\3\2\2\2\u08b1\u08b2\5\u0168\u00b5\2\u08b2\u08b3\7?\2\2\u08b3\u08b4\5\u01a0\u00d1\2\u08b4\u08b5\7@\2\2\u08b5\u08b7\3\2\2\2\u08b6\u08ac\3\2\2\2\u08b6\u08b1\3\2\2\2\u08b7\u08bf\3\2\2\2\u08b8\u08b9\5\u0166\u00b4\2\u08b9\u08ba\7?\2\2\u08ba\u08bb\5\u01a0\u00d1\2\u08bb\u08bc\7@\2\2\u08bc\u08be\3\2\2\2\u08bd\u08b8\3\2\2\2\u08be\u08c1\3\2\2\2\u08bf\u08bd\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u0185\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c2\u08c3\5\u016e\u00b8\2\u08c3\u08c4\7?\2\2\u08c4\u08c5\5\u01a0\u00d1\2\u08c5\u08c6\7@\2\2\u08c6\u08ce\3\2\2\2\u08c7\u08c8\5\u016c\u00b7\2\u08c8\u08c9\7?\2\2\u08c9\u08ca\5\u01a0\u00d1\2\u08ca\u08cb\7@\2\2\u08cb\u08cd\3\2\2\2\u08cc\u08c7\3\2\2\2\u08cd\u08d0\3\2\2\2\u08ce\u08cc\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u0187\3\2\2\2\u08d0\u08ce\3\2\2\2\u08d1\u08d2\5:\36\2\u08d2\u08d3\7?\2\2\u08d3\u08d4\5\u01a0\u00d1\2\u08d4\u08d5\7@\2\2\u08d5\u08dc\3\2\2\2\u08d6\u08d7\5\u0174\u00bb\2\u08d7\u08d8\7?\2\2\u08d8\u08d9\5\u01a0\u00d1\2\u08d9\u08da\7@\2\2\u08da\u08dc\3\2\2\2\u08db\u08d1\3\2\2\2\u08db\u08d6\3\2\2\2\u08dc\u08e4\3\2\2\2\u08dd\u08de\5\u0172\u00ba\2\u08de\u08df\7?\2\2\u08df\u08e0\5\u01a0\u00d1\2\u08e0\u08e1\7@\2\2\u08e1\u08e3\3\2\2\2\u08e2\u08dd\3\2\2\2\u08e3\u08e6\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u0189\3\2\2\2\u08e6\u08e4\3\2\2\2\u08e7\u08e8\5<\37\2\u08e8\u08ea\7;\2\2\u08e9\u08eb\5\u0190\u00c9\2\u08ea\u08e9\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ed\7<\2\2\u08ed\u092c\3\2\2\2\u08ee\u08ef\5\66\34\2\u08ef\u08f1\7C\2\2\u08f0\u08f2\5*\26\2\u08f1\u08f0\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4\7h\2\2\u08f4\u08f6\7;\2\2\u08f5\u08f7\5\u0190\u00c9\2\u08f6\u08f5\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u08f9\7<\2\2\u08f9\u092c\3\2\2\2\u08fa\u08fb\5:\36\2\u08fb\u08fd\7C\2\2\u08fc\u08fe\5*\26\2\u08fd\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0900\7h\2\2\u0900\u0902\7;\2\2\u0901\u0903\5\u0190\u00c9\2\u0902\u0901\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0905\7<\2\2\u0905\u092c\3\2\2\2\u0906\u0907\5\u0162\u00b2\2\u0907\u0909\7C\2\2\u0908\u090a\5*\26\2\u0909\u0908\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090c\7h\2\2\u090c\u090e\7;\2\2\u090d\u090f\5\u0190\u00c9\2\u090e\u090d\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\7<\2\2\u0911\u092c\3\2\2\2\u0912\u0913\7*\2\2\u0913\u0915\7C\2\2\u0914\u0916\5*\26\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0918\7h\2\2\u0918\u091a\7;\2\2\u0919\u091b\5\u0190\u00c9\2\u091a\u0919\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u092c\7<\2\2\u091d\u091e\5\66\34\2\u091e\u091f\7C\2\2\u091f\u0920\7*\2\2\u0920\u0922\7C\2\2\u0921\u0923\5*\26\2\u0922\u0921\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\7h\2\2\u0925\u0927\7;\2\2\u0926\u0928\5\u0190\u00c9\2\u0927\u0926\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u092a\7<\2\2\u092a\u092c\3\2\2\2\u092b\u08e7\3\2\2\2\u092b\u08ee\3\2\2\2\u092b\u08fa\3\2\2\2\u092b\u0906\3\2\2\2\u092b\u0912\3\2\2\2\u092b\u091d\3\2\2\2\u092c\u018b\3\2\2\2\u092d\u092f\7C\2\2\u092e\u0930\5*\26\2\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\7h\2\2\u0932\u0934\7;\2\2\u0933\u0935\5\u0190\u00c9\2\u0934\u0933\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937\7<\2\2\u0937\u018d\3\2\2\2\u0938\u0939\5<\37\2\u0939\u093b\7;\2\2\u093a\u093c\5\u0190\u00c9\2\u093b\u093a\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093e\7<\2\2\u093e\u0971\3\2\2\2\u093f\u0940\5\66\34\2\u0940\u0942\7C\2\2\u0941\u0943\5*\26\2\u0942\u0941\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945\7h\2\2\u0945\u0947\7;\2\2\u0946\u0948\5\u0190\u00c9\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\7<\2\2\u094a\u0971\3\2\2\2\u094b\u094c\5:\36\2\u094c\u094e\7C\2\2\u094d\u094f\5*\26\2\u094e\u094d\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\7h\2\2\u0951\u0953\7;\2\2\u0952\u0954\5\u0190\u00c9\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0956\7<\2\2\u0956\u0971\3\2\2\2\u0957\u0958\7*\2\2\u0958\u095a\7C\2\2\u0959\u095b\5*\26\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095d\7h\2\2\u095d\u095f\7;\2\2\u095e\u0960\5\u0190\u00c9\2\u095f\u095e\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0971\7<\2\2\u0962\u0963\5\66\34\2\u0963\u0964\7C\2\2\u0964\u0965\7*\2\2\u0965\u0967\7C\2\2\u0966\u0968\5*\26\2\u0967\u0966\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096a\7h\2\2\u096a\u096c\7;\2\2\u096b\u096d\5\u0190\u00c9\2\u096c\u096b\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\7<\2\2\u096f\u0971\3\2\2\2\u0970\u0938\3\2\2\2\u0970\u093f\3\2\2\2\u0970\u094b\3\2\2\2\u0970\u0957\3\2\2\2\u0970\u0962\3\2\2\2\u0971\u018f\3\2\2\2\u0972\u0977\5\u01a0\u00d1\2\u0973\u0974\7B\2\2\u0974\u0976\5\u01a0\u00d1\2";
	private static final String _serializedATNSegment1 =
		"\u0975\u0973\3\2\2\2\u0976\u0979\3\2\2\2\u0977\u0975\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0191\3\2\2\2\u0979\u0977\3\2\2\2\u097a\u097b\5:\36\2\u097b\u097d\7\\\2\2\u097c\u097e\5*\26\2\u097d\u097c\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u097f\3\2\2\2\u097f\u0980\7h\2\2\u0980\u09aa\3\2\2\2\u0981\u0982\5\f\7\2\u0982\u0984\7\\\2\2\u0983\u0985\5*\26\2\u0984\u0983\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0987\7h\2\2\u0987\u09aa\3\2\2\2\u0988\u0989\5\u0162\u00b2\2\u0989\u098b\7\\\2\2\u098a\u098c\5*\26\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e\7h\2\2\u098e\u09aa\3\2\2\2\u098f\u0990\7*\2\2\u0990\u0992\7\\\2\2\u0991\u0993\5*\26\2\u0992\u0991\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u09aa\7h\2\2\u0995\u0996\5\66\34\2\u0996\u0997\7C\2\2\u0997\u0998\7*\2\2\u0998\u099a\7\\\2\2\u0999\u099b\5*\26\2\u099a\u0999\3\2\2\2\u099a\u099b\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\7h\2\2\u099d\u09aa\3\2\2\2\u099e\u099f\5\20\t\2\u099f\u09a1\7\\\2\2\u09a0\u09a2\5*\26\2\u09a1\u09a0\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\7!\2\2\u09a4\u09aa\3\2\2\2\u09a5\u09a6\5\36\20\2\u09a6\u09a7\7\\\2\2\u09a7\u09a8\7!\2\2\u09a8\u09aa\3\2\2\2\u09a9\u097a\3\2\2\2\u09a9\u0981\3\2\2\2\u09a9\u0988\3\2\2\2\u09a9\u098f\3\2\2\2\u09a9\u0995\3\2\2\2\u09a9\u099e\3\2\2\2\u09a9\u09a5\3\2\2\2\u09aa\u0193\3\2\2\2\u09ab\u09ad\7\\\2\2\u09ac\u09ae\5*\26\2\u09ad\u09ac\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09b0\7h\2\2\u09b0\u0195\3\2\2\2\u09b1\u09b2\5:\36\2\u09b2\u09b4\7\\\2\2\u09b3\u09b5\5*\26\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\7h\2\2\u09b7\u09da\3\2\2\2\u09b8\u09b9\5\f\7\2\u09b9\u09bb\7\\\2\2\u09ba\u09bc\5*\26\2\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be\7h\2\2\u09be\u09da\3\2\2\2\u09bf\u09c0\7*\2\2\u09c0\u09c2\7\\\2\2\u09c1\u09c3\5*\26\2\u09c2\u09c1\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09da\7h\2\2\u09c5\u09c6\5\66\34\2\u09c6\u09c7\7C\2\2\u09c7\u09c8\7*\2\2\u09c8\u09ca\7\\\2\2\u09c9\u09cb\5*\26\2\u09ca\u09c9\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\7h\2\2\u09cd\u09da\3\2\2\2\u09ce\u09cf\5\20\t\2\u09cf\u09d1\7\\\2\2\u09d0\u09d2\5*\26\2\u09d1\u09d0\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\7!\2\2\u09d4\u09da\3\2\2\2\u09d5\u09d6\5\36\20\2\u09d6\u09d7\7\\\2\2\u09d7\u09d8\7!\2\2\u09d8\u09da\3\2\2\2\u09d9\u09b1\3\2\2\2\u09d9\u09b8\3\2\2\2\u09d9\u09bf\3\2\2\2\u09d9\u09c5\3\2\2\2\u09d9\u09ce\3\2\2\2\u09d9\u09d5\3\2\2\2\u09da\u0197\3\2\2\2\u09db\u09dc\7!\2\2\u09dc\u09dd\5\4\3\2\u09dd\u09df\5\u019a\u00ce\2\u09de\u09e0\5 \21\2\u09df\u09de\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09f2\3\2\2\2\u09e1\u09e2\7!\2\2\u09e2\u09e3\5\16\b\2\u09e3\u09e5\5\u019a\u00ce\2\u09e4\u09e6\5 \21\2\u09e5\u09e4\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09f2\3\2\2\2\u09e7\u09e8\7!\2\2\u09e8\u09e9\5\4\3\2\u09e9\u09ea\5 \21\2\u09ea\u09eb\5\u00fa~\2\u09eb\u09f2\3\2\2\2\u09ec\u09ed\7!\2\2\u09ed\u09ee\5\16\b\2\u09ee\u09ef\5 \21\2\u09ef\u09f0\5\u00fa~\2\u09f0\u09f2\3\2\2\2\u09f1\u09db\3\2\2\2\u09f1\u09e1\3\2\2\2\u09f1\u09e7\3\2\2\2\u09f1\u09ec\3\2\2\2\u09f2\u0199\3\2\2\2\u09f3\u09f7\5\u019c\u00cf\2\u09f4\u09f6\5\u019c\u00cf\2\u09f5\u09f4\3\2\2\2\u09f6\u09f9\3\2\2\2\u09f7\u09f5\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u019b\3\2\2\2\u09f9\u09f7\3\2\2\2\u09fa\u09fc\5\u00e8u\2\u09fb\u09fa\3\2\2\2\u09fc\u09ff\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u0a00\3\2\2\2\u09ff\u09fd\3\2\2\2\u0a00\u0a01\7?\2\2\u0a01\u0a02\5\u01a0\u00d1\2\u0a02\u0a03\7@\2\2\u0a03\u019d\3\2\2\2\u0a04\u0a05\5\u01a0\u00d1\2\u0a05\u019f\3\2\2\2\u0a06\u0a09\5\u01a2\u00d2\2\u0a07\u0a09\5\u01aa\u00d6\2\u0a08\u0a06\3\2\2\2\u0a08\u0a07\3\2\2\2\u0a09\u01a1\3\2\2\2\u0a0a\u0a0b\5\u01a4\u00d3\2\u0a0b\u0a0c\7[\2\2\u0a0c\u0a0d\5\u01a8\u00d5\2\u0a0d\u01a3\3\2\2\2\u0a0e\u0a19\7h\2\2\u0a0f\u0a11\7;\2\2\u0a10\u0a12\5\u0098M\2\u0a11\u0a10\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a19\7<\2\2\u0a14\u0a15\7;\2\2\u0a15\u0a16\5\u01a6\u00d4\2\u0a16\u0a17\7<\2\2\u0a17\u0a19\3\2\2\2\u0a18\u0a0e\3\2\2\2\u0a18\u0a0f\3\2\2\2\u0a18\u0a14\3\2\2\2\u0a19\u01a5\3\2\2\2\u0a1a\u0a1f\7h\2\2\u0a1b\u0a1c\7B\2\2\u0a1c\u0a1e\7h\2\2\u0a1d\u0a1b\3\2\2\2\u0a1e\u0a21\3\2\2\2\u0a1f\u0a1d\3\2\2\2\u0a1f\u0a20\3\2\2\2\u0a20\u01a7\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a22\u0a25\5\u01a0\u00d1\2\u0a23\u0a25\5\u00fe\u0080\2\u0a24\u0a22\3\2\2\2\u0a24\u0a23\3\2\2\2\u0a25\u01a9\3\2\2\2\u0a26\u0a29\5\u01b2\u00da\2\u0a27\u0a29\5\u01ac\u00d7\2\u0a28\u0a26\3\2\2\2\u0a28\u0a27\3\2\2\2\u0a29\u01ab\3\2\2\2\u0a2a\u0a2b\5\u01ae\u00d8\2\u0a2b\u0a2c\5\u01b0\u00d9\2\u0a2c\u0a2d\5\u01a0\u00d1\2\u0a2d\u01ad\3\2\2\2\u0a2e\u0a32\5:\36\2\u0a2f\u0a32\5\u017e\u00c0\2\u0a30\u0a32\5\u0184\u00c3\2\u0a31\u0a2e\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31\u0a30\3\2\2\2\u0a32\u01af\3\2\2\2\u0a33\u0a34\t\6\2\2\u0a34\u01b1\3\2\2\2\u0a35\u0a3d\5\u01b4\u00db\2\u0a36\u0a37\5\u01b4\u00db\2\u0a37\u0a38\7I\2\2\u0a38\u0a39\5\u01a0\u00d1\2\u0a39\u0a3a\7J\2\2\u0a3a\u0a3b\5\u01b2\u00da\2\u0a3b\u0a3d\3\2\2\2\u0a3c\u0a35\3\2\2\2\u0a3c\u0a36\3\2\2\2\u0a3d\u01b3\3\2\2\2\u0a3e\u0a3f\b\u00db\1\2\u0a3f\u0a40\5\u01b6\u00dc\2\u0a40\u0a46\3\2\2\2\u0a41\u0a42\f\3\2\2\u0a42\u0a43\7P\2\2\u0a43\u0a45\5\u01b6\u00dc\2\u0a44\u0a41\3\2\2\2\u0a45\u0a48\3\2\2\2\u0a46\u0a44\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u01b5\3\2\2\2\u0a48\u0a46\3\2\2\2\u0a49\u0a4a\b\u00dc\1\2\u0a4a\u0a4b\5\u01b8\u00dd\2\u0a4b\u0a51\3\2\2\2\u0a4c\u0a4d\f\3\2\2\u0a4d\u0a4e\7O\2\2\u0a4e\u0a50\5\u01b8\u00dd\2\u0a4f\u0a4c\3\2\2\2\u0a50\u0a53\3\2\2\2\u0a51\u0a4f\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u01b7\3\2\2\2\u0a53\u0a51\3\2\2\2\u0a54\u0a55\b\u00dd\1\2\u0a55\u0a56\5\u01ba\u00de\2\u0a56\u0a5c\3\2\2\2\u0a57\u0a58\f\3\2\2\u0a58\u0a59\7X\2\2\u0a59\u0a5b\5\u01ba\u00de\2\u0a5a\u0a57\3\2\2\2\u0a5b\u0a5e\3\2\2\2\u0a5c\u0a5a\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u01b9\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5f\u0a60\b\u00de\1\2\u0a60\u0a61\5\u01bc\u00df\2\u0a61\u0a67\3\2\2\2\u0a62\u0a63\f\3\2\2\u0a63\u0a64\7Y\2\2\u0a64\u0a66\5\u01bc\u00df\2\u0a65\u0a62\3\2\2\2\u0a66\u0a69\3\2\2\2\u0a67\u0a65\3\2\2\2\u0a67\u0a68\3\2\2\2\u0a68\u01bb\3\2\2\2\u0a69\u0a67\3\2\2\2\u0a6a\u0a6b\b\u00df\1\2\u0a6b\u0a6c\5\u01be\u00e0\2\u0a6c\u0a72\3\2\2\2\u0a6d\u0a6e\f\3\2\2\u0a6e\u0a6f\7W\2\2\u0a6f\u0a71\5\u01be\u00e0\2\u0a70\u0a6d\3\2\2\2\u0a71\u0a74\3\2\2\2\u0a72\u0a70\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73\u01bd\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a75\u0a76\b\u00e0\1\2\u0a76\u0a77\5\u01c0\u00e1\2\u0a77\u0a80\3\2\2\2\u0a78\u0a79\f\4\2\2\u0a79\u0a7a\7K\2\2\u0a7a\u0a7f\5\u01c0\u00e1\2\u0a7b\u0a7c\f\3\2\2\u0a7c\u0a7d\7N\2\2\u0a7d\u0a7f\5\u01c0\u00e1\2\u0a7e\u0a78\3\2\2\2\u0a7e\u0a7b\3\2\2\2\u0a7f\u0a82\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a80\u0a81\3\2\2\2\u0a81\u01bf\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a83\u0a84\b\u00e1\1\2\u0a84\u0a85\5\u01c2\u00e2\2\u0a85\u0a97\3\2\2\2\u0a86\u0a87\f\7\2\2\u0a87\u0a88\7F\2\2\u0a88\u0a96\5\u01c2\u00e2\2\u0a89\u0a8a\f\6\2\2\u0a8a\u0a8b\7E\2\2\u0a8b\u0a96\5\u01c2\u00e2\2\u0a8c\u0a8d\f\5\2\2\u0a8d\u0a8e\7L\2\2\u0a8e\u0a96\5\u01c2\u00e2\2\u0a8f\u0a90\f\4\2\2\u0a90\u0a91\7M\2\2\u0a91\u0a96\5\u01c2\u00e2\2\u0a92\u0a93\f\3\2\2\u0a93\u0a94\7\34\2\2\u0a94\u0a96\5\f\7\2\u0a95\u0a86\3\2\2\2\u0a95\u0a89\3\2\2\2\u0a95\u0a8c\3\2\2\2\u0a95\u0a8f\3\2\2\2\u0a95\u0a92\3\2\2\2\u0a96\u0a99\3\2\2\2\u0a97\u0a95\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u01c1\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a9a\u0a9b\b\u00e2\1\2\u0a9b\u0a9c\5\u01c4\u00e3\2\u0a9c\u0aac\3\2\2\2\u0a9d\u0a9e\f\5\2\2\u0a9e\u0a9f\7F\2\2\u0a9f\u0aa0\7F\2\2\u0aa0\u0aab\5\u01c4\u00e3\2\u0aa1\u0aa2\f\4\2\2\u0aa2\u0aa3\7E\2\2\u0aa3\u0aa4\7E\2\2\u0aa4\u0aab\5\u01c4\u00e3\2\u0aa5\u0aa6\f\3\2\2\u0aa6\u0aa7\7E\2\2\u0aa7\u0aa8\7E\2\2\u0aa8\u0aa9\7E\2\2\u0aa9\u0aab\5\u01c4\u00e3\2\u0aaa\u0a9d\3\2\2\2\u0aaa\u0aa1\3\2\2\2\u0aaa\u0aa5\3\2\2\2\u0aab\u0aae\3\2\2\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad\u01c3\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aaf\u0ab0\b\u00e3\1\2\u0ab0\u0ab1\5\u01c6\u00e4\2\u0ab1\u0aba\3\2\2\2\u0ab2\u0ab3\f\4\2\2\u0ab3\u0ab4\7S\2\2\u0ab4\u0ab9\5\u01c6\u00e4\2\u0ab5\u0ab6\f\3\2\2\u0ab6\u0ab7\7T\2\2\u0ab7\u0ab9\5\u01c6\u00e4\2\u0ab8\u0ab2\3\2\2\2\u0ab8\u0ab5\3\2\2\2\u0ab9\u0abc\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u01c5\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abd\u0abe\b\u00e4\1\2\u0abe\u0abf\5\u01c8\u00e5\2\u0abf\u0acb\3\2\2\2\u0ac0\u0ac1\f\5\2\2\u0ac1\u0ac2\7U\2\2\u0ac2\u0aca\5\u01c8\u00e5\2\u0ac3\u0ac4\f\4\2\2\u0ac4\u0ac5\7V\2\2\u0ac5\u0aca\5\u01c8\u00e5\2\u0ac6\u0ac7\f\3\2\2\u0ac7\u0ac8\7Z\2\2\u0ac8\u0aca\5\u01c8\u00e5\2\u0ac9\u0ac0\3\2\2\2\u0ac9\u0ac3\3\2\2\2\u0ac9\u0ac6\3\2\2\2\u0aca\u0acd\3\2\2\2\u0acb\u0ac9\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u01c7\3\2\2\2\u0acd\u0acb\3\2\2\2\u0ace\u0ad6\5\u01ca\u00e6\2\u0acf\u0ad6\5\u01cc\u00e7\2\u0ad0\u0ad1\7S\2\2\u0ad1\u0ad6\5\u01c8\u00e5\2\u0ad2\u0ad3\7T\2\2\u0ad3\u0ad6\5\u01c8\u00e5\2\u0ad4\u0ad6\5\u01ce\u00e8\2\u0ad5\u0ace\3\2\2\2\u0ad5\u0acf\3\2\2\2\u0ad5\u0ad0\3\2\2\2\u0ad5\u0ad2\3\2\2\2\u0ad5\u0ad4\3\2\2\2\u0ad6\u01c9\3\2\2\2\u0ad7\u0ad8\7Q\2\2\u0ad8\u0ad9\5\u01c8\u00e5\2\u0ad9\u01cb\3\2\2\2\u0ada\u0adb\7R\2\2\u0adb\u0adc\5\u01c8\u00e5\2\u0adc\u01cd\3\2\2\2\u0add\u0ae4\5\u01d0\u00e9\2\u0ade\u0adf\7H\2\2\u0adf\u0ae4\5\u01c8\u00e5\2\u0ae0\u0ae1\7G\2\2\u0ae1\u0ae4\5\u01c8\u00e5\2\u0ae2\u0ae4\5\u01da\u00ee\2\u0ae3\u0add\3\2\2\2\u0ae3\u0ade\3\2\2\2\u0ae3\u0ae0\3\2\2\2\u0ae3\u0ae2\3\2\2\2\u0ae4\u01cf\3\2\2\2\u0ae5\u0ae8\5\u0162\u00b2\2\u0ae6\u0ae8\5:\36\2\u0ae7\u0ae5\3\2\2\2\u0ae7\u0ae6\3\2\2\2\u0ae8\u0aed\3\2\2\2\u0ae9\u0aec\5\u01d4\u00eb\2\u0aea\u0aec\5\u01d8\u00ed\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aea\3\2\2\2\u0aec\u0aef\3\2\2\2\u0aed\u0aeb\3\2\2\2\u0aed\u0aee\3\2\2\2\u0aee\u01d1\3\2\2\2\u0aef\u0aed\3\2\2\2\u0af0\u0af1\5\u01d0\u00e9\2\u0af1\u0af2\7Q\2\2\u0af2\u01d3\3\2\2\2\u0af3\u0af4\7Q\2\2\u0af4\u01d5\3\2\2\2\u0af5\u0af6\5\u01d0\u00e9\2\u0af6\u0af7\7R\2\2\u0af7\u01d7\3\2\2\2\u0af8\u0af9\7R\2\2\u0af9\u01d9\3\2\2\2\u0afa\u0afb\7;\2\2\u0afb\u0afc\5\4\3\2\u0afc\u0afd\7<\2\2\u0afd\u0afe\5\u01c8\u00e5\2\u0afe\u0b16\3\2\2\2\u0aff\u0b00\7;\2\2\u0b00\u0b04\5\f\7\2\u0b01\u0b03\5(\25\2\u0b02\u0b01\3\2\2\2\u0b03\u0b06\3\2\2\2\u0b04\u0b02\3\2\2\2\u0b04\u0b05\3\2\2\2\u0b05\u0b07\3\2\2\2\u0b06\u0b04\3\2\2\2\u0b07\u0b08\7<\2\2\u0b08\u0b09\5\u01ce\u00e8\2\u0b09\u0b16\3\2\2\2\u0b0a\u0b0b\7;\2\2\u0b0b\u0b0f\5\f\7\2\u0b0c\u0b0e\5(\25\2\u0b0d\u0b0c\3\2\2\2\u0b0e\u0b11\3\2\2\2\u0b0f\u0b0d\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10\u0b12\3\2\2\2\u0b11\u0b0f\3\2\2\2\u0b12\u0b13\7<\2\2\u0b13\u0b14\5\u01a2\u00d2\2\u0b14\u0b16\3\2\2\2\u0b15\u0afa\3\2\2\2\u0b15\u0aff\3\2\2\2\u0b15\u0b0a\3\2\2\2\u0b16\u01db\3\2\2\2\u0144\u01e1\u01e8\u01ec\u01f0\u01f9\u01fd\u0201\u0203\u0209\u020e\u0215\u021a\u021c\u0222\u0227\u022c\u0231\u023c\u024a\u024f\u0257\u025e\u0264\u0269\u0274\u0277\u0285\u028a\u028f\u0294\u029a\u02a4\u02ac\u02b6\u02be\u02ca\u02ce\u02d3\u02d9\u02e1\u02ee\u030b\u030f\u0314\u031a\u031d\u0320\u032a\u0337\u0345\u034c\u0355\u035c\u0361\u036e\u0375\u037b\u037f\u0383\u0387\u038b\u0390\u0394\u0398\u039a\u039f\u03a6\u03ab\u03ad\u03b3\u03b8\u03bc\u03cf\u03d4\u03e2\u03e7\u03ed\u03f3\u03f5\u03f9\u03fe\u0402\u040a\u0411\u0419\u041c\u0421\u0429\u042e\u0435\u043c\u0441\u0447\u0453\u0458\u045c\u0466\u046b\u0471\u0474\u0479\u0481\u0484\u0489\u048e\u0493\u0498\u049f\u04a4\u04ac\u04b1\u04b6\u04bb\u04c1\u04c7\u04ca\u04cd\u04d6\u04dc\u04e2\u04e5\u04e8\u04f0\u04f5\u04fa\u0500\u0503\u050c\u0515\u051f\u0524\u052f\u0534\u0540\u0545\u0551\u055b\u0560\u0568\u056b\u0572\u057a\u0580\u0589\u0593\u0597\u059a\u05a3\u05b1\u05b4\u05bd\u05c2\u05c9\u05ce\u05d6\u05e2\u05e9\u05f7\u060d\u062f\u063b\u0641\u064d\u065a\u0674\u0678\u067d\u0681\u0685\u068d\u0691\u0695\u069c\u06a5\u06ad\u06bc\u06c8\u06ce\u06d4\u06e9\u06ee\u06f4\u0700\u070b\u0715\u0718\u071d\u0726\u072c\u0736\u073b\u0744\u075b\u0765\u077b\u0782\u078a\u0792\u079d\u07b4\u07be\u07c9\u07df\u07e3\u07e8\u07f0\u07f6\u07fa\u07fe\u0802\u0808\u080d\u0812\u0816\u081a\u0820\u0825\u082a\u082e\u0832\u0834\u0839\u083e\u0843\u0847\u084b\u084f\u0854\u085c\u0862\u0866\u086a\u086e\u0874\u0879\u087e\u0882\u0886\u0888\u088d\u089c\u08aa\u08b6\u08bf\u08ce\u08db\u08e4\u08ea\u08f1\u08f6\u08fd\u0902\u0909\u090e\u0915\u091a\u0922\u0927\u092b\u092f\u0934\u093b\u0942\u0947\u094e\u0953\u095a\u095f\u0967\u096c\u0970\u0977\u097d\u0984\u098b\u0992\u099a\u09a1\u09a9\u09ad\u09b4\u09bb\u09c2\u09ca\u09d1\u09d9\u09df\u09e5\u09f1\u09f7\u09fd\u0a08\u0a11\u0a18\u0a1f\u0a24\u0a28\u0a31\u0a3c\u0a46\u0a51\u0a5c\u0a67\u0a72\u0a7e\u0a80\u0a95\u0a97\u0aaa\u0aac\u0ab8\u0aba\u0ac9\u0acb\u0ad5\u0ae3\u0ae7\u0aeb\u0aed\u0b04\u0b0f\u0b15";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
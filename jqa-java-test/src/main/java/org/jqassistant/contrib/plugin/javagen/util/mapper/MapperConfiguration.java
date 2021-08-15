//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.mapstruct.MapperConfig;
import javax.annotation.Generated;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@MapperConfig(
	uses = {
		AdditionalBoundMapper.class,
		AdditiveExpressionMapper.class,
		AmbiguousNameMapper.class,
		AndExpressionMapper.class,
		AnnotationMapper.class,
		AnnotationTypeBodyMapper.class,
		AnnotationTypeDeclarationMapper.class,
		AnnotationTypeElementDeclarationMapper.class,
		AnnotationTypeElementModifierMapper.class,
		AnnotationTypeMemberDeclarationMapper.class,
		ArgumentListMapper.class,
		ArrayAccessMapper.class,
		ArrayAccess_lf_primaryMapper.class,
		ArrayAccess_lfno_primaryMapper.class,
		ArrayCreationExpressionMapper.class,
		ArrayInitializerMapper.class,
		ArrayTypeMapper.class,
		AssertStatementMapper.class,
		AssignmentExpressionMapper.class,
		AssignmentMapper.class,
		AssignmentOperatorMapper.class,
		BasicForStatementMapper.class,
		BasicForStatementNoShortIfMapper.class,
		BlockMapper.class,
		BlockStatementMapper.class,
		BlockStatementsMapper.class,
		BreakStatementMapper.class,
		CastExpressionMapper.class,
		CatchClauseMapper.class,
		CatchFormalParameterMapper.class,
		CatchTypeMapper.class,
		CatchesMapper.class,
		ClassBodyDeclarationMapper.class,
		ClassBodyMapper.class,
		ClassDeclarationMapper.class,
		ClassInstanceCreationExpressionMapper.class,
		ClassInstanceCreationExpression_lf_primaryMapper.class,
		ClassInstanceCreationExpression_lfno_primaryMapper.class,
		ClassMemberDeclarationMapper.class,
		ClassModifierMapper.class,
		ClassOrInterfaceTypeMapper.class,
		ClassTypeMapper.class,
		ClassType_lf_classOrInterfaceTypeMapper.class,
		ClassType_lfno_classOrInterfaceTypeMapper.class,
		CompilationUnitMapper.class,
		ConditionalAndExpressionMapper.class,
		ConditionalExpressionMapper.class,
		ConditionalOrExpressionMapper.class,
		ConstantDeclarationMapper.class,
		ConstantExpressionMapper.class,
		ConstantModifierMapper.class,
		ConstructorBodyMapper.class,
		ConstructorDeclarationMapper.class,
		ConstructorDeclaratorMapper.class,
		ConstructorModifierMapper.class,
		ContinueStatementMapper.class,
		DefaultValueMapper.class,
		DescriptorFactory.class,
		DimExprMapper.class,
		DimExprsMapper.class,
		DimsMapper.class,
		DoStatementMapper.class,
		ElementValueArrayInitializerMapper.class,
		ElementValueListMapper.class,
		ElementValueMapper.class,
		ElementValuePairListMapper.class,
		ElementValuePairMapper.class,
		EmptyStatementMapper.class,
		EnhancedForStatementMapper.class,
		EnhancedForStatementNoShortIfMapper.class,
		EnumBodyDeclarationsMapper.class,
		EnumBodyMapper.class,
		EnumConstantListMapper.class,
		EnumConstantMapper.class,
		EnumConstantModifierMapper.class,
		EnumConstantNameMapper.class,
		EnumDeclarationMapper.class,
		EqualityExpressionMapper.class,
		ExceptionTypeListMapper.class,
		ExceptionTypeMapper.class,
		ExclusiveOrExpressionMapper.class,
		ExplicitConstructorInvocationMapper.class,
		ExpressionMapper.class,
		ExpressionNameMapper.class,
		ExpressionStatementMapper.class,
		ExtendsInterfacesMapper.class,
		FieldAccessMapper.class,
		FieldAccess_lf_primaryMapper.class,
		FieldAccess_lfno_primaryMapper.class,
		FieldDeclarationMapper.class,
		FieldModifierMapper.class,
		Finally_Mapper.class,
		FloatingPointTypeMapper.class,
		ForInitMapper.class,
		ForStatementMapper.class,
		ForStatementNoShortIfMapper.class,
		ForUpdateMapper.class,
		FormalParameterListMapper.class,
		FormalParameterMapper.class,
		FormalParametersMapper.class,
		IfThenElseStatementMapper.class,
		IfThenElseStatementNoShortIfMapper.class,
		IfThenStatementMapper.class,
		ImportDeclarationMapper.class,
		InclusiveOrExpressionMapper.class,
		InferredFormalParameterListMapper.class,
		InstanceInitializerMapper.class,
		IntegralTypeMapper.class,
		InterfaceBodyMapper.class,
		InterfaceDeclarationMapper.class,
		InterfaceMemberDeclarationMapper.class,
		InterfaceMethodDeclarationMapper.class,
		InterfaceMethodModifierMapper.class,
		InterfaceModifierMapper.class,
		InterfaceTypeListMapper.class,
		InterfaceTypeMapper.class,
		InterfaceType_lf_classOrInterfaceTypeMapper.class,
		InterfaceType_lfno_classOrInterfaceTypeMapper.class,
		LabeledStatementMapper.class,
		LabeledStatementNoShortIfMapper.class,
		LambdaBodyMapper.class,
		LambdaExpressionMapper.class,
		LambdaParametersMapper.class,
		LastFormalParameterMapper.class,
		LeftHandSideMapper.class,
		LiteralMapper.class,
		LocalVariableDeclarationMapper.class,
		LocalVariableDeclarationStatementMapper.class,
		MarkerAnnotationMapper.class,
		MethodBodyMapper.class,
		MethodDeclarationMapper.class,
		MethodDeclaratorMapper.class,
		MethodHeaderMapper.class,
		MethodInvocationMapper.class,
		MethodInvocation_lf_primaryMapper.class,
		MethodInvocation_lfno_primaryMapper.class,
		MethodModifierMapper.class,
		MethodNameMapper.class,
		MethodReferenceMapper.class,
		MethodReference_lf_primaryMapper.class,
		MethodReference_lfno_primaryMapper.class,
		MultiplicativeExpressionMapper.class,
		NormalAnnotationMapper.class,
		NormalClassDeclarationMapper.class,
		NormalInterfaceDeclarationMapper.class,
		NumericTypeMapper.class,
		PackageDeclarationMapper.class,
		PackageModifierMapper.class,
		PackageNameMapper.class,
		PackageOrTypeNameMapper.class,
		PostDecrementExpressionMapper.class,
		PostDecrementExpression_lf_postfixExpressionMapper.class,
		PostIncrementExpressionMapper.class,
		PostIncrementExpression_lf_postfixExpressionMapper.class,
		PostfixExpressionMapper.class,
		PreDecrementExpressionMapper.class,
		PreIncrementExpressionMapper.class,
		PrimaryMapper.class,
		PrimaryNoNewArrayMapper.class,
		PrimaryNoNewArray_lf_arrayAccessMapper.class,
		PrimaryNoNewArray_lf_primaryMapper.class,
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryMapper.class,
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryMapper.class,
		PrimaryNoNewArray_lfno_arrayAccessMapper.class,
		PrimaryNoNewArray_lfno_primaryMapper.class,
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryMapper.class,
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryMapper.class,
		PrimitiveTypeMapper.class,
		ReceiverParameterMapper.class,
		ReferenceTypeMapper.class,
		RelationalExpressionMapper.class,
		ResourceListMapper.class,
		ResourceMapper.class,
		ResourceSpecificationMapper.class,
		ResultMapper.class,
		ReturnStatementMapper.class,
		ShiftExpressionMapper.class,
		SimpleTypeNameMapper.class,
		SingleElementAnnotationMapper.class,
		SingleStaticImportDeclarationMapper.class,
		SingleTypeImportDeclarationMapper.class,
		StatementExpressionListMapper.class,
		StatementExpressionMapper.class,
		StatementMapper.class,
		StatementNoShortIfMapper.class,
		StatementWithoutTrailingSubstatementMapper.class,
		StaticImportOnDemandDeclarationMapper.class,
		StaticInitializerMapper.class,
		SuperclassMapper.class,
		SuperinterfacesMapper.class,
		SwitchBlockMapper.class,
		SwitchBlockStatementGroupMapper.class,
		SwitchLabelMapper.class,
		SwitchLabelsMapper.class,
		SwitchStatementMapper.class,
		SynchronizedStatementMapper.class,
		TerminalNodeStringsMapper.class,
		ThrowStatementMapper.class,
		Throws_Mapper.class,
		TryStatementMapper.class,
		TryWithResourcesStatementMapper.class,
		TypeArgumentListMapper.class,
		TypeArgumentMapper.class,
		TypeArgumentsMapper.class,
		TypeArgumentsOrDiamondMapper.class,
		TypeBoundMapper.class,
		TypeDeclarationMapper.class,
		TypeImportOnDemandDeclarationMapper.class,
		TypeNameMapper.class,
		TypeParameterListMapper.class,
		TypeParameterMapper.class,
		TypeParameterModifierMapper.class,
		TypeParametersMapper.class,
		TypeVariableMapper.class,
		UnannArrayTypeMapper.class,
		UnannClassOrInterfaceTypeMapper.class,
		UnannClassTypeMapper.class,
		UnannClassType_lf_unannClassOrInterfaceTypeMapper.class,
		UnannClassType_lfno_unannClassOrInterfaceTypeMapper.class,
		UnannInterfaceTypeMapper.class,
		UnannInterfaceType_lf_unannClassOrInterfaceTypeMapper.class,
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeMapper.class,
		UnannPrimitiveTypeMapper.class,
		UnannReferenceTypeMapper.class,
		UnannTypeMapper.class,
		UnannTypeVariableMapper.class,
		UnaryExpressionMapper.class,
		UnaryExpressionNotPlusMinusMapper.class,
		VariableDeclaratorIdMapper.class,
		VariableDeclaratorListMapper.class,
		VariableDeclaratorMapper.class,
		VariableInitializerListMapper.class,
		VariableInitializerMapper.class,
		VariableModifierMapper.class,
		WhileStatementMapper.class,
		WhileStatementNoShortIfMapper.class,
		WildcardBoundsMapper.class,
		WildcardMapper.class
	}
)
public class MapperConfiguration {
}

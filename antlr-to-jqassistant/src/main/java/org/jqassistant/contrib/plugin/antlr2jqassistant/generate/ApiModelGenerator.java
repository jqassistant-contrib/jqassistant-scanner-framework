package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.google.common.base.CaseFormat;
import org.jqassistant.contrib.plugin.antlr2jqassistant.TreeHelper;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.base.BaseGenerator;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.ModelDto;
import org.snt.inmemantlr.GenericParser;
import org.snt.inmemantlr.memobjects.MemorySource;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

import static org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName.QUOTES;

public class ApiModelGenerator extends BaseGenerator {
    public final static String TERMINAL_NODE_CLASS = "TerminalNodeStrings";

    private final BaseDescriptorGenerator baseDescriptorGenerator;
    Map<String, MemorySource> antlrSources = new TreeMap<>();
    MemorySource antlrParser;

    public ApiModelGenerator(GenerationConfig config, GenericParser genericParser, BaseDescriptorGenerator baseDescriptorGenerator) {
        super(config.getPaths().getModelPackage(), config);
        this.baseDescriptorGenerator = baseDescriptorGenerator;

        genericParser.getAllCompiledObjects().forEach(tuple -> antlrSources.put(tuple.getClassName(), tuple.getSource()));
        antlrParser = antlrSources.keySet().stream()
                .filter(cname -> cname.endsWith("Parser")).findAny()
                .map(antlrSources::get).orElseThrow();
    }

    public CompilationUnit getCompilationUnit() {
        JavaParser javaParser = new JavaParser();
        return javaParser.parse(antlrParser.openInputStream()).getResult().orElseThrow();
    }

    public Map<FormattedName, ModelDto> generate() {
        CompilationUnit compilationUnit = getCompilationUnit();
        ClassOrInterfaceDeclaration parser = compilationUnit.getClassByName(antlrParser.getClassName()).orElseThrow();
        List<ClassOrInterfaceDeclaration> classes = getContextClasses(parser);

        Map<FormattedName, ModelDto> list = new TreeMap<>(getTerminalNode());
        classes.forEach(clazz -> list.putAll(generateInterface(clazz)));
        return list;
    }

    private List<ClassOrInterfaceDeclaration> getContextClasses(ClassOrInterfaceDeclaration parser) {
        List<ClassOrInterfaceDeclaration> classes = new ArrayList<>();
        for (Node node : parser.getChildNodes()) {
            if (node instanceof ClassOrInterfaceDeclaration) {
                NodeList<ClassOrInterfaceType> extendedTypes = ((ClassOrInterfaceDeclaration) node).getExtendedTypes();
                if (extendedTypes.getFirst().isPresent() && extendedTypes.getFirst().get().getName().getIdentifier().contains("Context")) {
                    classes.add((ClassOrInterfaceDeclaration) node);
                }
            }
        }
        return classes;
    }

    private Map<FormattedName, ModelDto> getTerminalNode() {
        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(getPackageName());
        compilationUnit.addImport(baseDescriptorGenerator.getPackageName() + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName());

        FormattedName name = new FormattedName(TERMINAL_NODE_CLASS);

//        compilationUnit.addOrphanComment(new JavadocComment("@see org.antlr.v4.runtime.tree.TerminalNode\n" + "@see " + Main.mapperPackage + "." + MapperGenerator.getMapperName(name.getName())));

        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name.getName())
                .addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName());
        TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, name.withQuotes());

        createGetterAndSetter(interfaceDeclaration, new FormattedName("Text"), "String");
        createGetterAndSetter(interfaceDeclaration, new FormattedName("Type"), "String");
        createGetterAndSetter(interfaceDeclaration, new FormattedName("Line"), "String");
        createGetterAndSetter(interfaceDeclaration, new FormattedName("CharPositionInLine"), "String");
        createGetterAndSetter(interfaceDeclaration, new FormattedName("TokenIndex"), "String");
        createGetterAndSetter(interfaceDeclaration, new FormattedName("StartIndex"), "String");
        createGetterAndSetter(interfaceDeclaration, new FormattedName("StopIndex"), "String");

        Map<FormattedName, ModelDto> map = new TreeMap<>();
        map.put(name, new ModelDto(compilationUnit));
        return map;
    }

    private Map<FormattedName, ModelDto> generateInterface(ClassOrInterfaceDeclaration clazz) {
        List<FormattedName> explicitNameMapping = new ArrayList<>();
        FormattedName extendsModel = null;

        FormattedName name = new FormattedName(clazz.getName());

        CompilationUnit compilationUnit = new CompilationUnit();
        compilationUnit.setPackageDeclaration(getPackageName());
        compilationUnit.addImport(baseDescriptorGenerator.getPackageName() + "." + baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName());
        compilationUnit.addOrphanComment(generateComment(clazz));
        ClassOrInterfaceDeclaration interfaceDeclaration = compilationUnit
                .addInterface(name.getName());
        if (clazz.getExtendedTypes().get(0).getName().getIdentifier().equals("ParserRuleContext")) {
            interfaceDeclaration.addExtendedType(baseDescriptorGenerator.BASE_DESCRIPTOR_NAME.getName());
        } else {
            extendsModel = new FormattedName(clazz.getExtendedTypes().get(0).getName());
            interfaceDeclaration.addExtendedType(extendsModel.getName());
        }
        NormalAnnotationExpr generatedAnnotation = TreeHelper.addGeneratedAnnotation(interfaceDeclaration, this.getClass().getName());
        interfaceDeclaration.addSingleMemberAnnotation(Label.class, name.withQuotes());
        interfaceDeclaration.tryAddImportToParentCompilationUnit(List.class);


        List<MethodDeclaration> childContexts = clazz.getChildNodes().stream()
                .filter(child -> child instanceof MethodDeclaration)
                .map(MethodDeclaration.class::cast)
                .filter(methodDeclaration -> methodDeclaration.getAnnotations().isEmpty() && methodDeclaration.getParameters().isEmpty()).collect(Collectors.toList());

        childContexts.forEach(methodDeclaration -> {
            FormattedName childName = new FormattedName(methodDeclaration.getName());
            String type = methodDeclaration.getType().toString();
            if (type.equals("TerminalNode")) {
                createGetterAndSetter(interfaceDeclaration, childName, "TerminalNodeStrings");
            } else if (type.equals("List<TerminalNode>")) {
                createGetterAndSetter(interfaceDeclaration, childName, "List<TerminalNodeStrings>");
            } else {
                createGetterAndSetter(interfaceDeclaration, childName, type);
            }

            if (!childName.getOriginal().equalsIgnoreCase(childName.getName()) || childName.getOriginal().contains("get") || childName.getOriginal().contains("set")) {
                explicitNameMapping.add(childName);
            }
        });

        if (explicitNameMapping.size() > 0 || extendsModel != null) {
            generatedAnnotation.addPair("\n\tcomments", QUOTES + "REQUIRES_SPECIAL_MAPPING" + QUOTES);
        }

        return Collections.singletonMap(name, new ModelDto(compilationUnit, explicitNameMapping, extendsModel));
    }

    public Comment generateComment(ClassOrInterfaceDeclaration clazz) {
        String name = clazz.getNameAsString();
        String nameUpperCamel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, name);

        StringBuilder comment = new StringBuilder()
                .append("\nGenerated from Parser:")
                .append("\n<pre>\n")
                .append(clazz)
                .append("\n</pre>\n")
                .append("\n\n")
                .append("Source Grammar(s): ")
                .append("\n");
        for (File file: getConfig().getGrammarFiles()) {
            comment.append("@see ").append(file.toString()).append("\n");
        }

        return new JavadocComment(comment.toString());
    }

}

package org.jqassistant.contrib.plugin.antlr2jqassistant;

import org.apache.maven.model.Model;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.*;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.ModelDto;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.PackagePaths;
import org.jqassistant.schema.plugin.v1.JqassistantPlugin;
import org.snt.inmemantlr.GenericParser;
import org.snt.inmemantlr.exceptions.CompilationException;
import org.snt.inmemantlr.exceptions.IllegalWorkflowException;
import org.snt.inmemantlr.exceptions.ParsingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    //TODO: Config as command line arguments?
    //TODO: Eventually as Maven Plugin parameters?
    public static final GenerationConfig CONFIG_JAVA = GenerationConfig.builder()
            .pluginId("JavaGen")
            .paths(new PackagePaths("JavaGen", "jqa-java-test"))
            .parserName("Java8")
            .sourceFolder("antlr-to-jqassistant")
            .destinationFolder("jqa-java-test")
            .entryNode("CompilationUnit") //TODO: Consider finding "unused" parser rules that contain EOF
            .grammarFiles(Arrays.asList(
                    new File("antlr-to-jqassistant/src/main/resources/Java8Lexer.g4"),
                    new File("antlr-to-jqassistant/src/main/resources/Java8Parser.g4")
            ))
            .grammarDependencies(Collections.emptyList())
            .build();

    public static final GenerationConfig CONFIG_TYPESCRIPT = GenerationConfig.builder()
            .pluginId("TypeScriptGen")
            .paths(new PackagePaths("TypeScriptGen", "jqa-typescript-test"))
            .parserName("TypeScript")
            .sourceFolder("antlr-to-jqassistant")
            .destinationFolder("jqa-typescript-test")
            .entryNode("Program")
            .grammarFiles(Arrays.asList(
                new File("antlr-to-jqassistant/src/main/resources/TypeScriptLexer.g4"),
                new File("antlr-to-jqassistant/src/main/resources/TypeScriptParser.g4")
            ))
            .grammarDependencies(Arrays.asList(
                new File("antlr-to-jqassistant/src/main/resources/java/TypeScriptLexerBase.java"),
                new File("antlr-to-jqassistant/src/main/resources/java/TypeScriptParserBase.java")
            ))
            .build();

    public static final List<GenerationConfig> CONFIGS = new ArrayList<>(List.of(CONFIG_JAVA, CONFIG_TYPESCRIPT));

    public static void main(String[] args) {
        try {
            for (GenerationConfig config : CONFIGS) {
                new Main(config);
            }
        } catch (FileNotFoundException | CompilationException | ParsingException | IllegalWorkflowException e) {
            e.printStackTrace();
        }
    }

    public Main(GenerationConfig config) throws FileNotFoundException, CompilationException, ParsingException, IllegalWorkflowException {
        FileOperations fileOperations = new FileOperations(config);
        AntlrGenerator antlrGenerator = new AntlrGenerator(config);
        GenericParser genericParser = antlrGenerator.getGenericParser();

        genericParser.writeAntlrAritfactsTo(config.getPaths().getGrammarPath() + "/gen");
        Map<FormattedName, ModelDto> preparedGrammarDependencies = antlrGenerator.getPreparedGrammarDependencies();
        fileOperations.writeToFiles(preparedGrammarDependencies);
        fileOperations.copyFiles(config.getGrammarFiles(), config.getPaths().getGrammarPath());

        BaseDescriptorGenerator baseDescriptorGenerator = new BaseDescriptorGenerator(config);
        Map<FormattedName, ModelDto> baseDescriptors = baseDescriptorGenerator.generate();
        fileOperations.writeToFiles(baseDescriptors);

        ApiModelGenerator antlrParserApiModelGenerator = new ApiModelGenerator(config, genericParser, baseDescriptorGenerator);
        Map<FormattedName, ModelDto> apiModelCompilationUnitMap = antlrParserApiModelGenerator.generate();
        fileOperations.writeToFiles(apiModelCompilationUnitMap);

        MapperGenerator mapperGenerator = new MapperGenerator(config, baseDescriptorGenerator, apiModelCompilationUnitMap);
        Map<FormattedName, ModelDto> mapperCompilationUnitMap = mapperGenerator.generate();
        fileOperations.writeToFiles(mapperCompilationUnitMap);

        Map<FormattedName, ModelDto> allModels = new LinkedHashMap<>();
        allModels.putAll(baseDescriptors);
        allModels.putAll(apiModelCompilationUnitMap);
        JqassistantPlugin jqassistantPlugin = JqassistantPluginGenerator.generatePlugin(config, allModels);
        fileOperations.writeToFile(jqassistantPlugin);

        Model mavenProject = MavenProjectGenerator.generateMavenProject(config.getPluginId());
        fileOperations.writeToFile(mavenProject);
    }

}
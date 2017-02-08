package main;

import grammar.RuleSetGrammarLexer;
import grammar.RuleSetGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.nio.file.Files;
import java.nio.file.Paths;


/**
 *
 * DSL antlr main class.
 *
 * Created by lisa.
 *
 */
public class Main {
    public static void main(String [] args) {
        String fileName = "input.txt";
        runListener(fileName, true);
    }

    public static MusicalListener runListener(String fileName, boolean shouldPrint) {
        try {
            String query = new String(Files.readAllBytes(Paths.get(fileName)));
            ANTLRInputStream input = new ANTLRInputStream(query);
            RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);
            RuleSetGrammarParser.DslContext tree = parser.dsl();
            MusicalListener musical = new MusicalListener(shouldPrint);
            ParseTreeWalker.DEFAULT.walk(musical, tree);
            return musical;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

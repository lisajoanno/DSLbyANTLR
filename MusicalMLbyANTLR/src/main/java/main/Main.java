package main;

import dsl.Musical;
import grammar.*;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
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
        try {
            String query = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("\n---------- Analyzing :\n" + query + "\n----------\n\n");
            ANTLRInputStream input = new ANTLRInputStream(query);
            RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);

            RuleSetGrammarParser.DslContext tree = parser.dsl();
            MusicalListener listener = new MusicalListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);
        } catch (Exception e) {
//            System.err.println("There was an exception somewhere");
            e.printStackTrace();
        }
    }


}

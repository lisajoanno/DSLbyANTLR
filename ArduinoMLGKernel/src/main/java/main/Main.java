package main;

import grammar.*;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.PrintWriter;
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

        String fileName,outputName;

        fileName= "input.txt";
        outputName = "output.txt";
        if(args.length >= 1){
            fileName = args[0];
        }
        if(args.length == 2){
            outputName = args[1];
        }
        if(args.length > 2) {
            System.out.println("Parameters: [input] [output]");
            System.exit(-1);
        }
        try {
            String query = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("\n---------- Analyzing :\n" + query + "\n----------\n\n");
            ANTLRInputStream input = new ANTLRInputStream(query);
            RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);

            RuleSetGrammarParser.DslContext tree = parser.dsl();
            ArduinoMLGListener listener = new ArduinoMLGListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);
            PrintWriter writer = new PrintWriter(outputName, "UTF-8");
            writer.print(listener.getProgram());
            writer.close();

        } catch (Exception e) {
            System.err.println("There was an exception somewhere");
            e.printStackTrace();
        }
    }


}

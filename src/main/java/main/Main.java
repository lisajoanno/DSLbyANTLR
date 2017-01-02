package main;

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
 * Pour utiliser :
 *
 * -    mvn generate-sources
 * -    copier le dossier (generated-sources/antlr4) grammars dans main ( . )
 *              (devrait générer un sous package main.grammars du coup)
 *              (c'est important que ce soit un sous package sinon même nom de package et problème de compil)
 * -    mvn package
 * -    mvn exec:java
 *
 * => ceci analyse le contenu de fileToParse.txt suivant la grammaire définie dans antlr4/RuleSetGrammar.g4
 *
 */
public class Main {
    public static void main(String [] args) {
        String fileName = "fileToParse.txt";
        try {
            String query = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("\n---------- Analyzing :\n" + query + "\n----------\n\n");
            ANTLRInputStream input = new ANTLRInputStream(query);
            RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);

            RuleSetGrammarParser.DslContext tree = parser.dsl();
            RuleSetGrammarBaseListener listener = new RuleSetGrammarBaseListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);
            //parser.addParseListener(new RuleSetGrammarBaseListener());

            /*
            ParseTree tree = parser.dsl(); // begin parsing at query rule
            System.out.println("Number of syntax errors : " + parser.getNumberOfSyntaxErrors());
            System.out.println("    --> toStringTree : ");
            System.out.println(tree.toStringTree(parser)); // print LISP-style tree
             */
        } catch (Exception e) {
            System.err.println("There was an exception somewhere");
        }
    }


}

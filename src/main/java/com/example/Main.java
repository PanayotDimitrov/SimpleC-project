package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Input SimpleC code
        String inputCode = """
            A = scanf();
            B = A * 2;
            printf(B);
        """;

        // Create a lexer and parser for SimpleC
        CharStream input = CharStreams.fromString(inputCode);
        SimpleCLexer lexer = new SimpleCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleCParser parser = new SimpleCParser(tokens);

        // Parse the input code
        ParseTree tree = parser.program();

        // Interpret the code
        SimpleCVisitorImpl interpreter = new SimpleCVisitorImpl();
        interpreter.visit(tree);
    }
}

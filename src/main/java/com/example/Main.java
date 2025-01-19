package com.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // Specify the path to the input file
        String inputFilePath = "src/main/resources/input/input.simplec"; // Replace with the actual file path

        // Read the file content
        String inputCode = new String(Files.readAllBytes(Paths.get(inputFilePath)));

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

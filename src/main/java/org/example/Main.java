package org.example;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String inputFile = "C:\\Users\\Deepanshu Tilwani\\Downloads\\samples\\antlrProject\\src\\main\\java\\org\\example\\abc.java";
        InputStream is = System.in;
        if (inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);

        ExpressionsLexer lexer = new ExpressionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionsParser parser = new ExpressionsParser(tokens);
        ParserRuleContext tree = parser.start(); // parse

        Visitor visitor = new Visitor();
        int result = visitor.visit(tree);
        System.out.println("Result: " + result);
    }
}
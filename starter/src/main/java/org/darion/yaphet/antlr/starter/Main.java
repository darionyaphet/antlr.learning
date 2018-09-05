package org.darion.yaphet.antlr.starter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream stream = new ANTLRInputStream("{1,{2,3},4}");
        ArrayInitLexer lexer = new ArrayInitLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokenStream);
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));
    }
}

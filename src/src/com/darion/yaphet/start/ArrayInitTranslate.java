package com.darion.yaphet.start;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * Created by MLS on 15/9/22.
 */
public class ArrayInitTranslate {

    public static void main(String[] args) throws IOException {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
        ArrayInitLexer lexer = new ArrayInitLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokenStream);
        ParseTree parseTree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeString(), parseTree);
        System.out.println();
    }
}

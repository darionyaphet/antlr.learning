package org.darion.yaphet.antlr.starter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translate {
    public static void main(String[] args) {
        CharStream stream = new ANTLRInputStream("{1,2,3,4}");
        ArrayInitLexer lexer = new ArrayInitLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokenStream);
        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeString(), tree);
    }
}

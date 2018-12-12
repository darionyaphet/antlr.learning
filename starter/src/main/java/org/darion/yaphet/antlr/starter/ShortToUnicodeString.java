package org.darion.yaphet.antlr.starter;

public class ShortToUnicodeString extends ArrayInitBaseListener {

    @Override
    public void enterInit(ArrayInitParser.InitContext context) {
        System.out.print('"');
    }

    @Override
    public void exitInit(ArrayInitParser.InitContext context) {
        System.out.print('"');
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext context) {
        int value = Integer.valueOf(context.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}

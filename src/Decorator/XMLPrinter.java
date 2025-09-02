package Decorator;

public class XMLPrinter extends PrinterDecorator{

    public XMLPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    public void print(String text) {
        decoratedPrinter.print("<xml>" + text + "</xml>");
    }
}

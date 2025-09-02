package Decorator;

public class PrinterDecorator extends Printer {
    protected Printer decoratedPrinter;

    public PrinterDecorator(Printer decoratedPrinter) {
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public void print(String text) {
        decoratedPrinter.print(text);
    }
}

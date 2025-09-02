package Decorator;

public class EncryptedPrinter extends PrinterDecorator{

    public EncryptedPrinter(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    public void print(String text) {
        String newString = "";

        for (int i = 0; i < text.length(); i++) {
            newString += (char)(text.charAt(i) + 1);
        }

        decoratedPrinter.print(newString);
    }
}

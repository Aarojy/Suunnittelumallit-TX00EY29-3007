package Decorator;

public class Main {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello, World!");

        Printer xmlPrinter = new XMLPrinter(basicPrinter);
        xmlPrinter.print("Hello, World!");

        Printer encryptedPrinter = new EncryptedPrinter(basicPrinter);
        encryptedPrinter.print("Hello, World!");

        Printer xmlEncryptedPrinter = new XMLPrinter(encryptedPrinter);
        xmlEncryptedPrinter.print("Hello, World!");

        Printer encryptedXmlPrinter = new EncryptedPrinter(xmlPrinter);
        encryptedXmlPrinter.print("Hello, World!");
    }
}

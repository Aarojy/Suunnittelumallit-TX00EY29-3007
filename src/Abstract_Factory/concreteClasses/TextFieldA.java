package Abstract_Factory.concreteClasses;


import Abstract_Factory.abstractClasses.Textfield;

public class TextFieldA extends Textfield {

    public TextFieldA(String label) {
        super(label);
    }

    @Override
    public void display() {
        System.out.println("-".repeat(label.length() + 4));
        System.out.println("|" + (" ".repeat(label.length() + 2)) + "|");
        System.out.println("| "+ label +" |");
        System.out.println("|" + (" ".repeat(label.length() + 2)) + "|");
        System.out.println("-".repeat(label.length() + 4));
    }
}

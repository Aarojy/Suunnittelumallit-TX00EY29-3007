package Abstract_Factory.concreteClasses;

import Abstract_Factory.abstractClasses.Button;

public class ButtonB extends Button {

    public ButtonB(String label) {
        super(label);
    }

    @Override
    public void display() {
        System.out.println(".".repeat(label.length() + 4));
        System.out.println(": "+ label +" :");
        System.out.println(".".repeat(label.length() + 4));
    }
}

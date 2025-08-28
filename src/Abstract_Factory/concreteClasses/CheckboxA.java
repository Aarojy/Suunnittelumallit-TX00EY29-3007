package Abstract_Factory.concreteClasses;

import Abstract_Factory.abstractClasses.Checkbox;

public class CheckboxA extends Checkbox {

    public CheckboxA(String label) {
        super(label);
    }

    @Override
    public void display() {
        System.out.println(label);
        System.out.println("-----------");
        System.out.println("|   \\ /   |");
        System.out.println("|    X    |");
        System.out.println("|   / \\   |");
        System.out.println("-----------");
    }
}

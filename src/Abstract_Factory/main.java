package Abstract_Factory;

import Abstract_Factory.abstractClasses.Button;
import Abstract_Factory.abstractClasses.Checkbox;
import Abstract_Factory.abstractClasses.Textfield;
import Abstract_Factory.abstractClasses.UIFactory;
import Abstract_Factory.concreteClasses.AFactory;
import Abstract_Factory.concreteClasses.BFactory;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UIFactory UIFactory = new AFactory();

        System.out.println();

        Button button = UIFactory.createButton("Submit");
        button.display();
        System.out.println();

        Checkbox checkbox = UIFactory.createCheckbox("Checkbox");
        checkbox.display();
        System.out.println();

        Textfield textfield = UIFactory.createTextfield("Username Here");
        textfield.display();
        System.out.println();

        System.out.println("Enter your label of choice");
        String label = scanner.nextLine();

        button.setText(label);
        checkbox.setText(label);
        textfield.setText(label);
        System.out.println();

        button.display();
        System.out.println();

        checkbox.display();
        System.out.println();

        textfield.display();
        System.out.println();
    }
}

package Abstract_Factory.concreteClasses;

import Abstract_Factory.abstractClasses.Button;
import Abstract_Factory.abstractClasses.Checkbox;
import Abstract_Factory.abstractClasses.Textfield;
import Abstract_Factory.abstractClasses.UIFactory;

public class BFactory extends UIFactory {
    @Override
    public Button createButton(String label) {
        return new ButtonB(label);
    }

    @Override
    public Textfield createTextfield(String label) {
        return new TextFieldB(label);
    }

    @Override
    public Checkbox createCheckbox(String label) {
        return new CheckboxB(label);
    }
}

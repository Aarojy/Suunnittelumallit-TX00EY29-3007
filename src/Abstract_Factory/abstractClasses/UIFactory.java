package Abstract_Factory.abstractClasses;

public abstract class UIFactory {
    public abstract Button createButton(String label);
    public abstract Textfield createTextfield(String label);
    public abstract Checkbox createCheckbox(String label);
}

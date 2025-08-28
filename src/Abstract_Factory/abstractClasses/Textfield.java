package Abstract_Factory.abstractClasses;

public abstract class Textfield {
    public String label;

    public Textfield(String label) {
        this.label = label;
    }

    public abstract void display();

    public void setText(String label) {
        this.label = label;
    }
}

package Abstract_Factory.abstractClasses;

public abstract class Checkbox {
    public String label;

    public Checkbox(String label) {
        this.label = label;
    }

    public abstract void display();

    public void setText(String label) {
        this.label = label;
    }
}

package Abstract_Factory.abstractClasses;

public abstract class Button {
    public String label;

    public Button(String label) {
        this.label = label;
    }

    public abstract void display();

    public void setText(String label) {
        this.label = label;
    }
}


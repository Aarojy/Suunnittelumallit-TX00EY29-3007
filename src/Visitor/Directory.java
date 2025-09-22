package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private List<FileSystemElement> elements;

    public Directory() {
        this.elements = new ArrayList<>();
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    public void removeElement(FileSystemElement element) {
        elements.remove(element);
    }

    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}

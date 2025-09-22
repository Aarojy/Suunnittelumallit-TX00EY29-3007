package Visitor;

import java.util.ArrayList;

public class SearchVisitor implements FileSystemVisitor {
    private String criteria;
    private ArrayList<FileSystemElement> foundElements;

    public SearchVisitor(String criteria) {
        this.criteria = criteria;
        this.foundElements = new ArrayList<>();
    }

    public ArrayList<FileSystemElement> getElements() {
        return foundElements;
    }

    public void reset() {
        this.foundElements.clear();
    }

    public void changeCriteria(String criteria) {
        reset();
        this.criteria = criteria;
    }

    @Override
    public void visit(File file) {
        String[] parts = file.getName().split("\\.");
        if (parts[1].equals(criteria)) {
            foundElements.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }
}

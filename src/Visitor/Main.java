package Visitor;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.pdf", 10);
        File file2 = new File("file2.png", 20);
        File file3 = new File("file3.txt", 30);

        File file4 = new File("file4.pdf", 12.1);
        File file5 = new File("file5.png", 0.2);
        File file6 = new File("file6.py", 33.2);

        File file7 = new File("file7.exe", 1.2);
        File file8 = new File("file8.png", 5.23);

        Directory dir1 = new Directory();
        dir1.addElement(file1);
        dir1.addElement(file2);
        dir1.addElement(file3);

        Directory dir2 = new Directory();
        dir2.addElement(file4);
        dir2.addElement(file5);
        dir2.addElement(file6);

        Directory dir3 = new Directory();
        dir3.addElement(file7);
        dir3.addElement(file8);

        Directory dir4 = new Directory();
        dir4.addElement(dir1);
        dir4.addElement(dir2);

        Directory root = new Directory();
        root.addElement(dir3);
        root.addElement(dir4);

        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        sizeCalculator.visit(root);
        System.out.println("Total size: " + sizeCalculator.getTotalSize() + " MB");

        System.out.println();

        SearchVisitor searchVisitor = new SearchVisitor("png");
        searchVisitor.visit(root);
        System.out.println("Found " + searchVisitor.getElements().size() + " .png files.");
        for (FileSystemElement element : searchVisitor.getElements()) {
            File file = (File) element;
            System.out.println(" - " + file.getName() + " (" + file.getSize() + " MB)");
        }

        System.out.println();

        searchVisitor.changeCriteria("pdf");
        searchVisitor.visit(root);
        System.out.println("Found " + searchVisitor.getElements().size() + " .pdf files.");
        for (FileSystemElement element : searchVisitor.getElements()) {
            File file = (File) element;
            System.out.println(" - " + file.getName() + " (" + file.getSize() + " MB)");
        }
    }
}

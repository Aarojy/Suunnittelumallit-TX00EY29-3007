package Proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addPublicDocument("Public Document");
        library.addPrivateDocument("Private Document");

        User john = new User("john_doe");
        User jane = new User("jane_doe");

        library.grantAccess(2, john);

        try {
            System.out.println(library.getDocument(1).getContent(john));
            System.out.println(library.getDocument(1).getContent(jane));
            System.out.println(library.getDocument(2).getContent(john));
            System.out.println(library.getDocument(2).getContent(jane));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        library.grantAccess(2, jane);

        try {
            System.out.println(library.getDocument(2).getContent(jane));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}


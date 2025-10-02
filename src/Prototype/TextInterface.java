package Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Recommendation> recommendations = new ArrayList<>();

    public static void start() {
    boolean running = true;

        while (running) {
        System.out.println("\n--- Book Recommendation System ---");
        System.out.println("1. View Recommendations");
        System.out.println("2. Create New Recommendation");
        System.out.println("3. Clone Existing Recommendation");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> viewRecommendations();
            case 2 -> createRecommendation();
            case 3 -> cloneRecommendation();
            case 4 -> running = false;
            default -> System.out.println("Invalid option. Try again.");
        }
    }
}

private static void viewRecommendations() {
    if (recommendations.isEmpty()) {
        System.out.println("No recommendations available.");
        return;
    }

    for (int i = 0; i < recommendations.size(); i++) {
        System.out.println("\nRecommendation #" + (i + 1));
        System.out.println(recommendations.get(i));
    }
}

private static void createRecommendation() {
    System.out.print("Enter target audience: ");
    String audience = scanner.nextLine();
    Recommendation recommendation = new Recommendation(audience);

    boolean addingBooks = true;
    while (addingBooks) {
        System.out.print("Add a book? (y/n): ");
        String ans = scanner.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            recommendation.addRecommendation(createBook());
        } else {
            addingBooks = false;
        }
    }

    recommendations.add(recommendation);
    System.out.println("New recommendation list created!");
}

private static void cloneRecommendation() {
    if (recommendations.isEmpty()) {
        System.out.println("No recommendations available to clone.");
        return;
    }

    System.out.println("Select a recommendation to clone:");
    for (int i = 0; i < recommendations.size(); i++) {
        System.out.println((i + 1) + ". " + recommendations.get(i).getTargetAudience());
    }

    int index = Integer.parseInt(scanner.nextLine()) - 1;
    if (index < 0 || index >= recommendations.size()) {
        System.out.println("Invalid selection.");
        return;
    }

    Recommendation cloned = recommendations.get(index).clone();

    System.out.print("Enter new target audience (or leave empty to keep '"
            + cloned.getTargetAudience() + "'): ");
    String newAudience = scanner.nextLine();
    if (!newAudience.isEmpty()) {
        cloned.changeTargetAudience(newAudience);
    }

    boolean modifying = true;
    while (modifying) {
        System.out.println("Modify cloned recommendation?");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Done");
        System.out.print("Choose: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> cloned.addRecommendation(createBook());
            case 2 -> {
                System.out.println(cloned);
                System.out.print("Enter book number to remove: ");
                int bookIndex = Integer.parseInt(scanner.nextLine()) - 1;
                if (bookIndex >= 0 && bookIndex < cloned.getBooks().size()) {
                    Book bookToRemove = cloned.getBooks().get(bookIndex);
                    cloned.removeRecommendation(bookToRemove);
                } else {
                    System.out.println("Invalid book number.");
                }
            }
            case 3 -> modifying = false;
            default -> System.out.println("Invalid option.");
        }
    }

    recommendations.add(cloned);
    System.out.println("Cloned recommendation added!");
}

private static Book createBook() {
    System.out.print("Enter title: ");
    String title = scanner.nextLine();
    System.out.print("Enter author: ");
    String author = scanner.nextLine();
    System.out.print("Enter genre: ");
    String genre = scanner.nextLine();
    System.out.print("Enter publication year: ");
    int year = Integer.parseInt(scanner.nextLine());

    return new Book(title, author, genre, year);
}
}

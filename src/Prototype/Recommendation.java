package Prototype;

import javax.naming.Name;
import java.util.ArrayList;

public class Recommendation {
    private String targetAudience;
    private ArrayList<Book> recommendations;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.recommendations = new ArrayList<>();
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public ArrayList<Book> getRecommendations() {
        return recommendations;
    }

    public void changeTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public void addRecommendation(Book recommendation) {
        recommendations.add(recommendation);
    }

    public void removeRecommendation(Book recommendation) {
        recommendations.remove(recommendation);
    }

    public Recommendation clone() {
        Recommendation cloned = new Recommendation(this.targetAudience);
        for (Book rec : this.recommendations) {
            cloned.addRecommendation(rec.clone());
        }
        return cloned;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target Audience: " + targetAudience + "\nBooks:\n");
        for (int i = 0; i < recommendations.size(); i++) {
            sb.append("  ").append(i + 1).append(". ").append(recommendations.get(i)).append("\n");
        }
        return sb.toString();
    }

    public ArrayList<Book> getBooks() {
        return recommendations;
    }
}

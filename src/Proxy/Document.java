package Proxy;

import java.time.LocalDate;
import java.util.ArrayList;

public class Document implements IDocument {
    private int id;
    private LocalDate createdAt;
    private String content;
    private static int idCounter = 0;


    public Document(String content) {
        this.id = ++idCounter;
        this.createdAt = LocalDate.now();
        this.content = content;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}

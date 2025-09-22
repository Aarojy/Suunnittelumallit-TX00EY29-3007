package Proxy;

import java.time.LocalDate;

public class DocumentProxy implements IDocument {
    private Document document;
    private int id;
    private LocalDate createdAt;
    private AccessControlService accessControlService;

    public DocumentProxy(Document document) {
        this.document = document;
        this.id = document.getId();
        this.createdAt = document.getCreatedAt();
        this.accessControlService = AccessControlService.getInstance();
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
    public String getContent(User user) throws AccessDeniedException {
        if (accessControlService.isAllowed(user.getUsername(), id)) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername() + " to document ID: " + id);
        }
    }
}

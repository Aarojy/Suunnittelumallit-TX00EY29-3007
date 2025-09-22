package Proxy;

import java.util.HashMap;

public class Library {
    private HashMap<Integer, IDocument> documents;
    private AccessControlService accessControlService;

    public Library() {
        documents = new HashMap<>();
        accessControlService = AccessControlService.getInstance();
    }

    public void addPublicDocument(String content) {
        Document document = new Document(content);
        documents.put(document.getId(), document);
    }

    public void addPrivateDocument(String content) {
        Document document = new Document(content);
        DocumentProxy documentProxy = new DocumentProxy(document);
        documents.put(document.getId(), documentProxy);
    }

    public IDocument getDocument(int id) {
        return documents.get(id);
    }

    public void grantAccess(int documentId, User user) {
        accessControlService.grantAccess(documentId, user);
    }
}

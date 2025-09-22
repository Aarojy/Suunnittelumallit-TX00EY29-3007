package Proxy;

import java.time.LocalDate;

public interface IDocument {
    int getId();
    LocalDate getCreatedAt();
    String getContent(User user) throws AccessDeniedException;
}

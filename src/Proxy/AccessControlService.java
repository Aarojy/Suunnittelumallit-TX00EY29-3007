package Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccessControlService {
    private static AccessControlService INSTANCE = null;
    private static HashMap<Integer, List<String>> accessMap;

    private AccessControlService() {}

    public static AccessControlService getInstance() {
        if (INSTANCE == null) {
            accessMap = new HashMap<>();
            INSTANCE = new AccessControlService();
        }
        return INSTANCE;
    }

    public boolean isAllowed(String username, int documentId) {
        if (accessMap.containsKey(documentId)) {
            List<String> users = accessMap.get(documentId);
            return users.contains(username);
        }
        return false;
    }

    public void grantAccess(int documentId, User user) {
        if (accessMap.containsKey(documentId)) {
            List<String> users = accessMap.get(documentId);
            if (!users.contains(user.getUsername())) {
                users.add(user.getUsername());
            }
        } else {
            accessMap.put(documentId, new ArrayList<>(List.of(user.getUsername())));
        }
    }
}

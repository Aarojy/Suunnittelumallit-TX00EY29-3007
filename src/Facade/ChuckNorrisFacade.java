package Facade;

import java.io.IOException;
import java.net.http.HttpResponse;

public class ChuckNorrisFacade {
    String getAttributeValueFromJson(String urlString, String attributeName) throws Exception {
        HttpResponse<String> response = GetRequester.get(urlString);
        String attributeValue = JSONParser.parseAttribute(response, attributeName);
        return attributeValue;
    }
}

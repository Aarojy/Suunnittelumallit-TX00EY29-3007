package Facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.net.http.HttpResponse;

public class JSONParser {
    public static String parseAttribute(HttpResponse<String> response, String attributeName) {
        String responseBody = response.body();

        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();

        try {
            JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
            Object value = jsonObject.get(attributeName);

            if (value == null) {
                throw new IllegalArgumentException("Attribute not found in JSON response: " + attributeName);
            }

            return value.toString();

        } catch (ParseException e) {
            throw new RuntimeException("Failed to parse JSON response", e);
        }
    }
}

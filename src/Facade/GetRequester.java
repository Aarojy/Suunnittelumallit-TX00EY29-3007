package Facade;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetRequester {
    public static HttpResponse<String> get(String urlString) throws IOException, InterruptedException {
        HttpResponse<String> response;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new IOException("Failed to send GET request to " + urlString, e);
        }

        return response;
    }
}

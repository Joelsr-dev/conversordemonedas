package com.currencyconverter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.io.IOException;

public class CurrencyClient {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/728894f7e833744220478f06/latest/USD";  // Cambia YOUR_API_KEY por tu clave

    public static HttpResponse<String> sendRequest() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}

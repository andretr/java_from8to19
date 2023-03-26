package com.mitocode.java11.htppclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import static java.time.temporal.ChronoUnit.SECONDS;

public class HttpClientApp {

    private void m1() throws Exception{
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://pokeapi.co/api/v2/pokemon/ditto"))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private void m2Configs() throws Exception{
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://pokeapi.co/api/v2/pokemon/ditto"))
                .header("key1", "value1")
                .timeout(Duration.of(10, SECONDS))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private void m3Bodys() throws Exception{
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://pokeapi.co/api/v2/pokemon/ditto"))
                //.POST(HttpRequest.BodyPublishers.noBody())
                .headers("Content-Type", "text/plain;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString("mitocode body"))
                //.POST(HttpRequest.BodyPublishers.ofInputStream(() -> new ByteArrayInputStream(data)))
                //.POST(HttpRequest.BodyPublishers.ofFile(Paths.get("src/main/resources/mitocode.txt")))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    public static void main(String[] args) throws Exception {
        HttpClientApp app = new HttpClientApp();
        app.m1();
    }
}

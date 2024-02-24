package java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientUpdate {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        getHttpRequest();
        postHttpRequest();
    }

    public static void getHttpRequest() throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(new URI("https://dummy.restapiexample.com/api/v1/employees")).GET().build();
        HttpResponse<String> send = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(send.statusCode());
        System.out.println(send.body());
    }

    public static void postHttpRequest() throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        String body = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
        HttpRequest request = HttpRequest.newBuilder(new URI("https://dummy.restapiexample.com/api/v1/create")).POST(HttpRequest.BodyPublishers.ofString(body)).header("Content-Type","application/json").build();
        HttpResponse<String> send = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(send.statusCode());
        System.out.println(send.body());
    }
}

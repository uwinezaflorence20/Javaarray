import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Fetch {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/comments"))
                .build();


    }
}

package locadoradotiao.viewmodel;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarFilme {
    private static final String apiKey = "e84ed0f5";
    private String nomeFilme;

    public String RetunrJsonString() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        String url = String.format("http://www.omdbapi.com/?t=%s&apikey=%s", nomeFilme.replace(" ", ""), apiKey);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

}

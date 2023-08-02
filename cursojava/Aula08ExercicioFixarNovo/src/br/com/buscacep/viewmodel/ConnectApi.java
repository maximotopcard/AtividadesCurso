package br.com.buscacep.viewmodel;
import br.com.buscacep.model.EnderecoRecord;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectApi {
    public Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
            .setPrettyPrinting()
            .create();
    public String connect(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public EnderecoRecord[] takeJsonArray(String url) throws IOException, InterruptedException {
        return gson.fromJson(connect(url), EnderecoRecord[].class);
    }

    public EnderecoRecord takeJson(String url) throws IOException, InterruptedException {
        return gson.fromJson(connect(url), EnderecoRecord.class);
    }
}

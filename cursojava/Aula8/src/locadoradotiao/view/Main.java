package locadoradotiao.view;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import locadoradotiao.model.Titulos;
import locadoradotiao.model.TitulosRecord;
import locadoradotiao.viewmodel.FileJsonCreate;
import locadoradotiao.viewmodel.BuscarFilme;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//PESQUISAR POR divertidamente RETORNA ERRO DE CONVERSÃO DE INTEIROS;
//PESQUISAR POR goiaba RETORNA A MENSAGEM DE NÃO ENCOTRADO;
//PESQUISAR POR matrix RETORNA COM SUCESSO;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        BuscarFilme buscarFilme = new BuscarFilme();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Titulos> titulosList = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String buscar = "";

        do {
            System.out.println("Digite o nome do filme: Digite entrar para sair!");
            buscar = scanner.next();
            if (buscar.equalsIgnoreCase("entrar")) break;
            buscarFilme.setNomeFilme(buscar);
            TitulosRecord titulosRecord = gson.fromJson(buscarFilme.RetunrJsonString(), TitulosRecord.class);

            try {
                if (titulosRecord.title() != null) {
                    Titulos titulo = new Titulos(titulosRecord);
                    titulosList.add(titulo);
                    System.out.println("Filme Adicionado!");
                    System.out.println(titulo);
                } else {
                    System.out.println("Filme não encontrado!");
                }
            } catch (NumberFormatException e) {
                System.out.println("A class Titulo não conseguiu converter os números em inteiros!" + e.getMessage());
            }
        } while (true);

        FileJsonCreate fileJsonCreate = new FileJsonCreate();
        fileJsonCreate.FileCreate(gson, titulosList);

    }
}

package br.com.buscacep.viewmodel;
import br.com.buscacep.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveJson {
    public void saveNewFile(Gson gson, ArrayList<Endereco> endereco) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter("enderecos.json");
            fileWriter.write(gson.toJson(endereco));
            fileWriter.close();
            System.out.println("Seu arquivo foi salvo com sucesso!");

        } catch (FileNotFoundException e){
            System.out.println("Não foi possivel salvar o arquivo %s: %s" + e.getCause());
        }
    }
}

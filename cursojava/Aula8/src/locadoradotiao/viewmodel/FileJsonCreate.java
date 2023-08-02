package locadoradotiao.viewmodel;
import com.google.gson.Gson;
import locadoradotiao.model.Titulos;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileJsonCreate {
    private static final String nomeArquivo = "Filmes.json";
    public void FileCreate(Gson gson, ArrayList<Titulos> titulos) throws IOException {
        try{
            FileWriter file = new FileWriter(nomeArquivo);
            file.write(gson.toJson(titulos));
            file.close();
            System.out.println("Json salvo com sucesso!");
        } catch (FileNotFoundException e){
            System.out.printf("Não foi possivel salvar o arquivo %s: %s", nomeArquivo, e.getCause());
        }
    }
}

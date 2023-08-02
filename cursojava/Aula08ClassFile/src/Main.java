import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.inputCliente();

        try {
            String folder = "Clientes";
            String path = String.format("c://%s", folder);
            String arquivo = String.format("%s.txt", cliente.getPrimeiroNome());

            File file = new File(path);
            if (file.mkdirs() || file.exists()) {
                file = new File(path + "/" + arquivo);
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(cliente.returnText());
                fileWriter.close();
                System.out.println("Cliente salvo com sucesso!");
            } else {
                System.out.println("Não foi possivel criar uma pasta!");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel salvar o arquivo, contacte o administrador: " + e.getMessage());
        } finally {
            System.out.println("Programa Finalizado!");
        }
    }
}
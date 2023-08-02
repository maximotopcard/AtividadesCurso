import br.com.buscacep.model.Endereco;
import br.com.buscacep.model.EnderecoRecord;
import br.com.buscacep.viewmodel.ConnectApi;
import br.com.buscacep.viewmodel.GeraUrl;
import br.com.buscacep.viewmodel.SaveJson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        ConnectApi connectApi = new ConnectApi();
        GeraUrl geraUrl = new GeraUrl();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Endereco> enderecosList = new ArrayList<>();
        SaveJson saveJson = new SaveJson();
        String menu, urlBusca;

        whileForm:
        do {
            System.out.print("\nDIGITE: 1-BUSCAR POR CEP | 2-BUSCAR POR ENDEREÇO | 3-SAIR E SALVAR ARQUIVO: ");
            menu = scanner.next();

            switch (menu) {
                case "1":
                    urlBusca = geraUrl.buscarPorCep();
                    break;
                case "2":
                    urlBusca = geraUrl.buscarPorEndereco();
                    break;
                case "3":
                    System.out.println("Adeus LuNaTiCoS...");
                    break whileForm;
                default:
                    System.out.println("Você digitou o comando errado, tente novamente!");
                    continue;
            }

            try {
                if (menu.equals("1")) {
                    EnderecoRecord enderecoRecordCep = connectApi.takeJson(urlBusca);
                    if (enderecoRecordCep.cep() != null) {
                        Endereco enderecoCep = new Endereco(enderecoRecordCep);
                        enderecosList.add(enderecoCep);
                        System.out.println("\nENDEREÇO SOLICITADO!");
                        System.out.println(enderecoCep);
                    } else {
                        System.out.println("Endereço não encontrado!");
                    }
                }

                if (menu.equals("2")) {
                    EnderecoRecord[] enderecoRecordEndereco = connectApi.takeJsonArray(urlBusca);
                    if (enderecoRecordEndereco.length != 0) {
                        for (EnderecoRecord enderecos : enderecoRecordEndereco) {
                            Endereco endereconew = new Endereco(enderecos);
                            System.out.println("\nENDEREÇO SOLICITADO!");
                            enderecosList.add(endereconew);
                            System.out.println(endereconew);
                        }
                    } else {
                        System.out.println("Endereço não encontrado!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Informação incompleta! Verifique se você deixou de incluir algum dado!");
                System.out.println("Erro 400 ao retornar os dados!");
            }
        } while (true);
        saveJson.saveNewFile(connectApi.gson,  enderecosList);
    }
}
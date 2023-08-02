package br.com.buscacep.viewmodel;

import java.util.Scanner;

public class GeraUrl {
    private final String url = "https://viacep.com.br/ws/%s/json/";
    private final Scanner scanner = new Scanner(System.in);

    public String buscarPorCep() {
        System.out.println("Digite um CEP válido: ");
        String value = scanner.next();
        return String.format(url, value).replace(" ", "");
    }

    public String buscarPorEndereco() {
        String value;
        System.out.println("UF(SIGLA): ");
        value = scanner.nextLine() + "/";
        System.out.println("NOME DA CIDADE: ");
        value += scanner.nextLine() + "/";
        System.out.println("NOME DO BAIRRO: ");
        value += scanner.nextLine();
        return String.format(url, value).replace(" ", "%20").toLowerCase();
    }

}

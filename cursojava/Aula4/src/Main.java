import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Máximo Colodetti";
        String conta = "Corrente";
        double valorConta = 2500.00f;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("""
                        
                BANCO DU MÁXIMO
                        
                NOME: %s.
                CONTA: %s.
                SALDO: $ %f

                """, nome, conta, valorConta);

        while (true) {
            System.out.println("""
                                        
                    OPERAÇÕES
                                        
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                        
                    Digite a opção desejada:
                    """);
            int valorComando = scanner.nextInt();

            if (valorComando == 1) {
                System.out.printf("Seu saldo é $ %f", valorConta);
            } else if (valorComando == 2) {
                System.out.println("Informe o valor a receber:");
                double novoValor = scanner.nextDouble();
                valorConta += novoValor;
                System.out.printf("O seu novo saldo é $ %f", valorConta);
            } else if (valorComando == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double novoValor = scanner.nextDouble();
                if (novoValor > valorConta) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    valorConta -= novoValor;
                    System.out.printf("O seu novo saldo é $ %f", valorConta);
                }
            } else if (valorComando == 4) {
                System.out.println("ADEUS!!!!");
                break;
            } else {
                System.out.println("Comando Errado!");
            }
        }
    }
}


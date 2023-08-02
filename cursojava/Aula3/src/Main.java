import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contarTentativas = 0;
        int numeroAleatorio = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe o número de 0 a 100: ");
        while (contarTentativas < 5) {
            int valor = scanner.nextInt();
            contarTentativas++;

            if (valor < numeroAleatorio) {
                System.out.printf("O valor que você digitou é menor que o número gerado. Tentativas %d/5%n", contarTentativas);
            } else if (valor > numeroAleatorio) {
                System.out.printf("O valor que você digitou é maior que o número gerado. Tentativas %d/5%n", contarTentativas);
            } else {
                System.out.printf("CONGRATULATIONS, YOU WIN!!!! GRRRRRRR. Tentativas %d/5%n", contarTentativas);
                break;
            }

            if (contarTentativas >= 5) {
                System.out.println("YOU LOSS!!! grrrrr");
            }
        }
    }
}
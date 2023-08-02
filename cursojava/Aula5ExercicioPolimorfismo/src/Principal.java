
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Midia[] midias = new Midia[5];
        Scanner scanner = new Scanner(System.in);
        int codigo;

        for (int x = 0; x < midias.length; x++) {
            System.out.println("\n1 - MIDIA;  2 - DVD; 3 - CD;\n");
            codigo = scanner.nextInt();

            switch (codigo) {
                case 1 -> {
                    midias[x]  = new Midia();
                    midias[x].inserirDados();
                }
                case 2 -> {
                    midias[x]  = new CD();
                    midias[x].inserirDados();
                }
                case 3 -> {
                    midias[x]  = new DVD();
                    midias[x].inserirDados();
                }
                default -> System.out.println("Entrada inválida!");
            }
        }

        for (Midia midia : midias) {
            midia.printDados();
        }
    }
}


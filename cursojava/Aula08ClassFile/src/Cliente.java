import java.util.Scanner;

public class Cliente {
    private String primeiroNome;
    private String sobrenome;
    private int idade;
    private String cpf;

    public Cliente(){
         this(null, null, 0, null);
    }
    public Cliente(String primeiroNome, String sobrenome, int idade, String cpf){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void inputCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro nome do cliente: ");
        primeiroNome = scanner.next();
        System.out.print("Digite o sobrenome do cliente: ");
        sobrenome = scanner.next();
        System.out.print("Digite a idade do cliente: ");
        idade = scanner.nextInt();
        System.out.print("Digite o cpf do cliente: ");
        cpf = scanner.next();
    }

    public String returnText() {
        return String.format("""
               CADASTRO CLIENTE:
               NOME: %s %s,
               IDADE: %d,
               CPF: %s
                """, primeiroNome, sobrenome, idade, cpf);
    }
}

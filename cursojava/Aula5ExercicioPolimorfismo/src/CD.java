import java.util.Scanner;

public class CD extends Midia {
    private int numeroMusicas;

    public CD() {
        this(0, 0.0, "null", 0);
    }

    public CD(int codigo, double preco, String nome, int numeroMusicas) {
        super(codigo, preco, nome);
        setNumeroMusicas(numeroMusicas);
    }

    public int getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }

    @Override
    public String getTipo() {
        return "CD: ";
    }

    @Override
    public String getDetalhes() {
        return String.format("""
                CÓDIGO: %d,
                NOME: %s,
                PRECO: %f,
                NUMEROS MUSICAS: %d
                """, getCodigo(), getNome(), getPreco(), getNumeroMusicas());
    }

    @Override
    public void inserirDados(){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        setCodigo(scanner.nextInt());
        System.out.print("Digite o nome do produto: ");
        setNome(scanner.next());
        System.out.print("Digite o preço do produto: ");
        setPreco(scanner.nextDouble());
        System.out.print("Digite o numero de musicas: ");
        setNumeroMusicas(scanner.nextInt());
    }

}

import java.util.Scanner;

public class DVD extends Midia {
    private int numeroFaixas;

    public DVD(){
        this(0,0.0,"Null", 5);
    }

    public DVD(int codigo, double preco, String nome, int faixas) {
        super(codigo,preco,nome);
        setNumeroFaixas(faixas);
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD: ";
    }

    @Override
    public String getDetalhes() {
        return String.format("""
                CÓDIGO: %d,
                NOME: %s,
                PREÇO: %f,
                NUMERO FAIXAS: %d
                """, getCodigo(), getNome(), getPreco(), getNumeroFaixas());
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
        setNumeroFaixas(scanner.nextInt());
    }


}

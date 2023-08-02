import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia(){
        this(0, 0.0, "Null");
    }

    public Midia(int codigo, double preco, String nome) {
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }



    public String getTipo() {
        return "MIDIA: ";
    }

    public String getDetalhes() {
        return String.format("""
                CODIGO: %d,
                NOME: %s,
                PREÇO: %f
                """, getCodigo(), getNome(), getPreco());
    }

    public void printDados(){
        System.out.println(getTipo() + getDetalhes());
    }

    public void inserirDados(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        setCodigo(scanner.nextInt());
        System.out.print("Digite o nome do produto: ");
        setNome(scanner.next());
        System.out.print("Digite o preço do produto: ");
        setPreco(scanner.nextDouble());
    }
}

package model;

public class Produtos implements  Comparable<Produtos>{
    private int id;
    private final String descricao;
    private final double valor;
    public Produtos(int id, String nomeProduto, double valorProduto){
        this.id = id;
        this.descricao = nomeProduto;
        this.valor = valorProduto;
    }
    public int getId() {
        return id;
    }
    public double getValor() {
        return valor;
    }
    @Override
    public String toString(){
        return String.format("CÓD: %d, DESCRIÇÃO: %s, VALOR: B$%f\n", id, descricao, valor);
    }
    @Override
    public int compareTo(Produtos o) {
        return Double.valueOf(valor).compareTo(Double.valueOf(o.valor));
    }
}

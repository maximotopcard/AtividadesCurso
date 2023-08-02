package Model;

import Print.Imprimir;
public class Livro extends Produto implements Imprimir {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String imprimirDados() {
        return String.format("""
                               
                NOME: %s,
                DESCRIÇÃO: %s,
                AUTOR: %s,
                PREÇO: %f
                               
                """, getNome(), getDescricao(), getAutor(), getPreco());
    }
}

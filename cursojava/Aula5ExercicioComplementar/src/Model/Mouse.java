package Model;

import Print.Imprimir;
public class Mouse extends Produto implements Imprimir {
    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String imprimirDados() {
        return String.format("""
                               
                NOME: %s,
                DESCRIÇÃO: %s,
                AUTOR: %s,
                PREÇO: %f
                               
                """, getNome(), getDescricao(), getTipo(), getPreco());
    }
}

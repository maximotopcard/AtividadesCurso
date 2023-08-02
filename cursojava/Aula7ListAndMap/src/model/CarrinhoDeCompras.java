package model;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private final ArrayList<Produtos> listProdutos = new ArrayList<>();;
    public double valorTotal(){
        double valor = 0;
        for(Produtos produto : listProdutos){
            valor += produto.getValor();
        }
        return valor;
    }

    public ArrayList<Produtos> getListProdutos() {
        return listProdutos;
    }
    public void setListProdutos(Produtos produtos) {
        listProdutos.add(produtos);
    }
}

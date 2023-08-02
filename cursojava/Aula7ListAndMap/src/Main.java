import model.CarrinhoDeCompras;
import model.CartaoDeCredito;
import model.Produtos;

import java.awt.image.AreaAveragingScaleFilter;
import java.text.CollationElementIterator;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        ArrayList<Produtos> listProdutos = new ArrayList<>();
        listProdutos.add(new Produtos(1, "pato", 15.00f));
        listProdutos.add(new Produtos(2, "frango", 10.00f));
        listProdutos.add(new Produtos(3, "boi", 155.00f));
        listProdutos.add(new Produtos(4, "porco", 13.24f));

        HashMap<Integer, Produtos> produtoMaps = new HashMap<>();
        for (Produtos produto : listProdutos) {
            produtoMaps.put(produto.getId(), produto);
        }

        System.out.println("::::: Açougue Vegano :::::");
        System.out.print("Digite o limite do cartão: B$");
        cartaoDeCredito.setValorLimite(scanner.nextDouble());

        boolean ativo = true;
        while (ativo) {
            System.out.println("-----------------------");
            System.out.print("Digite o ID do produto: ");
            int idProduto = scanner.nextInt();
            Produtos newProduto = produtoMaps.get(idProduto);

            if (newProduto != null) {
                carrinhoDeCompras.setListProdutos(newProduto);
                System.out.println(carrinhoDeCompras.getListProdutos());
                System.out.println("Você já consumiu: B$" + carrinhoDeCompras.valorTotal());
            }
            Collections.sort(carrinhoDeCompras.getListProdutos());

            System.out.print("Digite: 1-Continuar Compra | 2- Finalizar Comprar ");
            int controle = scanner.nextInt();
            if (controle == 1) {
                continue;
            } else if (controle == 2) {
                if (carrinhoDeCompras.valorTotal() < cartaoDeCredito.getValorLimite()) {
                    System.out.println("\nPROCESSANDO COMPRA...");
                    System.out.println("::::::::::::::::::::::");
                    System.out.println(carrinhoDeCompras.getListProdutos());
                    System.out.println("TOTAL DA COMPRA: " + carrinhoDeCompras.valorTotal());
                    System.out.println("::::::::::::::::::::::");
                    System.out.println("Compra Finalizada com sucesso!!!\n");
                } else {
                    System.out.println("Seu cartão estourou o limite, infelizmente!");
                    System.out.println("ADEUS!!!");
                }
                ativo = false;
            } else {
                System.out.println("Este comando não existe");
            }


        }
    }
}
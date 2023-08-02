package br.com.topcard.filmes.calculos;

public class FiltroRecomendacao {
    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos no momento.");
        } else {
            System.out.println("Horrível.");
        }
    }
}

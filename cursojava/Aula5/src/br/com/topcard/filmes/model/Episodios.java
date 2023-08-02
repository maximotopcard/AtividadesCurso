package br.com.topcard.filmes.model;

import br.com.topcard.filmes.calculos.Classificavel;
import br.com.topcard.filmes.model.Serie;
import br.com.topcard.filmes.model.Titulos;

public class Episodios implements Classificavel {
    private int numero;
    private int totalVisualizacao;
    private Serie serie;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        int valorClassificacao = 0;
        if(totalVisualizacao > 100){
            valorClassificacao =  4;
        }
        return valorClassificacao;
    }
}

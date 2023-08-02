package br.com.topcard.filmes.calculos;

import br.com.topcard.filmes.model.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal;
    public void incluir(Titulos titulos){
        tempoTotal += titulos.getDuracaoEmMinutos();
    }
    public int getTempoTotal() {
        return tempoTotal;
    }
}

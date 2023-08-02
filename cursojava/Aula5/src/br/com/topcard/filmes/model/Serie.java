package br.com.topcard.filmes.model;
import br.com.topcard.filmes.calculos.Classificavel;

public class Serie extends Titulos implements Classificavel {
    private final int temporadas;
    private final boolean ativa;
    private final int episodioPorTemporada;
    private final int minutosPorEpisodio;

    public Serie(String nome, int anoLancamento, int duracaoEmMinutos, boolean incluidoNoPlano,int temporadas,
                 boolean ativa, int episodioPorTemporada, int minutosPorEpisodio) {
        super(nome, anoLancamento, duracaoEmMinutos, incluidoNoPlano);
        this.temporadas = temporadas;
        this.ativa = ativa;
        this.episodioPorTemporada = episodioPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
    @Override
    public String toString(){
        return String.format("Serie: %s, Temporadas: %d, Ano: %d\n", getNome(), temporadas, getAnoLancamento());
    }
    @Override
    public int getDuracaoEmMinutos() {
        return minutosPorEpisodio * episodioPorTemporada * temporadas;
    }
}

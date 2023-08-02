package br.com.topcard.filmes.model;
import br.com.topcard.filmes.calculos.Classificavel;
public class Filme extends Titulos implements Classificavel{
    private final String diretor;

    public Filme(String nome, int anoLancamento, int duracaoEmMinutos, boolean incluidoNoPlano,String diretor){
        super(nome, anoLancamento, duracaoEmMinutos, incluidoNoPlano);
        this.diretor = diretor;
    }
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
    @Override
    public String toString(){
        return String.format("Filme: %s, Diretor: %s, Ano: %d\n", getNome(), diretor, getAnoLancamento());
    }
}

package br.com.topcard.filmes.model;

public class Titulos implements Comparable<Titulos> {
    private final String nome;
    private final int anoLancamento;
    private final int duracaoEmMinutos;
    private final boolean incluidoNoPlano;
    private double somarAvaliacoes;
    private int totalAvaliacoes;
    public Titulos(String nome, int anoLancamento, int duracaoEmMinutos, boolean incluidoNoPlano){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void exibirFichaTecnica() {
        System.out.printf("""
                                
                FICHA TECNICA
                NOME: %s,
                ANO DE LANÇAMENTO: %d,
                DURAÇÃO: %d minutos,
                INCLUI NO PLANO: %s.
                                
                """, nome, anoLancamento, duracaoEmMinutos, incluidoNoPlano);
    }

    public void avaliar(int nota) {
        somarAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somarAvaliacoes / totalAvaliacoes;
    }

    //Implementação de ordenamento de dado com a inserção
    //da interface Comparable. 26/06/2023.
    @Override
    public int compareTo(Titulos o) {
        return this.getNome().compareTo(o.nome);
    }



}

package br.com.topcard.spoticard.model;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private int classificacao;

    public void curte() {
        totalCurtidas++;
    }

    public void reproduz() {
        totalReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }
}

package br.com.topcard.spoticard.model;

public class MinhasPreferidas {

    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 10) {
            System.out.printf(String.format("%s é a melhor. \n", audio.getTitulo()));
        } else {
            System.out.printf(String.format("%s é a pior. \n", audio.getTitulo()));
        }
    }

}

import br.com.topcard.filmes.calculos.CalculadoraDeTempo;
import br.com.topcard.filmes.model.Episodios;
import br.com.topcard.filmes.calculos.FiltroRecomendacao;
import br.com.topcard.filmes.model.Filme;
import br.com.topcard.filmes.model.Serie;
import br.com.topcard.filmes.model.Titulos;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Filme filme01 = new Filme("A baratinha", 1999, 150, true, "Máximo");
        filme01.avaliar(10);
        Filme filme02 = new Filme("Alibaba", 2022, 200, true, "Máximo");
        filme02.avaliar(6);
        Filme filme03 = new Filme("La BabaAli", 2020, 201, true, "Máximo");
        filme03.avaliar(10);
        Serie serie01 = new Serie("The Zezin", 2017, 1000, false, 10, false, 10, 55);
        serie01.avaliar(9);
        Serie serie02 = new Serie("The Caos", 2017, 1000, false, 10, false, 10, 55);
        serie02.avaliar(0);

        //Calculando quanto tempo de filme e series tem p acervo.
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.incluir(filme01);
        calculadoraDeTempo.incluir(filme02);
        calculadoraDeTempo.incluir(filme03);
        calculadoraDeTempo.incluir(serie01);
        calculadoraDeTempo.incluir(filme02);
        System.out.printf(String.format("\nTempo em minutos %d de série/filme para assistir.\n", calculadoraDeTempo.getTempoTotal()));

        //Filtro Classsificação
        Episodios primeiro =  new Episodios();
        primeiro.setNumero(1);
        primeiro.setSerie(serie01);
        primeiro.setTotalVisualizacao(1000);

        Episodios segundo =  new Episodios();
        segundo.setNumero(2);
        segundo.setSerie(serie02);
        segundo.setTotalVisualizacao(10);

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtrar(primeiro);
        FiltroRecomendacao filtroRecomendacao2 = new FiltroRecomendacao();
        filtroRecomendacao2.filtrar(segundo);

        //Adcionando em uma list e imprimindo as informações usando polimorfismo toString() modificada.
        ArrayList<Titulos> titulos = new ArrayList<>();
        titulos.add(filme01);
        titulos.add(filme02);
        titulos.add(filme03);
        titulos.add(serie01);
        titulos.add(serie02);

        System.out.println(titulos.toString());
        System.out.println(titulos.get(2).toString());

        //Notas filmes - Alteração 23/06/2023
        ArrayList<Titulos> avaliacoes = new ArrayList<>();
        avaliacoes.add(filme01);
        avaliacoes.add(filme02);
        avaliacoes.add(filme03);
        avaliacoes.add(serie01);
        avaliacoes.add(serie02);

        for (Titulos item : avaliacoes) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            } else {
                Serie serie = (Serie) item;
                System.out.println(serie.getClassificacao());
            }
        }

        Collections.sort(titulos);
        System.out.println(titulos);

        //Implementando Map e HashMap.
        //26/06/2023
        Map<String, Titulos> titulosMap = new HashMap<>();
        for(Titulos titulo : titulos){
            titulosMap.put(titulo.getNome(), titulo);
        }

        System.out.println("\nHashMap " + titulosMap.get("Alibaba"));
    }
}
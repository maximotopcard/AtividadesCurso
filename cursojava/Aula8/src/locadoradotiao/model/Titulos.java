package locadoradotiao.model;

public class Titulos {
    private final String titulo;
    private final int ano;
    private final String genero;
    private final String duracao;

    public Titulos(TitulosRecord titulosRecord){
        this.titulo = titulosRecord.title();
        this.ano = Integer.parseInt(titulosRecord.year());
        this.genero = titulosRecord.gerne();
        this.duracao = titulosRecord.runtime();
    }
    @Override
    public String toString() {
        return "Titulos{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", Genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}

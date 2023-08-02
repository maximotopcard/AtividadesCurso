import br.com.topcard.spoticard.model.MinhasPreferidas;
import br.com.topcard.spoticard.model.Musica;
import br.com.topcard.spoticard.model.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Musica musica2 = new Musica();
        musica2.setTitulo("No Tec, Tec do meu HD");
        musica2.setAlbum("Luzinhas Coloridas");
        musica2.setArtista("Hardware dos Teclados");
        musica2.setGenero("ForAll");
        for(int x = 0; x < 1500; x++){
            musica2.reproduz();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.incluir(musica2);

        Podcast podcast = new Podcast();
        podcast.setTitulo("É nóis na Bios");
        podcast.setDescricao("Um PodCast...");
        podcast.setHost("podcasters.spotify.com");

        for(int x = 0; x < 50; x++){
            podcast.curte();
        }

        MinhasPreferidas minhasPreferidas2 = new MinhasPreferidas();
        minhasPreferidas2.incluir(podcast);


    }
}


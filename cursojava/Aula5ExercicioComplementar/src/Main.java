import Model.Livro;
import Model.Mouse;
import Model.Produto;
import Print.JoinStrings;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Mouse mouse01 = new Mouse();
        mouse01.setNome("Mouse");
        mouse01.setDescricao("Mouse ótico, Saída USB. 1.600 dpi, preto");
        mouse01.setTipo("Conexão USB");
        mouse01.setPreco(1.99f);

        Mouse mouse02 = new Mouse();
        mouse02.setNome("Mouse");
        mouse02.setDescricao("Mouse Bolinha, Saída PS2. 5.000.000 dpi, Branco encardido");
        mouse02.setTipo("Conexão PS2");
        mouse02.setPreco(199999.99f);

        Livro livro1 = new Livro();
        livro1.setNome("Brasil, conexão Alibaba");
        livro1.setDescricao("Um livro chato que te ensina a ser 'honesto' no Brasil.");
        livro1.setAutor("Segredo");
        livro1.setPreco(26.02f);

        JoinStrings juntar = new JoinStrings();
        juntar.imprimirTexto(mouse01);
        juntar.imprimirTexto(mouse02);
        juntar.imprimirTexto(livro1);

    }
}

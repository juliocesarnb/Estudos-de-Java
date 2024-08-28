package academy.devdojo.maratonajava.javacore.EblocoDeInicializacao.teste;

import academy.devdojo.maratonajava.javacore.EblocoDeInicializacao.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}

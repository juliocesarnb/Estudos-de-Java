package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;
import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("naruto", "tv", 12,"açao","tvj");
        anime.imprime();
    }
}

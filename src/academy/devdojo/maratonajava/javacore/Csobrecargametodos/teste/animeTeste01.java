package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;
import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class animeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Haikyuu!!", "TV", 16);
        anime.init("Haikyuu!!", "TV", 16, "Ação"); // Sobrecarga de métodos
        anime.setGenero("Ação");
        anime.imprime();
    }


}

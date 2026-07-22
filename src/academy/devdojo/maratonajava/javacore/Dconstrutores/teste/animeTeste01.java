package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;
import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class animeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu!!", "TV", 16,"Ação");
//        anime.init("Haikyuu!!", "TV", 16, "Ação");
        anime.imprime();
    }


}

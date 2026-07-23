package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1- Alocado espaço em memória pro objeto
    // 2- Cada atributo de classe é cirado e inicializado com valores default ou o quer for passada
    // 3- Bloco de inicializão é executado
    // 4- Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for(int episodios: this.episodios) {
            System.out.print(episodios + " ");
        }
    }

    public Anime(){
        episodios = new int[100];

        System.out.println();
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

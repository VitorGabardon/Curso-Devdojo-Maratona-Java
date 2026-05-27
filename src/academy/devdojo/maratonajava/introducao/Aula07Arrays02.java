package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        // caso as arrays fiquem vazias:
        // byte, int, float, long, short, double 0
        // char '\u0000 ''
        // boolean false
        // String null
        String [] nomes = new String[3];
        nomes[0] = "Mordecai";
        nomes[1] = "Rigby";
        nomes[2] = "Benson";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}

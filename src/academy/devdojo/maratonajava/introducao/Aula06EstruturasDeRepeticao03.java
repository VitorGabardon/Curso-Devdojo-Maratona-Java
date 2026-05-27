package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    static void main(String[] args) {
        // Imprima o número de 1 a 50, porpem pare o laço ao chegar ao 25

        int valorMax = 50;

        for (int i = 1; i <= valorMax; i++) {
            if(i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}

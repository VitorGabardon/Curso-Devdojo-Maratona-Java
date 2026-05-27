package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main(String[] args) {
        // imprimir todos os números pares de 0 até 1 milhão

        for (int count = 0;count <= 1000000;count++){
            if (count % 2 == 0) {
                System.out.println(count);
            }

        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5}; // Colocar os valores direto
        int[] numeros3 = new int[] {5, 4, 3, 2, 1}; // Outra forma de colocar os valores direto
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

 //       for (int i = 0; i < numeros3.length; i++) {
 //           System.out.println(numeros3[i]);
 //       }
        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}

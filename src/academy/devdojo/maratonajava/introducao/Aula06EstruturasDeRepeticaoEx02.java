package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEx02 {
    //Percorra os números de 1 até 100
    //Para cada número:
    //Se for divisível por 3, mostre "Fizz"
    //Se for divisível por 5, mostre "Buzz"
    //Se for divisível por 3 e 5 ao mesmo tempo, mostre "FizzBuzz"
    //Caso contrário, mostre o próprio número
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
           }else if (i % 3 == 0) {
                System.out.println("Fizz");
           } else if (i % 5 == 0) {
                System.out.println("Buzz");
           } else {
                System.out.println(i);
           }
        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEx01 {
    //Crie um programa em Java que:
    //
    //Use uma estrutura de repetição (for ou while)
    //Percorra os números de 1 até 100
    //Some apenas os números pares
    //No final, mostre o resultado da soma
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 2; i <= 100; i += 2) {
                soma += i;
        }
        System.out.println("A soma dos números pares é igual a: " + soma);
    }
}

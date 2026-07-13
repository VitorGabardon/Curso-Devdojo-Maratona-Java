package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    static void main() {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Chevrolet";
        carro1.modelo = "Ford";
        carro1.ano = 2019;

        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}

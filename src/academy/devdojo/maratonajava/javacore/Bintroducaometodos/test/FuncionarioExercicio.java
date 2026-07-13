package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Jeferson");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{1200.0, 1350.9, 1490.90});

        funcionario.imprimir();
        funcionario.mediaSalarios();
    }
}

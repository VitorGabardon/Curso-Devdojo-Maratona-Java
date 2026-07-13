package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios != null)
            for (double salario : salarios) {
                System.out.println("Salário: " + salario);
            }
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }
        System.out.println("--------------------------------------");
        for (double salario : salarios) {
            media += salario;
        }
            media /= salarios.length;
            System.out.println("Média Salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

}


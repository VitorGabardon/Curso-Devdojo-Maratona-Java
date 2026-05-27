package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        // Dado um determinado salário anual, o sistema quer saber o valor que o usuário
        // deve pagar de imposto

        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = 0;

        if (salarioAnual <= 34.712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34.712 && salarioAnual <= 68.507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else if (salarioAnual > 68.507) {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(valorImposto);
    }
}

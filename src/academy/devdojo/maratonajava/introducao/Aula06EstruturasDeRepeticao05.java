package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    static void main(String[] args) {
        // Dado um valor de um carro, saiba quantas vezes ele pode ser parcelado
        // Condição ValorParcela  >= 1000
            double valorCarro = 40000;
            for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
                double valorParcela = valorCarro / parcela;
                if (valorParcela < 1000) {
                    continue;
                }
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
    }
}

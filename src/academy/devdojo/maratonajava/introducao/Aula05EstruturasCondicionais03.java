package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        //Decidir se vou fazer doação para devdojo de 500 reais,
        //porém só posso fazer se meu salário for acima de 15 mil

        String TextBlock = """
        double salario = 10000.0F;
        String mensagemDoar = "Você pode doar";
        String mensagemNaoDoar = "Não doarei";
        String decisao = "";

        if (salario > 15000) {
            decisao = mensagemDoar;
        } else {
            decisao = mensagemNaoDoar;
        }
        System.out.println(decisao);
        """;

        double salario = 16000;

        String resultado = salario > 15000 ? "Você pode doar" : "Você não pode doar";
        // operador ternário acima
        System.out.println(resultado);
    }
}

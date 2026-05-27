package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 Categoria Infantil
        // idade >= 15 Categoria Juvenil
        // idade > 18 Categoria Adulta

        int idade = 18;
        String categoria = "";

        String TextBox = """

        if (idade < 15) {
            categoria = "Categoria Infatil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        """;

        categoria = idade < 15 ? "Categoria Infatil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulta";;
        // Operador ternário
        
        System.out.println(categoria);
    }
}

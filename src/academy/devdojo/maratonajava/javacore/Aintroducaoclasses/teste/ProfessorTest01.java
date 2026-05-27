package javacore.teste;

import javacore.dominio.Professor;

public class ProfessorTest01 {
    static void main() {
        Professor professor = new Professor();

        professor.nome = "Senhor Girafales";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " Idade:" + professor.idade + " Sexo:" + professor.sexo);
    }
}

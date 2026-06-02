package javacore.introducao.introducaoclasses.teste;

import javacore.introducao.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Cami";
        professor.idade = 87;
        professor.sexo = 'M';

        System.out.println("nome= " + professor.nome + " idade =" + professor.idade + " sexo =" + professor.sexo);
    }
}

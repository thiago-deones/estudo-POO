package javacore.Gassociassao.test;

import javacore.Gassociassao.dominio.Aluno;
import javacore.Gassociassao.dominio.Local;
import javacore.Gassociassao.dominio.Professor;
import javacore.Gassociassao.dominio.Seminario;

public class TestAssociacao {
    public static void main(String[] args) {
        Local local = new Local("Rua a");
        Aluno aluno = new Aluno("Luffy", 27);
        Professor professor = new Professor("barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        Seminario[] seminairoDisponiveis = {seminario};

        professor.setSeminarios(seminairoDisponiveis);

        professor.imprime();
    }
}

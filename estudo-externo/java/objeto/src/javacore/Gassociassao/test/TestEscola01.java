package javacore.Gassociassao.test;

import javacore.Gassociassao.dominio.Escola;
import javacore.Gassociassao.dominio.Professor;

public class TestEscola01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraia");
        Professor professor1 = new Professor("kakashi");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Aldeia", professores);

        escola.imprimi();

    }
}

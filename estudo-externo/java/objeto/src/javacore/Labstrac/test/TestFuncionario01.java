package javacore.Labstrac.test;

import javacore.Labstrac.dominio.Desenvolvedor;
import javacore.Labstrac.dominio.Funcionario;
import javacore.Labstrac.dominio.Gerente;

public class TestFuncionario01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Toya", 12000);
        System.out.println(gerente);
        System.out.println(dev );

    }
}

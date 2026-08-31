package javacore.Dintroducao.introducaometodos.test;

import javacore.Dintroducao.introducaometodos.dominio.Calculadora;

public class TestCalculadora03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int result = (int) calculadora.dividindoDoisNumeros(30,3);
        System.out.println(result);
    }
}

package javacore.introducao.introducaometodos.test;

import javacore.introducao.introducaometodos.dominio.Calculadora;

public class TestCalculadora01 {
    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    calculadora.somaDoisNumeros();
    System.out.println("finalizado");
    calculadora.subtrairDoisNumeros();
    }

}

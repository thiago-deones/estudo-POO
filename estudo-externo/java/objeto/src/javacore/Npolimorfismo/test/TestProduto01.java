package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TestProduto01 {
    public static void main(String[] args) {
        Computador computador = new Computador("fadfs", 11000);
        Tomate tomate = new Tomate("Andrei", 10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("_____________________________");
        CalculadoraImposto.calcularImposto(tomate);
    }
}

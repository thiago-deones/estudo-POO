package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;


public class TestProduto03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 10000);

        Tomate tomate= new Tomate("Longa Vida", 9);
        tomate.setDataValidade("24/11/26");

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(tomate);

    }
}

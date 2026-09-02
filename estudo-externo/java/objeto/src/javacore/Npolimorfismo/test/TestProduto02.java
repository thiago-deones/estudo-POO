package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class TestProduto02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 10000);
        Produto produto2 = new Tomate("Longa Vida", 9);
        Produto produto3 = new Televisao("Samsung", 3000);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(produto3);
    }
}

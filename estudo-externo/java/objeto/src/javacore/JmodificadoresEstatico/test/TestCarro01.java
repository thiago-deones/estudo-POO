package javacore.JmodificadoresEstatico.test;

import javacore.JmodificadoresEstatico.dominio.Carro;
import javacore.JmodificadoresEstatico.dominio.Ferrari;

public class TestCarro01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("m1");
        ferrari.imprimi();
    }
}

package javacore.introducao.introducaoclasses.teste;

import javacore.introducao.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ano = 2025;
        carro.nome = "Argo";
        carro.modelo = "FIAT";

        System.out.println("Modelo: " + carro.modelo + " Nome:" + carro.nome + " Ano:" + carro.ano);
    }
}

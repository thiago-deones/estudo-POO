package javacore.Gassociassao.test;

import javacore.Gassociassao.dominio.Jogador;

public class TestJogador01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Roamrio");
        Jogador jogador3 = new Jogador("Joao");
//        Jogador[] jogadores = new Jogador[3];
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }

        jogador1.imprimir();
    }
}

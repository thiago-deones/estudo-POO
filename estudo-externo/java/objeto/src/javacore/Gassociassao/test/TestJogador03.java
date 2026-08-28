package javacore.Gassociassao.test;

import javacore.Gassociassao.dominio.Jogador;
import javacore.Gassociassao.dominio.Time;

public class TestJogador03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador1 = new Jogador("Pele");
        Time time   = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador1};

        jogador.setTime(time);
        jogador1.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----------Jogador----------");
        jogador.imprimir();
        System.out.println("--------time-------");
        time.imprime();
    }
}

package javacore.Gassociassao.test;

import javacore.Gassociassao.dominio.Jogador;
import javacore.Gassociassao.dominio.Time;

public class TestJogador02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pele");
        Time time = new Time("Seleção brasileira");

        jogador1.setTime(time);
        jogador1.imprimir();
    }
}

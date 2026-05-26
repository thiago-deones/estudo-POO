public class Jogo {
    public static void main(String[] args) throws Exception {
        
        int num =0;

        Jogador.pontos();
        Jogador.pontos();
        Jogador.pontos();


        System.out.printf("%nAlerta:%s%n", Jogador.alerta ? "sim" : "nao");

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        j1.info();
        j2.info();
        j3.info();

    }
}

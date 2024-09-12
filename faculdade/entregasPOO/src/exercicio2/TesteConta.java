package exercicio2;

public class TesteConta {
    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco(181818, "Pedro", 1000);

        c1.depositar();

        c1.exibirSaldo();

        c1.sacar();

        c1.exibirSaldo();

    }

}

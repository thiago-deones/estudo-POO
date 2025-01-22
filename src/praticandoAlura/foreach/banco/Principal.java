package praticandoAlura.foreach.banco;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1234, 2000);
        ContaBancaria c2 = new ContaBancaria(2222, 3000);
        ContaBancaria c3 = new ContaBancaria(3333, 600);

        ArrayList<ContaBancaria> saldobanco = new ArrayList<>();

        saldobanco.add(c1);
        saldobanco.add(c2);
        saldobanco.add(c3);

        ContaBancaria identificador = saldobanco.get(0);

        for (ContaBancaria conta : saldobanco){
            if (identificador.getSaldo() < conta.getSaldo()) {
                identificador = conta;
            }
        }

        System.out.println("Conta com maior saldo é a conta " + identificador.getId());
    }
}

package Banco;

/**
 * implementando comentarios nas classes
 * @author thiago deones
 */
public class Principal {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 321);

        primeiraConta.deposita(200);
        try {
            primeiraConta.saca(210);
        } catch (SaldoInsuficienteException e) {
            System.out.println("O saldo é de " + e.getMessage());
        }

        System.out.println(primeiraConta.getSaldo());
    }
}

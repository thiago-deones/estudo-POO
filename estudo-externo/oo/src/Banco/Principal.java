package Banco;

public class Principal {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 321);

        primeiraConta.deposita(200);
        primeiraConta.saca(210);

        System.out.println(primeiraConta.getSaldo());
    }
}

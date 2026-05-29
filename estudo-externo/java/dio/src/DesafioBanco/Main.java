package DesafioBanco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPolpanca();

        cc.depositar(220);


        cc.imprimir();
        poupanca.imprimir();

        cc.transferir(200, poupanca);


        cc.imprimir();
        poupanca.imprimir();

    }

}

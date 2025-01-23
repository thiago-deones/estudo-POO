package Alura.src.praticandoAlura.banco;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito : R$" + valor);
        System.out.println("Saldo : R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Digite um valor valido");
        } else if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque : R$" + valor);
            System.out.println("Saldo : R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }


}

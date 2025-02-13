package Banco;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(int agencia) {
        if (agencia < 0) {
            System.out.println("Não é pérmitido numero negativo");
        return;
        }
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            System.out.println("Não é pérmitido numero negativo");
            return;
        }
        this.numero = numero;
    }

    public void saca(double valor) {

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
            this.saldo -= valor;


    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);

        destino.deposita(valor);

    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}

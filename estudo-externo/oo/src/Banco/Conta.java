package Banco;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

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

    public boolean saca(double valor) {
        if (valor < saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
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

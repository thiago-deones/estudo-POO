package Alura.src.praticandoAlura.foreach.banco;

public class ContaBancaria {
    private double id;
    private double saldo;

    public ContaBancaria(double id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public double getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }
}

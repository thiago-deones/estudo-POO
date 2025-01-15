package praticandoAlura.banco;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;



    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void getTarifaMensal() {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifa() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo de " + saldo);
    }
}

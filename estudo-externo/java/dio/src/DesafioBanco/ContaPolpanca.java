package DesafioBanco;

public class ContaPolpanca extends Conta {


    @Override
    public void imprimir() {
        System.out.println("==== Extrato conta corrente ====");
        super.imprimirInfosComuns();
    }
}

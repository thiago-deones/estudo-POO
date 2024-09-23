package exercicio2;

import java.util.Scanner;

public class ContaBanco {
    public int numero;
    public String nome;
    public double saldo;
    public double exibirSaldo;
    Scanner scanner = new Scanner(System.in);

    public ContaBanco(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(){
        System.out.printf("%nQuanto você deseja depositar:");
        double deposito = scanner.nextDouble();
        this.saldo += deposito;
    }

    public void sacar () {
        System.out.printf("%nQual o valor que deseja ser sacado?" );
        double saque = scanner.nextDouble();

        if(saque <= saldo && saque > 0){
            saldo-=saque;
        } else if(saque <= 0){
            System.out.printf("%nEntrada incorreta!");
        } else{
            System.out.printf("%nSaldo infuficiente!");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: %.2f%n", this.saldo);
    }


}

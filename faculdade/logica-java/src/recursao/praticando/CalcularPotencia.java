package recursao.praticando;

import java.util.Scanner;

public class CalcularPotencia {
    public static double potencia(int n, int pot){
        if(pot == 0){
            return n;
        }
        return n *potencia(n, pot-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a potencia");
        int numero = scanner.nextInt();
        System.out.println("Digite sua potencia");
        int elevado = scanner.nextInt();;

        System.out.println(potencia(numero,elevado));

    }
}

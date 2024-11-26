package pontoExtra;


//3. Implemente o cálculo da sequência de Collatz:
//
//        Dado um número n, se n for par, divida por 2; se for ímpar, multiplique por 3 e some 1.
//
//        Repita o processo até n chegar a 1.
//        Retorne o número de passos necessários para atingir 1.
//
//        Exemplo: Para n=6: 6→3→10→5→16→8→4→2→1

import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scanner.nextInt();

        System.out.print("Sequência de Collatz: ");
        collatz(n);
    }

    public static int collatz(int n) {
        System.out.print(n);

        if (n == 1) {
            return n;
        }

        System.out.print(" → ");

        if (n % 2 == 0) {
            return collatz(n / 2); // Caso par.
        } else {
            return collatz(n * 3 + 1); // Caso ímpar.
        }
    }
}

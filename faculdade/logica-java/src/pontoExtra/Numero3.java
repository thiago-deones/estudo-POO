package pontoExtra;

//3. Implemente o cálculo da sequência de Collatz:
//
//Dado um número n, se n for par, divida por 2; se for ímpar, multiplique por 3 e some 1.
//
//Repita o processo até n chegar a 1.
//Retorne o número de passos necessários para atingir 1.
//
//Exemplo: Para n=6: 6→3→10→5→16→8→4→2→1.


import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = scanner.nextInt();

        System.out.printf("%2d →", n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            if (n != 1) {
                System.out.printf("%2d → ", n);
            } else {
                System.out.print(n);
            }

            System.out.printf(collatz(n));
        }
    }

    public static int collatz(int n) {
        if (n == 1) {
            return 0;
        }


    }
}



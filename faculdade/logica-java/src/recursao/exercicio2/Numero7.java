package recursao.exercicio2;

//Implemente uma função recursiva para calcular o Máximo Divisor
//Comum (MDC) de dois números usando o algoritmo de Euclides.

import java.util.Scanner;

public class Numero7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int mdc = calcularMDC(num1, num2);

        System.out.printf("O Máximo Divisor Comum (MDC) de %d e %d é: %d%n", num1, num2, mdc);
    }

    // Função recursiva para calcular o MDC usando o algoritmo de Euclides
    public static int calcularMDC(int a, int b) {
        // Caso base: se o segundo número for 0, o MDC é o primeiro número
        if (b == 0) {
            return a;
        }

        // Chamada recursiva: calcula o MDC de b e o resto da divisão de a por b
        return calcularMDC(b, a % b);
    }
}

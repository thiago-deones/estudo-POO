package recursao.exercicio2;

import java.util.Scanner;

public class Numero9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int n = scanner.nextInt();

        // Chamando a função recursiva e imprimindo o resultado
        System.out.println("A soma de todos os números naturais de 1 a " + n + " é: " + somaNumerosNaturais(n));
    }

    // Função recursiva para calcular a soma de 1 a n
    public static int somaNumerosNaturais(int n) {
        if (n == 1) {
            return 1; // Caso base: se n for 1, retorna 1
        }
        return n + somaNumerosNaturais(n - 1); // Chamada recursiva somando n com o próximo número
    }
}

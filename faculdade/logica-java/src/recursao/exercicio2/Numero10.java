package recursao.exercicio2;

import java.util.Scanner;

public class Numero10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();

        // Chamando a função recursiva e imprimindo o resultado
        System.out.println("O número " + numeroDecimal + " em binário é: " + decimalParaBinario(numeroDecimal));
    }

    // Função recursiva para converter decimal em binário
    public static String decimalParaBinario(int n) {
        if (n == 0) {
            return "0"; // Caso base: se o número for 0, retorna "0"
        } else if (n == 1) {
            return "1"; // Caso base: se o número for 1, retorna "1"
        } else {
            return decimalParaBinario(n / 2) + (n % 2); // Chamada recursiva dividindo por 2 e concatenando o resto
        }
    }
}

package recursao.praticando;

import java.util.Scanner;

public class ContaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Verifica se o número é maior ou igual a zero
        if (numero < 0) {
            System.out.println("Número inválido. O número deve ser maior ou igual a zero.");
        } else {
            // Chama o metodo recursivo para contar os números pares
            int pares = contapares(numero);
            System.out.printf("A quantidade de números pares entre 0 e %d é: %d%n", numero, pares);
        }
    }

    public static int contapares(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        if(n % 2 ==0){
            return contapares(n-1) + 1;
        } else {
            return contapares(n - 1);
        }
    }
}

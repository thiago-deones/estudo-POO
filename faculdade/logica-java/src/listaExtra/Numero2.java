package listaExtra;

//Crie um programa que peça ao usuário para inserir 15 números inteiros.
//Armazene esses números em um vetor. Use um laço while para encontrar e
//imprimir o maior e o menor número do vetor.

import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Digite os numeros do vetor");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o numero que ocupa a posicao %d ", i + 1);
            arr[i] = scanner.nextInt();
        }

        int maior = arr[0];
        int menor = arr[0];

        int i = 1;
        while (i < arr.length) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
            if (arr[i] < menor) {
                menor = arr[i];
            }
            i++;
        }

        System.out.printf("menor numero = %d%n", menor);
        System.out.printf("maior numero = %d%n", maior);
    }
}

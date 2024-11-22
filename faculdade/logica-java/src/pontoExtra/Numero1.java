package pontoExtra;

//1. Dado um vetor v de tamanho n e uma matriz A de tamanho nxn, crie um programa para calcular o produto v*A, resultando em um novo vetor.


import java.util.Random;
import java.util.Scanner;

public class Numero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escreva o tamanho de n");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[][] matriz = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5)+1;
        }

        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d |", arr[i]);
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(5)+1;
            }
        }

        System.out.println("\nMatriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d |", matriz[i][j]);
            }
            System.out.println(" ");

        }

        int[] resultado = new int[n];

        System.out.println(" ");


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i] += arr[j] * matriz[j][i];
            }
        }

        System.out.printf("Resultado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d |", resultado[i]);
        }
    }
}

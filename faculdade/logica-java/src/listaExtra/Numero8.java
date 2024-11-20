package listaExtra;
//leia duas matrizes 3x3 e entregue a soma delas

import java.util.Scanner;

public class Numero8 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] resultado = new int[3][3];

        System.out.println("Escreva a primeira matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Escreva o valor que ocupa a linha " + i + 1 + " na posição " + j + 1 );
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Escreva a segundaa matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Escreva o valor que ocupa a linha " + i + 1 + " na posição " + j + 1 );
                arr2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                resultado[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%2d |", resultado[i][j]);
            }
            System.out.println(" ");
        }
    }
}

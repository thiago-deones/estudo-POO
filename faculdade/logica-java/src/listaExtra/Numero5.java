package listaExtra;

//crie uma matriz 5x5 com numeros aleatorios;

import java.util.Random;
import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d| ", arr[i][j]);
            }
            System.out.println("");
        }
    }
}

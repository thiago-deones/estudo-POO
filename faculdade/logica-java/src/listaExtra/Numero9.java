package listaExtra;

//matrix 4x4 com numeros aleatorios entre 0 e 50, e imprima o maior numero de cada linha


import java.util.Random;

public class Numero9 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(51);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d |", arr[i][j]);
            }
            System.out.println(" ");
        }

        for (int i = 0; i < arr.length; i++) {
            int maior = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > maior) {
                    maior = arr[i][j];
                }
            }
            System.out.println("maior numero da fileira " + (i + 1) + " " + maior);

        }
    }
}

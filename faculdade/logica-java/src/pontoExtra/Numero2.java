package pontoExtra;

//2. Dado um vetor de inteiros, remova os valores duplicados de forma que cada elemento apareça apenas uma vez. Retorne o vetor resultante ordenado.

import java.util.Random;

public class Numero2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d |", arr[i]);
        }

        ordenarVetor(arr);

        System.out.println("Vetor ordernado: ");

        for (int i = 0; i <arr.length; i++){
            System.out.print("| " + arr[i] + " ");
        }

        System.out.println("");

//        int[] resultado = new int[6];
//
//        vetorLimpo(resultado, 0);
//
//        System.out.println("");
//
//        for (int i = 0; i < resultado.length; i++) {
//            System.out.printf("%2d |", resultado[i]);
//        }

    }

    public static void ordenarVetor(int[] arr) {
        int aux;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static int vetorLimpo(int[] arr, int posicao) {
        if (posicao < arr.length) {
            return arr[posicao];
        }

        int[] resultado = new int[6];

        for (int i = 0; i < arr.length; i++){
            int igual = arr[i];
            for (int j = 1; j < arr.length; j++) {
                if (igual == arr[j]) {
                    resultado[i] = arr[j];
                } else {
                    resultado[i + 1] = arr[j];
                }
            }
        }

        return vetorLimpo(arr, posicao + 1);
    }
}

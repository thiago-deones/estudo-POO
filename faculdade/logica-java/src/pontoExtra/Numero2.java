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

        System.out.println("\nVetor ordernado: ");

        for (int i = 0; i <arr.length; i++){
            System.out.print("| " + arr[i] + " ");
        }

        System.out.println("");

        System.out.println("Vetor limpo");

        int[] resultado = vetorLimpo(arr);

        for (int value : resultado) {
            System.out.printf("%2d |", value);
        }

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

    public static int[] vetorLimpo(int[] arr) {
        int tamanho = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]){
                tamanho++;
            }
        }

        int[] resultado = new int[tamanho];
        resultado[0] = arr[0];

        int index = 1;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i - 1]) {
            resultado[index++] = arr[i];
        }
        }

        return resultado;
    }
}

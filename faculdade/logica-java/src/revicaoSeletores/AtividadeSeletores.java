package revicaoSeletores;

import java.util.Random;
import java.util.Scanner;

public class AtividadeSeletores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a semente: ");
        int semente = scanner.nextInt();

        System.out.println("Digite o tamanho do array:");
        int size = scanner.nextInt();

        Random random = new Random(semente);
        int[] arr = new int[size];

        // Geração do array aleatório
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("\nArray original desordenado:");
        for (int value : arr) {
            System.out.print(value + "| ");
        }
        System.out.println("\n");


        selectionSort(arr.clone());
        bubbleSort(arr.clone());
        insertionSort(arr.clone());
        mergeSort(arr.clone());
    }

    public static void selectionSort(int[] arr) {
        System.out.println("Selection Sort:");
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            int posicao = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[posicao] > arr[j]) {
                    posicao = j;
                }
            }
            int aux = arr[i];
            arr[i] = arr[posicao];
            arr[posicao] = aux;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        for (int value : arr) {
            System.out.print(value + "| ");
        }
        System.out.println("\nTempo de execução: " + duration + " nanosegundos\n");
    }

    public static void bubbleSort(int[] arr) {
        System.out.println("Bubble Sort:");
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        for (int value : arr) {
            System.out.print(value + "| ");
        }
        System.out.println("\nTempo de execução: " + duration + " nanosegundos\n");
    }

    public static void insertionSort(int[] arr) {
        System.out.println("Insertion Sort:");
        long startTime = System.nanoTime();

        for (int i = 1; i < arr.length; i++) {
            int aux = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > aux) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = aux;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        for (int value : arr) {
            System.out.print(value + "| ");
        }
        System.out.println("\nTempo de execução: " + duration + " nanosegundos\n");
    }

    public static void mergeSort(int[] arr) {
        System.out.println("Merge Sort:");
        long startTime = System.nanoTime();

        mergeSortRecursive(arr, 0, arr.length - 1);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        for (int value : arr) {
            System.out.print(value + "| ");
        }
        System.out.println("\nTempo de execução: " + duration + " nanosegundos\n");
    }

    private static void mergeSortRecursive(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSortRecursive(arr, left, middle);
            mergeSortRecursive(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

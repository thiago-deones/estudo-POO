package pontoExtra;

import java.util.Random;
import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o tamanho dos vetores:");
        int tamanho = scanner.nextInt();

        int[] arr1 = new int[tamanho];
        int[] arr2 = new int[tamanho];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10) + 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10) + 1;
        }

        ordenar(arr1);
        ordenar(arr2);

        System.out.println("Primeiro vetor:");
        exibirVetor(arr1);

        System.out.println("Segundo vetor:");
        exibirVetor(arr2);

        int[] resultado = interseccao(arr1, arr2);

        System.out.println("Elementos presentes em ambos os vetores:");
        if (resultado.length > 0) {
            exibirVetor(resultado);
        } else {
            System.out.println("Nenhum elemento em comum.");
        }
    }

    public static void ordenar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.printf("%2d |", valor);
        }
        System.out.println();
    }

    public static int[] interseccao(int[] vet1, int[] vet2) {
        int[] resultado = new int[0];

        for (int i = 0; i < vet1.length; i++) {
            for (int j = 0; j < vet2.length; j++) {
                if (vet1[i] == vet2[j] && !existeNoResultado(resultado, vet1[i])) {
                    resultado = adicionarElemento(resultado, vet1[i]);
                }
            }
        }

        return resultado;
    }

    public static boolean existeNoResultado(int[] resultado, int valor) {
        for (int elemento : resultado) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] adicionarElemento(int[] vetor, int novoElemento) {
        int[] novoVetor = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        novoVetor[vetor.length] = novoElemento;
        return novoVetor;
    }
}

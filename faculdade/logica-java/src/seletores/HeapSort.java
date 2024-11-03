package seletores;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 0, -1, 5, 9, 8, 10};

        System.out.println("Vetor desorganizado");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" |" + arr[i]);
        }

        System.out.println("");

        int n = arr.length;

        for (int i = (n / 2) - 1; i >= 0; i --) {
            aplicarHeap(arr, n, i);
        }

        System.out.println("Vetor quase organizado");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" |" + arr[i]);
        }

        for (int i = n -1; i > 0; i--) {
            int aux = arr[0];
            arr[0] = arr[i];
            arr[i] = aux;
        }
    }

    public static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if(esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }

        if (raiz != i) {
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            aplicarHeap(vetor, n, raiz);
        }
    }

}

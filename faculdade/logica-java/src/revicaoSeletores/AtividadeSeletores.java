package revicaoSeletores;

public class AtividadeSeletores {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 0, -1, 5, 9, 8, 10};

        selectionSort(arr);
        System.out.println("");
        bubbleSorte(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
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

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " |");
        }
    }

    public static void bubbleSorte(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " |");
        }
    }
}

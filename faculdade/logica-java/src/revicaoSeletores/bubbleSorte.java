package revicaoSeletores;

public class bubbleSorte {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 0, -1, 5, 9, 8, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        for (int i =0; i < arr.length; i++) {
            System.out.print(" |" + arr[i]);
        }
    }
}

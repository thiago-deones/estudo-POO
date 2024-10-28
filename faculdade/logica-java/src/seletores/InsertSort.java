package seletores;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 0, -1, 5, 9, 8, 10};


        for (int i = 1; i < arr.length; i++) {
            int aux = arr[i];
            for (int j = i - 1; j >= 0 && arr[j] > aux; j--) {
                arr[j + 1] = arr[j];
                arr[j] = aux;
            }
        }

        for (int i =0; i < arr.length; i++) {
            System.out.print(" |" + arr[i]);
        }
    }
}

package revicaoSeletores;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 0, -1, 5, 9, 8, 10};
        
        for (int i = 0; i < arr.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indiceMenor] > arr[j]) {
                    indiceMenor = j;
                }
            }
            int aux = arr[i];
            arr[i] = arr[indiceMenor];
            arr[indiceMenor] = aux;
        }

        for (int i =0; i < arr.length; i++) {
            System.out.print("| " + arr[i]);
        }
    }
}

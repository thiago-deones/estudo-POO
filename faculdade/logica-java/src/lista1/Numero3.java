package lista1;

public class Numero3 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        arr[0] = 2;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] / 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "| ");
        }
    }
}

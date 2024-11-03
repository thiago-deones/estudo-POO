package lista1;

public class Recursivo1 {
    public static int normal(int[] v){
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i] < 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int recursivo(int[] v, int posicao) {
        int contador = 0;
        if (posicao < 0) {
            return 0;
        }
        if (v[posicao] < 0) {
            contador++;
        }

        return contador + recursivo(v, posicao -1);
    }

    public static void main(String[] args) {
        int[] arr = {2, -3, -1, 1, 2, -4, 5};

        System.out.println(recursivo(arr, arr.length-1));
        System.out.println(normal(arr));
    }
}

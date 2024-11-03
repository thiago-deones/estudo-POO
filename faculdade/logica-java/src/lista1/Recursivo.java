package lista1;

public class Recursivo {

    public static int recursivoMenor(int[] v, int posicao){
        if(posicao < 0) {
            return 0;
        }
        int contador = (v[posicao] < 0) ? 1 : 0;


        return contador +recursivoMenor(v, posicao - 1);
    }

    public static int quantMenor(int[] v) {
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] arr = {2, -3, -1, 1, 2, -4, 5};

        System.out.println(quantMenor(arr));
        System.out.println(recursivoMenor(arr, arr.length-1));
    }
}

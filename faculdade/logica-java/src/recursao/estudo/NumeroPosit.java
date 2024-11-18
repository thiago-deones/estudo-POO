package recursao.estudo;

//Criar um algoritmo que verifica quanto numeros são positivos no array

public class NumeroPosit {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, -1 , -3, -1};

        System.out.println("A quantidade de números positivos no array é " + numerospositvo(arr,0));
    }

    private static int numerospositvo(int[] arr, int posicao) {
        if (posicao == arr.length) {
            return 0;
        }

        int count = 0;

        if (arr[posicao] > 0) {
            count++;
        }

        return count + numerospositvo(arr, posicao + 1);
    }
}

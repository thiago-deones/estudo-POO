package recursao.estudo;

//utilizando recursão faça um algoritmo que leia os valores do arry e verifique quantos negativos tem

public class NumeroNeg {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, -5};

        System.out.println(quantNegativo(arr, 0));
    }

    private static int quantNegativo(int[] arr, int posicao) {
        if (posicao == arr.length) {
            return 0;
        }

        int count = 0;
        if (arr[posicao] < 0) {
            count++;
        }

        return count + quantNegativo(arr, posicao + 1);
    }

}

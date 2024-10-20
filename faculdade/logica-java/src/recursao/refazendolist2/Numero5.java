package recursao.refazendolist2;

//Implemente uma função recursiva que calcule a soma de todos os
//elementos de um array.

public class Numero5 {
    public static int somaNum(int[] a, int posicao){
        if(posicao == a.length -1){
            return a[posicao];
        }

        return a[posicao] + somaNum(a, posicao + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4};

        System.out.println(somaNum(vetor, 0));
    }
}

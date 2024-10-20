package recursao.refazendolist2;

//Escreva uma função recursiva que encontre o maior elemento em um
//array de inteiros.

public class Numero4 {
    public static int maiorN(int[] a, int posicao){
        if(posicao == a.length - 1){
            return a[posicao];
        }

        int maiorNum = maiorN(a, posicao + 1);

        if(maiorNum < a[posicao]){
            return a[posicao];
        } else {
            return maiorNum;
        }
    }

    public static void main(String[] args){
        int[] vetor = {1, 10, 2, 20, 2};

        System.out.println(maiorN(vetor, 0));
    }
}

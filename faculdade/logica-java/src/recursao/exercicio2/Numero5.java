package recursao.exercicio2;

//Implemente uma função recursiva que calcule a soma de todos os
//elementos de um array.

public class Numero5 {
    public static void main(String[] args){

        int[] bloco = {1, 2, 3, 4};

        int somaTotal = somaArray(bloco, 0);
        System.out.printf("%nA soma de todos os vetores é igual a: %d", somaTotal);
    }

    public static int somaArray(int[] bloco, int posicao){
        if(posicao == bloco.length){
            return 0;
        }

        return bloco[posicao] + somaArray(bloco, posicao + 1);
    }
}

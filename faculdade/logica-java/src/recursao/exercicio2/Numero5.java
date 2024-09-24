package recursao.exercicio2;

//Implemente uma função recursiva que calcule a soma de todos os
//elementos de um array.

import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] bloco = new int[4];

        System.out.println("Digite um array de 4 números");
        for(int i = 0; i < bloco.length; i++){
            bloco[i] = scanner.nextInt();
        }

        for(int i = 0; i < bloco.length; i++){
            System.out.printf(" %d |", bloco[i]);
        }

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

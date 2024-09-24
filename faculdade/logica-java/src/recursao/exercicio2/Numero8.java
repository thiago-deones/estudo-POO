package recursao.exercicio2;

//Escreva uma função recursiva que conte o número de elementos pares em
//um array.

import java.util.Scanner;

public class Numero8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] bloco = new int[5];

        System.out.println("Escreva um array de 5 valores: ");
        for(int i = 0; i < bloco.length; i++){  // Corrigido o operador de comparação
            bloco[i] = scanner.nextInt();
        }

        for(int i = 0; i < bloco.length; i++){  // Corrigido o operador de comparação
            System.out.printf(" %d |", bloco[i]);
        }

        System.out.println();

        int totalPares = contarNumerosPares(bloco, 0);

        System.out.printf("Número total de elementos pares: %d%n", totalPares);
    }

    // Função recursiva para contar números pares
    public static int contarNumerosPares(int[] bloco, int posicao) {
        if(posicao == bloco.length) {
            return 0;  // Caso base: quando a posição for igual ao tamanho do array, parar
        }

        // Se o número na posição atual for par, soma 1 e continua a recursão
        if(bloco[posicao] % 2 == 0) {
            return 1 + contarNumerosPares(bloco, posicao + 1);
        }

        // Caso o número não seja par, apenas continua a recursão sem somar
        return contarNumerosPares(bloco, posicao + 1);
    }
}

package recursao.exercicio2;

//Escreva uma função recursiva que encontre o maior elemento em um
//array de inteiros.

import java.util.Scanner;

public class Numero4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[4];

        System.out.println("Digite um vetor com 4 numeros");
        for(int i = 0; i < 4; i++) {
            vetor[i] = scanner.nextInt();
        }

        for(int i = 0; i < 4; i++){
            System.out.printf(" %d |", vetor[i]);
        }

        int maior = maiorNumero(vetor, 0, vetor[0]);

        System.out.printf("%nO maior numeor no vetor é: %d%n", maior);
    }

    public static int maiorNumero(int[] vetor, int posicao, int maior){
        if(posicao == vetor.length){
            return maior;
        }

        if(vetor[posicao] > maior){
            maior = vetor[posicao];
        }

        return maiorNumero(vetor, posicao + 1, maior);
    }
}

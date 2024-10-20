package recursao.exercicio2;

//Escreva uma função recursiva que encontre o maior elemento em um
//array de inteiros.

public class Numero4 {
    public static int maiorN(int[] vetor, int posicao){
        if(posicao == vetor.length -1){
            return vetor[posicao];
        }
        int maiorRestante =  maiorN(vetor, posicao + 1);

        if(vetor[posicao] > maiorRestante){
            return vetor[posicao];
        } else {
            return maiorRestante;
        }
    }

    public static void main(String[] args){


        int[] vetor = {1, 3, 4};


        System.out.printf("%nO maior numero do vetor é %d", maiorN(vetor,0));
    }
}
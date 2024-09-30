package recursao.praticando.recursao;

import java.util.Scanner;

public class numero4 {
    public static int maiorN(int[] vetor, int posicao){
        if(posicao == vetor.length -1){
            return vetor[posicao];
        }
        return maiorN(vetor, posicao + 1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os numeros do vetor");
        for(int i=0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }


        System.out.printf("%nO maior numero do vetor é %d", maiorN(vetor,0));
    }
}

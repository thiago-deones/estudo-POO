package listaExtra;

//Solicite ao usuário para inserir 10 números inteiros. Armazene esses números
//em um vetor. Utilize um laço for para separar e imprimir os números pares e
//ímpares.

import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.printf("Escreva os numeros do vetor segundo sua posição\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("posição %d%n:", i +1);
            arr[i] = scanner.nextInt();
        }

        //Descobrindo a quantidade de numeros tem par e impar para adicionar ao indice
        int numPar = 0, numImpa = 0;
        for (int num : arr) {
            if(num % 2 == 0){
                numPar++;
            } else {
                numImpa++;
            }
        }

        //adicionando o tamanho do array segundo sua quantidade de numeros pares e impares
        int[] par = new int[numPar];
        int[] impar = new int[numImpa];

        int indexPar = 0, indexImpar=0;
        for (int num : arr) {
            if (num % 2 == 0){
                par[indexPar++] = num;
            } else {
                impar[indexImpar++] = num;
            }
        }

        // Imprimir os números pares
        System.out.print("Números pares: ");
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i] + " | ");
        }
        System.out.println(); // Quebra de linha

        // Imprimir os números ímpares
        System.out.print("Números ímpares: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.print(impar[i] + " | ");
        }


    }
}

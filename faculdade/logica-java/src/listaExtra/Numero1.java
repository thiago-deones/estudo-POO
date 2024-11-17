package listaExtra;

//Peça ao usuário para inserir a quantidade de números que ele deseja armazenar.
//        Em seguida, solicite os números e armazene-os em um vetor. Use um laço for
//para calcular e imprimir a média desses números


import java.util.Scanner;

public class Numero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de numeros que voce deseja acrescentar no array?");
        int tamanho = scanner.nextInt();

        int[] arr = new int[tamanho];

        System.out.println("Digite os numeros do seu array:\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Digite o numero na posição %d: ", i +1);
            arr[i] = scanner.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma =+ arr[i];
        }

        int media = soma/tamanho;

        System.out.printf("A media é igual a " + media + ".");

    }
}

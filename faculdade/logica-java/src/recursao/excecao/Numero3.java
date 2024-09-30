package recursao.excecao;

//Crie um programa que tente acessar um índice fora do limite de um array
//e trate a exceção.

import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] array = {1, 2, 3, 4, 5};

            System.out.print("Digite um índice para acessar o array: ");
            int indice = scanner.nextInt();

            int valor = acessarArray(array, indice);
            System.out.printf("Valor no índice %d: %d%n", indice, valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        } finally {
            scanner.close();
        }
    }


    public static int acessarArray(int[] array, int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fora dos limites do array.");
        }
        return array[indice];
    }
}

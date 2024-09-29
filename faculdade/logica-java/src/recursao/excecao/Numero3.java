package recursao.excecao;

//Crie um programa que tente acessar um índice fora do limite de um array
//e trate a exceção.

import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Cria um array de exemplo
            int[] array = {1, 2, 3, 4, 5};

            // Solicita ao usuário para digitar um índice
            System.out.print("Digite um índice para acessar o array: ");
            int indice = scanner.nextInt();

            // Tenta acessar o índice no array
            int valor = acessarArray(array, indice);
            System.out.printf("Valor no índice %d: %d%n", indice, valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Trata a exceção de acesso a um índice fora do limite do array
            System.out.println("Erro: Índice fora dos limites do array.");
        } finally {
            scanner.close();
        }
    }

    // Função que lança uma exceção se o índice for inválido
    public static int acessarArray(int[] array, int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fora dos limites do array.");
        }
        return array[indice];
    }
}

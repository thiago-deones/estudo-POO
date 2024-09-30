package recursao.praticando.excecao;
//Crie um programa que tente acessar um índice fora do limite de um array
//e trate a exceção.

import java.util.Scanner;

public class Numero3 {
    public static void acessarIndici(int[] array, int indice) throws ArrayIndexOutOfBoundsException {
        System.out.printf("Valor no índice %d: %d%n", indice, array[indice]);
    }

    public static void main(String[] args ){
        int[] numeros = {1, 2, 3, 4, 5};

        try {
            acessarIndici(numeros, 5);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Índice fora dos limites do array.");
        }
    }
}

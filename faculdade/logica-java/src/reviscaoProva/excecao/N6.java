package reviscaoProva.excecao;

//Crie um programa que tente dividir dois números e realizar operações
//com um array. Trate as múltiplas exceções usando try-catch

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int divisor = scanner.nextInt();

            double resultadoDivisao = dividir(dividendo, divisor);
            System.out.printf("Resultado da divisão: %.2f%n", resultadoDivisao);

            int[] array = {1, 2, 3, 4, 5};

            for (int i =0; i < array.length; i++){
                System.out.printf(array[i] + " ");
            }

            System.out.print("Digite um índice para acessar o array: ");
            int indice = scanner.nextInt();

            int valorArray = acessarIndice(array, indice);
            System.out.printf("Valor no índice %d: %d%n", indice, valorArray);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double dividir(int num1, int num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return (double) num1/num2;
    }

    public static int acessarIndice(int[] a, int indice) throws ArrayIndexOutOfBoundsException{
        if(indice < 0 || indice > a.length){
            throw new ArrayIndexOutOfBoundsException("Número fora do array");
        }
        return a[indice];
    }
}

package recursao.praticando.excecao;

//Crie uma função que calcula a raiz quadrada de um número, mas lance
//uma IllegalArgumentException se o número for negativo. A exceção deve ser
//capturada e tratada no metodo main.

import java.util.Scanner;

public class Numero5 {
    public static double raizQuadrar(double numero) throws IllegalArgumentException {
        if (numero < 0){
            throw new IllegalArgumentException("Número negativo: não é possivel calcular a raiz.");
        }
        double resultado;

        return resultado = (numero*numero);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número para calcular sua raiz quadrada");
            double resultado = scanner.nextDouble();

            System.out.println(raizQuadrar(resultado));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

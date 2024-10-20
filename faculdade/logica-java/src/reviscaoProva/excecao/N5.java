package reviscaoProva.excecao;

//Crie uma função que calcula a raiz quadrada de um número, mas lance
//uma IllegalArgumentException se o número for negativo. A exceção deve ser
//capturada e tratada no metodo main.

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número para calcular a raiz quadrada");
            int num = scanner.nextInt();

            if  (num > 0){
                throw new IllegalArgumentException("Numero negativo:não é permitido");
            }

            double resultado = num * num;
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Fim do programa");
        }
    }
}

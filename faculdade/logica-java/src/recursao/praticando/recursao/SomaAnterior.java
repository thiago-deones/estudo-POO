package recursao.praticando.recursao;

//Implemente um metodo recursivo que receba como entrada um número inteiro
//positivo N e retorne a soma de todos os numeros anteriores ate n

import java.util.Scanner;

public class SomaAnterior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um numero que tera a soma de todos os anteriores até o mesmo");
            int num = scanner.nextInt();

            if (num < 0){
                throw new positivoException("Número negativo");
            }
            int resultado = somaAteN(num);

            System.out.println(resultado);
        } catch (positivoException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
            scanner.close();
        }

    }

    public static int somaAteN(int n) {
        if(n == 1){
            return 1;
        }

        return n + somaAteN(n-1);
    }
}

class positivoException extends Exception{
    public positivoException(String mensagem){
        super(mensagem);
    }
}

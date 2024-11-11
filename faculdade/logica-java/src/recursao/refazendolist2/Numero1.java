package recursao.refazendolist2;

//Escreva uma função recursiva que retorne a soma dos dígitos de um
//número inteiro.

public class Numero1 {
    public static int somaDigito(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + somaDigito(n/10);
    }

    public static void main(String[] args){
        int num = 123;

        System.out.println(somaDigito(num));
    }

}

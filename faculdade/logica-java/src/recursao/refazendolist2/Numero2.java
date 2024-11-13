package recursao.refazendolist2;

//Escreva uma função recursiva que calcule a potência de um número, dado
//a base e o expoente.

public class Numero2 {
    public static int potencia(int base, int potencia){
        if(potencia == 1){
            return base;
        }

        return base * potencia(base, potencia-1);

    }
    public static void main(String[] args){
        int base = 2;
        int potencia = 4;

        System.out.println(potencia(base, potencia));
    }
}

package recursao.refazendolist2;

//Implemente uma função recursiva que inverta uma string.

public class Numero3 {
    public static String inveter(String palavra){
        if(palavra.isEmpty()) {
            return palavra;
        }

        return inveter(palavra.substring(1)) + palavra.charAt(0);
    }

    public static void main(String[] args) {
        String palavra = "casaa";

        System.out.println(inveter(palavra));
    }
}

package pilha;

public class FluxoComTratamento {
    public static void main(String[] args)  {
        System.out.printf("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        throw new ArithmeticException(" Deu erro");

//        System.out.println("Fim do metodo2");
    }
}

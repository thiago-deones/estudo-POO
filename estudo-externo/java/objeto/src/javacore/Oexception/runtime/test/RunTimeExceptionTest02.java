package javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento invalido não pode ser 0");
        }
        return a/b;
    }
}

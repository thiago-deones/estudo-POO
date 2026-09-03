package javacore.Oexception.runtime.test;

public class RunTImeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados");
            System.out.println("Fechando recurso liberado por sistema SP");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado por sistema SP");

        }
        return null;
    }
}

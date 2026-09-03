package javacore.Oexception.runtime.test;

public class RunTImeExceptionTest04 {
    public static void main(String[] args) {

        try {


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        } catch (Exception e) {
            System.out.println("Dentro do EXception");
        }
    }

}

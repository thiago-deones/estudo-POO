package javacore.Pwrapper.test;

public class TestWrapper01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'w';
        boolean booleanP = false;

        //autoBOXING
        Byte byteT = 1;
        Short shortT = 1;
        Integer intT = 1;
        Long longT = 10L;
        Float floatT = 10F;
        Double doubleT = 10D;
        Character charT = 'T';
        Boolean booleanT = false;

        int i = intT; //unboxing
    }
}

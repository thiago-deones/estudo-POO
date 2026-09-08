package javacore.Rcolecoes.test;

import javacore.Rcolecoes.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1abc", "iphone");
        SmartPhone s2 = new SmartPhone("1abc", "iphone");

        System.out.println(s1.equals(s2));
    }
}

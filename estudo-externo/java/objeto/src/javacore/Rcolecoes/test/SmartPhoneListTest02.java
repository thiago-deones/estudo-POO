package javacore.Rcolecoes.test;

import javacore.Rcolecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest02 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("11111", "iphone");
        SmartPhone s2 = new SmartPhone("22222", "Pixel");
        SmartPhone s3 = new SmartPhone("33333", "Samsung");
        List<SmartPhone> smartPhones = new ArrayList<>(6);

        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(s3);


        for (SmartPhone smartPhone : smartPhones) {
            System.out.println(smartPhone);
        }
        SmartPhone s4 = new SmartPhone("331333", "Samsung");

        System.out.println(smartPhones.contains(s4));
        int indexSmartphone4 = smartPhones.indexOf(s4);

        System.out.println(indexSmartphone4);
    }
}

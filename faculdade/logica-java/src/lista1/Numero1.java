package lista1;

import java.util.Scanner;

public class Numero1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, r1, r2;


        System.out.println("Digite A da equação");
        a = scanner.nextDouble();
        System.out.println("Digite B da equação");
        b = scanner.nextDouble();
        System.out.println("Digite C da equação");
        c = scanner.nextDouble();

        delta = (b*b)-(4*a*c);

        if(a==0 || delta <0){
            System.out.println("Impossivel calcular");
        } else {
            r1 = (-b + Math.sqrt(delta))/(2 * a);
            r2 = (-b - Math.sqrt(delta))/(2 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }


    }
}

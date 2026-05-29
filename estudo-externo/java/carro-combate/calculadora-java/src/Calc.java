import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equals("s") || opc.equals("S")) {
            System.out.printf("%nDigite o valor n1:", n1);
            n1.setValor(scanner.nextInt());
    
            System.out.printf("%nDigite o valor n2:", n2);
            n2.setValor(scanner.nextInt());
    
            res.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%n A soma dos valores %d com %d é igual a %d", n1.getValor(), n2.getValor(), res.getValor());
            System.out.printf("%nDeseha somar outro valor?");
            opc=scanner.next();
            System.out.printf("%n%n%n");
            }
        
        scanner.close();
    }
}

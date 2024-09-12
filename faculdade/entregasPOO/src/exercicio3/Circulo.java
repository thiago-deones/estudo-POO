package exercicio3;

public class Circulo {
    public double raio;


    public void area(){
        double area = 3.14 * (raio*raio);
        System.out.printf("%nA area do circulo é: %.2f", area);
    }

    public void perimetro(){
        double perimetro = (2*3.14*raio);
        System.out.printf("%nO perimetro do circulo é: %.2f", perimetro);

    }
}

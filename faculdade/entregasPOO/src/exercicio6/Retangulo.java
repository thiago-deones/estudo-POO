package exercicio6;

public class Retangulo {
    public double altura;
    public double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        return largura * altura;
    }

    public void exibir() {
        System.out.println("A area do retangulo é " + calcularArea() + " cm².");
    }
}

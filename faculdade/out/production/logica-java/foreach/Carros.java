package Alura.src.praticandoAlura.foreach;

public class Carros {
    private double valor;
    private String modelo;
    private String chassi;

    public Carros(double valor, String modelo, String chassi) {
        this.valor = valor;
        this.modelo = modelo;
        this.chassi = chassi;
    }

    public  void ligar() {
        System.out.println("o veiculo esta ligado");
        System.out.println("ligar faroes");
    }


}

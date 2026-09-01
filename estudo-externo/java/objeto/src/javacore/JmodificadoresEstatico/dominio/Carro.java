package javacore.JmodificadoresEstatico.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();


    public final void imprimi() {
        System.out.println("Carro: " + getNome());
    }
    public Carro() {
        double velocidadeLimite = Carro.VELOCIDADE_LIMITE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

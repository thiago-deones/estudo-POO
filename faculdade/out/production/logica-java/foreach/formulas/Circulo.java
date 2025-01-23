package Alura.src.praticandoAlura.foreach.formulas;

import Alura.src.praticandoAlura.foreach.supermecado.Main;

public class Circulo implements Forma{
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

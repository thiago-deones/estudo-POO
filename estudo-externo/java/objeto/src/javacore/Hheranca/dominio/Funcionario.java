package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

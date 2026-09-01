package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }
    {
        System.out.println("dentro do bloco inicialização funcionario");
    }
    {
        System.out.println("dentro do bloco inicialização  funcionario bloco 2");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario ");
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + getSalario());
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.getNome() + " Recebi o salario de " + getSalario());
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

package BancoHeranca;

public class Designer extends Funcionario {


    public Designer(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public double getBonificacao() {
        System.out.println("bonificação designer");
        return 200;
    }
}

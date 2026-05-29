package FuncionariosHeranca;

public class Designer extends Funcionario {


    public Designer(String nome, String cpf, double salario) {
    }

    public double getBonificacao() {
        System.out.println("bonificação designer");
        return 200;
    }
}

package BancoHeranca;

public class EditorVideo extends Funcionario {


    public EditorVideo(String nome, String cpf, double salario) {
    }

    public double getBonificacao() {
        System.out.println("bonificação editor");
        return 150;
    }
}

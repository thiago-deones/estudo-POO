package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class TestHeranca01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("1231");
        endereco.setRua("Rua a");
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("1218438129");
        pessoa.setEndereco(endereco);
        pessoa.setNome("Pedro");

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Omero");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2131.0);
        funcionario.imprime();
    }
}

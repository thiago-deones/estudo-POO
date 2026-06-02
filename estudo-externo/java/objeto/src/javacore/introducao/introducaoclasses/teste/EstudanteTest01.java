package javacore.introducao.introducaoclasses.teste;

import javacore.introducao.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade=18;
        estudante.sexo='M';
        estudante.nome="Luffy";

        System.out.println(estudante.nome);
    }
}

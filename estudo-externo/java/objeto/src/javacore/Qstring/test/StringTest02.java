package javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "        Luffy        ";
        String numeros = "01245";
        System.out.println(nome.charAt(2));// retorna a caracter q esta dentro
        System.out.println(nome.length());// retorna o tamanho a diferença deste para o length de array é q um é metodo() e o outro atributo
        System.out.println(nome.replace("f","l"));//trocar as letras
        System.out.println(nome.toLowerCase());//minusculo
        System.out.println(nome.toUpperCase());//maiusculo
        System.out.println(numeros.substring(0,2));
        System.out.println(nome.trim());// remoe valores em branco no inicio e no fim;
    }
}

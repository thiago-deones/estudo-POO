package recursao.praticando.Exception;

import java.util.Arrays;

public class Agenda {
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public boolean adicionarContato(Contato c){

        for(int i= 0; i<contatos.length; i++)

        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos){
            s += c.toString() + "\n";
        }
        return s;
    }
}



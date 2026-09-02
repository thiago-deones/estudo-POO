package javacore.Minterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{


    @Override
    public void load() {
        System.out.println("Carregando dados do bando de dados");
    }

    @Override
    public void remove() {
        System.out.println("removido");
    }
}

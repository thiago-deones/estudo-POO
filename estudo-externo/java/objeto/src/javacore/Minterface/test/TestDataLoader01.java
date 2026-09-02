package javacore.Minterface.test;

import javacore.Minterface.dominio.DataBaseLoader;
import javacore.Minterface.dominio.DataLoader;
import javacore.Minterface.dominio.FileLoader;

public class TestDataLoader01 {
    public static void main(String[] args) {
        DataBaseLoader databaseloader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseloader.load();
        fileLoader.load();
        databaseloader.remove();
        fileLoader.remove();
    }
}

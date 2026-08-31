package JavaIO;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Exercio1IOCaracter {
    public static void lerteclado() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File diretorio = new File("src/JavaIO/arquivos");

        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        File f = new File(diretorio, "recomendacoes.txt");


        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        do {
            bw.write(line);
            bw.newLine();
            line = scan.nextLine();
        } while (!line.equalsIgnoreCase("fim"));

        bw.flush();

        pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());

        pw.close();
        scan.close();
        bw.close();
    }

    static void main() throws IOException {
        lerteclado();
    }
}
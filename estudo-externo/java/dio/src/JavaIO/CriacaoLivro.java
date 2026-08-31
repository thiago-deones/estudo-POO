package JavaIO;

import java.io.*;

public class CriacaoLivro {
    public static void copiarArquivo() throws IOException {
        // 1. Arquivo de origem (com o caminho completo da pasta)
        File f = new File("src/JavaIO/arquivos/recomendacoes.txt");

        // 2. Leitor do arquivo original (BufferedReader + FileReader)
        BufferedReader br = new BufferedReader(new FileReader(f));

        // 3. Monta o nome e caminho do novo arquivo (-copy.txt na mesma pasta)
        String nomeOriginal = f.getName(); // "recomendacoes.txt"
        String nomeCopia = nomeOriginal.substring(0, nomeOriginal.indexOf(".")).concat("-copy.txt"); // "recomendacoes-copy.txt"

        // Mantém a cópia no mesmo diretório pai ("src/JavaIO/arquivos")
        File fcopy = new File(f.getParent(), nomeCopia);

        // 4. Escritor do arquivo de cópia (BufferedWriter + FileWriter)
        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy));

        // 5. Leitura e escrita linha por linha
        String line = br.readLine(); // Lê a primeira linha

        while (line != null) {
            bw.write(line);
            bw.newLine();
            line = br.readLine(); // Lê a próxima linha
        }

        bw.flush(); // Garante a gravação dos dados

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Tamanho: %d bytes%n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso em: %s%n", fcopy.getName(), fcopy.getPath());

        // 6. Fechar os fluxos abertos
        br.close();
        bw.close();
    }

    public static void adicionarInfo() {
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
package googleBooks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o livro que você deseja pesquisar");
        var tituloBusca = scan.nextLine();

        String chave= "Esperanado chave fornecida pelo google";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloBusca + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    }
}

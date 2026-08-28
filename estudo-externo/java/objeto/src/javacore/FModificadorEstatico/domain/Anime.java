package javacore.FModificadorEstatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*  0- Bloco de iniciaização é executdop quando a jvm é inicializada
        1- Alocado espaço em menória pro objeto
        2- Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
        3- Bloco de inicialização é executado
        4- Contrutor é executado
     */
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i<episodios.length; i++){
            episodios[i] = i + 1 ;
        }
    }
    static {
        System.out.println("Dentro do 2");
    }
    static {
        System.out.println("Dentro do 3");
    }
    {
        System.out.println("Nao estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int i = 0; i<episodios.length; i++){
            episodios[i] = i + 1 ;
        }
        for (int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

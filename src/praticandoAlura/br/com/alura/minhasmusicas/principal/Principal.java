package praticandoAlura.br.com.alura.minhasmusicas.principal;

import br.com.alura.screenmacth.modelos.Filme;
import praticandoAlura.br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import praticandoAlura.br.com.alura.minhasmusicas.modelos.Musica;
import praticandoAlura.br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("For ever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Bolha dev");
        meuPodcast.setApresentador("Thiago");

        for (int i = 0; i < 2000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}

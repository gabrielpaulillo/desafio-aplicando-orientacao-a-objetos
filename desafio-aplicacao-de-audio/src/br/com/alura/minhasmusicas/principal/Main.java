package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
//        Audio audio = new Audio();
//        audio.setTitulo("Happier than ever");
//        audio.setDuracao(298);
//        audio.curtir();
//        audio.reproduzir();

        Musica musica = new Musica();
        musica.setTitulo("Happier than ever");
        musica.setDuracao(298);
        musica.setArtista("Billie Eilish");
        musica.setCompositor("Billie Eilish");
        musica.setAlbum("Happier Than Ever");
        musica.setGenero("Rock - soul - pop funk");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 95; i++) {
            musica.curtir();
        }

        musica.exibirFichaTecnica();

        System.out.println();

        Podcast podcast = new Podcast();
        podcast.setTitulo("Ep. 981 - Conversa com o futuro candidado a prefeito Kim Kataguiri");
        podcast.setNome("Flow");
        podcast.setApresentadores("Igor3k e Professor HOC");
        podcast.setConvidados("Kim Kataguiri");
        podcast.setDuracao(189);
        podcast.setHorarioDeInicio("19h00min");

        for (int i = 0; i < 3003; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 257; i++) {
            podcast.curtir();
        }

        podcast.exibirInformacoes();

        System.out.println();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        System.out.println();
        preferidas.inclui(podcast);
    }
}
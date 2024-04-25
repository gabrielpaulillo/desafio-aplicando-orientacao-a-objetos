package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String artista;
    private String compositor;
    private String album;
    private String genero;


    public void exibirFichaTecnica() {
        System.out.println("Nome da música: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " segundos");
        System.out.println("Artista: " + this.artista);
        System.out.println("Compositor: " + this.compositor);
        System.out.println("Álbum: " + this.album);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Visualizações: " + getTotalDeReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (getTotalDeReproducoes() > 200) {
            return 10;
        } else {
            return 8;
        }
    }
}

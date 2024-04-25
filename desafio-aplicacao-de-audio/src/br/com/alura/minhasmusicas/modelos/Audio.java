package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}

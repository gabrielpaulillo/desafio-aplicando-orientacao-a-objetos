package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
//    classificacao eu não entendi se é o estilo música ou a avaliação da música

    public void curtir() {
        this.curtidas++;
        System.out.println("Você acabou de curtir!");
        System.out.println("Total de curtidas: " + this.curtidas + "\n");
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
        System.out.println("Você começou a reproduzir " + this.titulo);
        System.out.println("Total de " + totalDeReproducoes + " visualizações.\n");
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

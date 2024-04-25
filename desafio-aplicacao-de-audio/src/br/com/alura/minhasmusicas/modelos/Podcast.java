package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String nome;
    private String apresentadores;
    private String convidados;
    private String horarioDeInicio;

    public void exibirInformacoes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Podcast: " + this.nome);
        System.out.println("Apresentadores: " + this.apresentadores);
        System.out.println("Convidados: " + this.convidados);
        System.out.println("Horário de início: " + this.horarioDeInicio);
        System.out.println("Duração: " + getDuracao() + " minutos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApresentadores() {
        return apresentadores;
    }

    public void setApresentadores(String apresentadores) {
        this.apresentadores = apresentadores;
    }

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }

    public String getHorarioDeInicio() {
        return horarioDeInicio;
    }

    public void setHorarioDeInicio(String horarioDeInicio) {
        this.horarioDeInicio = horarioDeInicio;
    }
}

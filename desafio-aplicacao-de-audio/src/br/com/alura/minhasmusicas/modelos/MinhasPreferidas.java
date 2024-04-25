package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() == 10) {
            System.out.println(audio.getTitulo() + " é um sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " é muito bom! Vale a pena!");
        }
    }
}

package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class TopicoConcreto implements Topico{

    private String nome;
    private List<Leitor> leitores = new ArrayList<>();

    public TopicoConcreto(String nome){
        this.nome = nome;
    }

    @Override
    public void registrarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }

    @Override
    public void removerLeitor(Leitor leitor) {
        leitores.remove(leitor);
    }

    @Override
    public void notificarLeitores(String noticia) {
        for(Leitor leitor : leitores){
            leitor.update(nome, noticia);
        }
    }

    public void publicarNoticia(String noticia){
        System.out.println("Publicando noticia em " + nome + ": " + noticia);
        notificarLeitores(noticia);
    }
    
}

package Exercicio3;

public class LeitorConcreto implements Leitor {
    private String nome;
    
    public LeitorConcreto(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String topico, String noticia){
        System.out.println("Leitor:" + nome + "-- Nova noticia no topico " + topico + ": " + noticia);
    }
}

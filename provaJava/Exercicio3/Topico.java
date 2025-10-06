package Exercicio3;

public interface Topico {
    void registrarLeitor(Leitor leitor);
    void removerLeitor(Leitor leitor);
    void notificarLeitores(String noticia);
}

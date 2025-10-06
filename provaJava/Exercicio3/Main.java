package Exercicio3;

// O observer aqui foi escolhido pois permite que os leitores sejam notificados automaticamente quando
// uma noticia é publicada nos topicos que o leitor está registrado, assim nao precisando notificar
// manualmente cada um.

public class Main {
    public static void main(String[] args) {
        TopicoConcreto politica = new TopicoConcreto("Política");
        TopicoConcreto esportes = new TopicoConcreto("Esportes");
        TopicoConcreto tecnologia = new TopicoConcreto("Tecnologia");

        Leitor leitor1 = new LeitorConcreto("teste1");
        Leitor leitor2 = new LeitorConcreto("teste2");
        Leitor leitor3 = new LeitorConcreto("teste3");

        politica.registrarLeitor(leitor1);
        politica.registrarLeitor(leitor2);

        esportes.registrarLeitor(leitor2);
        esportes.registrarLeitor(leitor3);

        tecnologia.registrarLeitor(leitor1);
        tecnologia.registrarLeitor(leitor3);

        politica.publicarNoticia("TopicoPolitica");
        esportes.publicarNoticia("TopicoEsportes");
        tecnologia.publicarNoticia("TopicoTecnologia");
    }
}

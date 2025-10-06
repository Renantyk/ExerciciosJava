package Exercicio4;

//Aqui o decorator foi utilizado pois o problema pedia para adicionar uma funcionalidade de forma flexivel,
// sem mudar o codigo base, sendo assim, perfeito para o decorator, que consegue apenas adionar novas funcionalidades
// a classe base sem conseguir a modificar

public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioSimples();
        System.out.println(relatorio.gerar());

        System.out.println("\n Adicionando decorator \n");

        relatorio = new RelatorioEst(relatorio);
        System.out.println(relatorio.gerar());

        relatorio = new RelatorioPdf(relatorio);
        System.out.println(relatorio.gerar());
    }
    
}

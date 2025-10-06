package Exercicio5;

// Aqui foi utilizado o prototype, pois o metodo permite copiar objetos que ja existem, assim permitindo
// que seja rapidamente gerada a cópia que o exercicio exige

public class Main {
    public static void main(String[] args) {
        
        DocBase curriculo = new DocBase("Curriculo", "Branco", "Arial", "Logo");
        DocBase proposta = new DocBase("Proposta", "Branco", "Arial", "Logo");
        DocBase relatorio = new DocBase("Relatorio", "Branco", "Arial", "Logo");

        //curriculo.exibirInfo();
        //proposta.exibirInfo();
        //relatorio.exibirInfo();

        DocBase curriculoTeste = (DocBase) curriculo.clone();
        curriculoTeste.setCor("Teste cor");
        curriculoTeste.setFonte("Teste fonte");

        curriculoTeste.exibirInfo();
    }
}

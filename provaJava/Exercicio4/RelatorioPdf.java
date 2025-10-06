package Exercicio4;

public class RelatorioPdf extends RelatorioDecorator{
    
    public RelatorioPdf(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public String gerar(){
        return relatorio.gerar() + " PDF adicionado";
    }
}

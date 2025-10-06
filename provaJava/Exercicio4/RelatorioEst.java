package Exercicio4;

public class RelatorioEst extends RelatorioDecorator{
    
    public RelatorioEst(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public String gerar(){
        return relatorio.gerar() + " Estatisticas adicionadas";
    }

}

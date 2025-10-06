package Exercicio4;

public abstract class RelatorioDecorator implements Relatorio{
    
    protected Relatorio relatorio;

    public RelatorioDecorator(Relatorio relatorio){
        this.relatorio = relatorio;
    }

    @Override
    public String gerar(){
        return relatorio.gerar();
    }

}

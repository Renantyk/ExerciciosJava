package Exercicio2;

public class PagamentoPixCriar implements PagamentoCriar{

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }
    
}

package Exercicio2;

public class PagamentoCartaoCriar implements PagamentoCriar {

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartao();
    }
    
}

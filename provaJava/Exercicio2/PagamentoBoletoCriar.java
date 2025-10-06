package Exercicio2;

public class PagamentoBoletoCriar implements PagamentoCriar{

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBoleto();
    }
    
}

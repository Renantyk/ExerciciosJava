package Exercicio2;

public class PagamentoCartao implements Pagamento {

    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " no cartao");
    }
    
}

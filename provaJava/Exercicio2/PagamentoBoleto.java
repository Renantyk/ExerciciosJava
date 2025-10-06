package Exercicio2;

public class PagamentoBoleto implements Pagamento{
    
    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " no boleto");
    }
}

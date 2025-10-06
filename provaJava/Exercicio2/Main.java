package Exercicio2;

// Nesse exercicio também foi utilizado o factory method, ja que, a intenção era instanciar dinamicamente
// o processador correspondente, assim, o main nao precisa conhecer os detalhes de criação de cada tipo
// de pagamento. Também ficando mais facil caso precise criar outros tipos de pagamento futuramente.

public class Main {
    public static void main(String[] args) {
        
        String tipo = "CARTAO";
        Pagamento pagamento = null;

        switch(tipo.toUpperCase()){
            case "CARTAO":
                PagamentoCriar cartaoFactory = new PagamentoCartaoCriar();
                pagamento = cartaoFactory.criarPagamento();
                break;
            case "BOLETO":
                PagamentoCriar boletoFactory = new PagamentoBoletoCriar();
                pagamento = boletoFactory.criarPagamento();
                break;
            case "PIX":
                PagamentoCriar pixFactory = new PagamentoPixCriar();
                pagamento = pixFactory.criarPagamento();
                break;
            default:
                System.out.println("Tipo invalido");

        }

        pagamento.pagamento(250);
    }
}

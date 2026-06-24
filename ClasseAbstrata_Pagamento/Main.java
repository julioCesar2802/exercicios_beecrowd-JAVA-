package Pagamento;

public class Main {
    public static void main(String[] args){



     MetodoPagamento boleto = new PagamentoBoleto(200.00);
     MetodoPagamento cartao = new PagamentoCartao(500.00,10);

     boleto.exibirComprovante();
     cartao.exibirComprovante();

     System.out.println("=== COMPROVANTE DE PAGAMENTO (CARTÃO) ===");
     System.out.println(boleto.exibirComprovante());

     System.out.println("=== COMPROVANTE DE PAGAMENTO (BOLETO) ===");

     System.out.println(cartao.exibirComprovante());

    }
}

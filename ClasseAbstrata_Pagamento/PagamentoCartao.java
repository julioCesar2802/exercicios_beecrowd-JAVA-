package Pagamento;

public class PagamentoCartao extends MetodoPagamento {
    protected double taxa;

    public PagamentoCartao(double valor,double taxa) {
        super(valor);
        this.taxa = taxa;
    }

    @Override
    public double calcularTaxa() {
        return  valor * (taxa/100);
    }


}

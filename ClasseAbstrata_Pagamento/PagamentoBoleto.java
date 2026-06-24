package Pagamento;

public class PagamentoBoleto extends MetodoPagamento{


    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return  1.50;
    }


}

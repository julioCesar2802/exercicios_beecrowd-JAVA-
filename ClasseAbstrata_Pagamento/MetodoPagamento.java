package Pagamento;

public abstract class MetodoPagamento {
    protected double valor;
    protected int taxa;

    public MetodoPagamento(double valor){
        this.valor = valor;
        this.taxa = taxa;
    }

    public abstract double calcularTaxa();

    public String exibirComprovante(){
        return "Valor Original = R$ " + valor +
                "\nTaxa Aplicada = R$ " + calcularTaxa() +
                "\nValor Total a ser pago = R$ " + (valor + calcularTaxa()) + "\n";
    }

}

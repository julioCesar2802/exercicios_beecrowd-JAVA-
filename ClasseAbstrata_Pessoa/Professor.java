package ClasseAbstratic;

public class Professor extends Pessoa {
    protected String siape;
    protected String areaAtuacao;

    public Professor(String nome, String cpf, String siape, String areaAtuacao) {
        super(nome, cpf);
        this.siape = siape;
        this.areaAtuacao = areaAtuacao;

    }

    @Override
    public String exibirDados() {
        return "nome = " + nome + ", " + "cpf = " + cpf + ", " + "siape = "
                + siape + ","  + "areaAtuacao = " + areaAtuacao;

    }
}

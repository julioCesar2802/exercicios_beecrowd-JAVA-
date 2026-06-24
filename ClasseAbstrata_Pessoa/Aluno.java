package ClasseAbstratic;

public class Aluno extends Pessoa{
    protected String matricula;
    protected String curso;


    public Aluno(String nome, String cpf,String matricula , String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String exibirDados() {
        return "nome = " + nome + ", " + "cpf = " + cpf + ", " + "matricula = " + matricula
                + ", " + "Curso = " + curso;
    }


}

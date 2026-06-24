package ClasseAbstratic;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args){
        ArrayList<Pessoa> individuos = new ArrayList<>();

        individuos.add(new Aluno("Julinho","707.115.244-67","20252014040019","TADS"));
        individuos.add(new Aluno("Ricardo","808.512.660-85","20252014040023","TADS"));
        individuos.add(new Professor("Jorgiano","662.255.112-34","20252014040050","Professor de Algoritmo"));
        individuos.add(new Professor("Lucena","404.112.231-11","20252014040050","Professor de POO"));

        for (Pessoa p : individuos){
            p.exibirDados();
            System.out.println(p.exibirDados());
           }
    }
}

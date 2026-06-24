import java.util.ArrayList;
import java.util.Scanner;

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "[nome=" + nome +
                ", salarioFinal=" + salarioBase + "]";
    }
}
     class Assalariado extends Funcionario{

        public Assalariado (String nome,double salarioBase) {
            super(nome, salarioBase);
        }

        @Override
        public double calcularSalario(){
            return this.salarioBase;

            }
         @Override
         public String toString() {
             return "[nome=" + nome +
                     ", salarioFinal=" + salarioBase + "]";
         }

    }

     class Comissionado extends Funcionario{
            private double vendas;

            public Comissionado (String nome,double salarioBase,double vendas){
                super(nome,salarioBase);
                this.vendas = vendas;
            }
            @Override
            public double calcularSalario(){
                return this.salarioBase + (this.vendas * 0.10);
            }

         @Override
         public String toString() {
             return "[nome=" + nome +
                     ", salarioFinal=" + (calcularSalario()) +  "]";
         }
        }

    public class Main{
        public static void main (String[] args){
            ArrayList<Funcionario> lista = new ArrayList<>();

            lista.add(new Assalariado("Ana",1500.00));
            lista.add(new Assalariado("Bruno",2500.00));
            lista.add(new Comissionado("Carla",2100.00,20000.00));
            int maior = 0;
            for (Funcionario funcionarios : lista){
                funcionarios.calcularSalario();
                System.out.println(funcionarios);

            }


        }
    }
import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    private String descricao;
    private int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + " | Prioridade: " + prioridade;
    }
}

public class AgendaTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> agenda = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== AGENDA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Exibir todas as tarefas");
            System.out.println("3 - Remover tarefa pela descrição");
            System.out.println("4 - Exibir tarefa de maior prioridade");
            System.out.println("5 - Contar tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String descricao = sc.nextLine();

                    System.out.print("Prioridade (1 a 5): ");
                    int prioridade = sc.nextInt();
                    sc.nextLine();

                    agenda.add(new Tarefa(descricao, prioridade));
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    if (agenda.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\nLista de tarefas:");
                        for (Tarefa t : agenda) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite a descrição da tarefa a remover: ");
                    String descRemover = sc.nextLine();

                    boolean removida = false;

                    for (int i = 0; i < agenda.size(); i++) {
                        if (agenda.get(i).getDescricao().equalsIgnoreCase(descRemover)) {
                            agenda.remove(i);
                            removida = true;
                            break;
                        }
                    }

                    if (removida) {
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 4:
                    if (agenda.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        Tarefa maior = agenda.get(0);

                        for (Tarefa t : agenda) {
                            if (t.getPrioridade() > maior.getPrioridade()) {
                                maior = t;
                            }
                        }

                        System.out.println("Tarefa de maior prioridade:");
                        System.out.println(maior);
                    }
                    break;

                case 5:
                    System.out.println("Quantidade de tarefas: " + agenda.size());
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
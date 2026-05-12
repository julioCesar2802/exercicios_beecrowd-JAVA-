import java.util.Scanner;
class Lanche {
    private int codigo;
    private int quantidade;

    public Lanche(int codigo, int quantidade){
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public double total() {
        switch (codigo) {
            case 1:
                return 4 * quantidade;

            case 2:
                return 4.50 * quantidade;

            case 3:
                return 5 * quantidade;

            case 4:
                return 2 * quantidade;

            case 5:
                return 1.50 * quantidade;

            default:
                return 0.0;
        }

    }
    @Override
    public String toString(){
        double preçototal = total();
        return String.format("Total: R$ %.2f",preçototal);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        Lanche lanche = new Lanche(codigo,quantidade);
        System.out.println(lanche);

    }
}
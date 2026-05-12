import java.util.Scanner;

class Led {
    private int teste;
    private Scanner leitor;

    public Led(int teste,Scanner leitor) {
        this.teste = teste;
        this.leitor = leitor;
    }

    public void total() {

        for (int i = 1; i <= teste; i++) {
            int somar = 0;

            String numero = leitor.next();

            int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

            for (int j = 0; j < numero.length(); j++) {
                char c = numero.charAt(j);
                int numerolido = c - '0';
                somar += leds[numerolido];
            }
            System.out.println(somar + " leds");
        }

    }
    }
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int teste = scanner.nextInt();


            Led led = new Led(teste, scanner);
            led.total();

        }
    }


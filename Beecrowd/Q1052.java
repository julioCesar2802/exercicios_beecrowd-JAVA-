/* 
Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta 
o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);


        int a = leitor.nextInt();

        if (a == 1) {
            System.out.println("January");
        } else if (a == 2) {
            System.out.println("February");
        } else if (a == 3) {
            System.out.println("March");
        } else if (a == 4) {
            System.out.println("April");
        } else if (a == 5) {
            System.out.println("May");
        } else if (a == 6) {
            System.out.println("June");
        } else if (a == 7) {
            System.out.println("July");
        } else if (a == 8) {
            System.out.println("August");
        } else if (a == 9) {
            System.out.println("September");
        } else if (a == 10) {
            System.out.println("October");
        } else if (a == 11) {
            System.out.println("November");
        } else if (a == 12) {
            System.out.println("December");
        }

        {

        }

        leitor.close();
    }
}
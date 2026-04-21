/* 
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
Utilize a fórmula:
MaiorAB = (a + b + abs(a - b)) / 2


Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para 
chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int d = ((a + b + Math.abs(a - b)) / 2);
        int e = ((d + c + Math.abs(d - c)) / 2);
        System.out.println(e + " eh o maior");



        leitor.close();
    }
}
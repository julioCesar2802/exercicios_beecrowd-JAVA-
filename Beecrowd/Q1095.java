/* 
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //
        for (int i = 1, j = 60; j >= 0; i += 3, j -= 5) {
            System.out.println("I=" + i + " J=" + j);
        }

        leitor.close();
    }
}
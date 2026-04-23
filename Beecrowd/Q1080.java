/* 
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);



        int posi = 0;
        int maior = 0;

        for(int i = 1; i < 101;i++){
            int a = leitor.nextInt();
            if (a > maior){
                maior = a;
                posi = i;
            }

        }
        System.out.println(maior);
        System.out.println(posi);




        leitor.close();

    }
}

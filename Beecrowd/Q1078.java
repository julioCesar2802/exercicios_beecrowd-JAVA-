/* 
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, conforme o exemplo fornecido.
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);


        int n = leitor.nextInt();
        for (int i = 1;i < 11;i++){
            int resultado = i * n;
            System.out.println(i + " x "+ n +" = "+ resultado );
        }







        leitor.close();
    }
}
package ATV13_SomaTermos;

import java.util.Scanner;

public class Somatoria {
    public static void main(String[] args) {

        int n;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor de n?: ");
        n = scanner.nextInt();

        //Primeira soluçao
        int i = 1;
        while(i <= n){
            soma += i;
            i++;
        }
        System.out.println("A soma é: " + soma);

        System.out.println();

        //Segunda solução (soma PA)
        soma = ((1 + n) * n) / 2;
        System.out.println("A soma com PA é: " + soma);
    }
}
package ATV10_FaixaDeValores;

import java.util.Random;

public class Valores {

    public static void main(String[] args){
        int []v = gerarVetor(100);

        int []contador = new int[10];

        for(int i = 0; i < v.length; i++)
            contador[v[i] / 10]++;

        for(int i = 0; i < 10; i++)
            System.out.printf("[%d - %d] = %d \n", i * 10, i * 10 + 9, contador[i]);
    }

    private static int[] gerarVetor(int n){
        int []v = new int[n];

        Random gerador = new Random();

        for(int i = 0; i < n; i++)
            v[i] = gerador.nextInt(100);
        return v;
    }
}

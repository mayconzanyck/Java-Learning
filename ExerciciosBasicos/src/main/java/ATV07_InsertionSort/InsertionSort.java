package ATV07_InsertionSort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args){

        int []v = gerarVetor(22);

        System.out.println("Antes do InsertionSort: " + Arrays.toString(v));

        insertionSort(v);

        System.out.println("Depois do InsertionSort: " + Arrays.toString(v));
    }

    public static int[] gerarVetor(int n){

        int []v = new int[n];
        Random gerador = new Random();

        for(int i = 0; i < n; i++){
            v[i] = gerador.nextInt(100);
        }
        return v;
    }

    private static void insertionSort(int[] v){
        int x, j;

        for(int i = 1; i < v.length; i++){
            x = v[i];
            j = i - 1;

            while((j >= 0) && v[j] > x){
                v[j+1] = v[j];
                j = j - 1;
            }
            v[j+1] = x;
        }
    }
}
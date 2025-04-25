package ATV04_SelectionSort;

//Atividade para organizar numeros do menor para o maior

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args){

        int[] v = gerarVetor(10);
        System.out.println("Antes: " + Arrays.toString(v));
        selectionSort(v);
        System.out.println("Depois: " + Arrays.toString(v));
    }

    private static void selectionSort(int[] v){
        for(int i = 0; i < v.length; i++){
            int menor = i;
            for(int j = i + 1; j < v.length; j++){
                if(v[j] < v[menor]){
                    menor = j;
                }
            }
            trocar(v, i, menor);
        }
    }

    private static void trocar(int[] v, int i, int j){
        int auxiliar = v[i];
        v[i] = v[j];
        v[j] = auxiliar;
    }

    public static int[] gerarVetor(int n){
        int[] v = new int[n];
        Random gerador = new Random();
        for(int i = 0; i < n; i++){
            v[i] = gerador.nextInt(100);
        }
        return v;
    }
}
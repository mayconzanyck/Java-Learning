package ATV15_DeslocarVetor;

import java.util.Arrays;

public class DeslocarElementoVetor {
    public static void main(String[] args) {

        int []v = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Array padrao: " + Arrays.toString(v));

        deslocar(v, 3);

        System.out.println("Array após inversao: " + Arrays.toString(v));
    }

    private static void deslocar(int[] v, int k) {
        int n = v.length;

        inverter(v, 0, n-1-k);
        inverter(v, n-k, n-1);
        inverter(v, 0, n-1);
    }

    private static void inverter(int[] v, int i, int f) {
        while(i < f){
            trocar(v, i, f);
            i++; f--;
        }
    }

    private static void trocar(int[] v, int i, int f){
        int aux = v[i];
        v[i] = v[f];
        v[f] = aux;
    }
}

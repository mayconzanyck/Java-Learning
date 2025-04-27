package ATV08_BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] v = {55, 35, 45, 70, 22, 10, 2, 14, 28, 89};
        bolha(v);
        System.out.println("\nResultado final: " + Arrays.toString(v));
    }

    private static void bolha(int[] v) {

        System.out.println("Iniciando o BubbleSort...");
        for (int ultimo = v.length - 1; ultimo > 0; ultimo--) {
            System.out.println("\nIteração " + (v.length - ultimo) + ": " + Arrays.toString(v));
            for (int i = 0; i < ultimo; i++) {
                if (v[i] > v[i + 1]) {
                    trocar(v, i, i + 1);
                }
            }
        }
    }

    private static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}

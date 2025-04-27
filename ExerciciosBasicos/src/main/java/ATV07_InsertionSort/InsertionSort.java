package ATV07_InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){

        int []v = {8, 2, 4, 9, 3, 6};

        System.out.println("Antes do InsertionSort: " + Arrays.toString(v));

        insertionSort(v);

        System.out.println("Depois do InsertionSort: " + Arrays.toString(v));
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
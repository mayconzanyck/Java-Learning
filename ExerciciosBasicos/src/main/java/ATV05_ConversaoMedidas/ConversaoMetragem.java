package ATV05_ConversaoMedidas;

import java.util.Scanner;

public class ConversaoMetragem{
    //criar um programa para converter metros para km, e metros para milimetros.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double metro, km, mm;

        System.out.print("Informe o valor em metros para a conversão: ");
        metro = scanner.nextDouble();

        km = metro / 1000;
        mm = metro * 1000;

        System.out.println();

        System.out.println("Conversão de " + metro + " metros para kilometros: " + km + "km.");
        System.out.println("Conversão de " + metro + " metros para milimetros: " + mm + "mm.");


        scanner.close();
    }
}

package ATV06_AreaCirculo;

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Calculo da area do circulo, onde area = 2 * pi * R

        double area, raio;

        System.out.println("Insira o valor do Raio: ");

        raio = scanner.nextDouble();
        area = 2 * Math.PI * raio;

        System.out.printf("A área é: %.4f\n", area);


        scanner.close();
    }
}

package ATV11_DistanciaPontos;

import java.util.Scanner;

public class DistaciaPontos {
    public static void main(String[] args) {
        double  x1, y1, x2, y2;
        double distancia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        x1 = scanner.nextDouble();
        System.out.println("Digite o valor de y1: ");
        y1 = scanner.nextDouble();
        System.out.println("Digite o valor de x2: ");
        x2 = scanner.nextDouble();
        System.out.println("Digite o valor de y2: ");
        y2 = scanner.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distancia: " + distancia);

        scanner.close();
    }
}

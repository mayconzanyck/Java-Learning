package ATV16_CelsiusPFahrenheit;

import java.util.Scanner;

public class CelsiusFahrenheit {

    static double conversaoCelsiusFahrenheit(double C){

        return 9 * C / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero em celsius: ");
        double celsius = scanner.nextInt();

        System.out.println("O numero convertido em fahrenheit é: " + conversaoCelsiusFahrenheit(celsius));
    }
}

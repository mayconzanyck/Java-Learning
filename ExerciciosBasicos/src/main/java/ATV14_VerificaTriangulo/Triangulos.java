package ATV14_VerificaTriangulo;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Insira a primeira medida: ");
        a = scanner.nextDouble();
        System.out.println("Insira a segunda medida: ");
        b = scanner.nextDouble();
        System.out.println("Insira a terceira medida: ");
        c = scanner.nextDouble();

        if(a < (b + c) && b < (a + c) && c < (a + b)){
            //garante que forma triangulo

            if(a == b && b == c){
                System.out.println("Triangulo equilatero");
            }
            else if(a == b || b == c || a ==c){
                System.out.println("Triangulo isosceles");
            }
            else{
                System.out.println("Triangulo escaleno");
            }

        }
        else{
            System.out.println("As medidas nao formam um triangulo.");
        }
    }
}

package ATV02_Triangulos;

import java.util.Scanner;

public class TiposTriangulos {

    public static void main(String[] args){

        //Declaração de variaveis
        double a, b, c;
        double auxiliar, a2, bc;
        Scanner scanner = new Scanner(System.in);

        //Area para entrada de dados
        System.out.println("Digite o valor de A: ");
        a = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = scanner.nextDouble();

        //Verificar se A e o maior dos elementos
        if(b > a){
            auxiliar = a;
            a = b;
            b = auxiliar;
        }
        if(c > a){
            auxiliar = a;
            a = c;
            c = auxiliar;
        }

        a2 = Math.pow(a, 2); //math.pow serve para definir potencia em java, deixando a ao quadrado
        bc = Math.pow(b, 2) + Math.pow(c, 2);

        if(a >= b + c){
            System.out.println("Não forma triangulo");
        }
        else{
            //Pode formar algum triangulo
            if(a2 > bc){
                System.out.println("Triangulo Obtusangulo");
            }
            else if(a2 < bc){
                System.out.println("Triangulo Acutangulo");
            }
            else{
                System.out.println("Triangulo Retangulo");
            }

            //Verifica as arestas
            if(a == b && b==c){
                System.out.println("Triangulo Equilatero");
            }
            else if(a == b || a == c || b == c){
                System.out.println("Triangulo Isosceles");
            }
        }
    }
}


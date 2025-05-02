package ATV12_IdadeDias;

import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {
        int anos, meses, dias;
        int idadeEmDias; //Cammel Case
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade em anos: ");
        anos = scanner.nextInt();
        System.out.println("Digite a idade em meses: ");
        meses = scanner.nextInt();
        System.out.println("Digite a idade em dias: ");
        dias = scanner.nextInt();
        
        idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("Idade em dias: " + idadeEmDias);
    }
}

package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_notas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = sc.nextDouble();

        double notaFinal = primeiraNota + segundaNota;

        System.out.println("NOTA FINAL = " + notaFinal);

        if ( notaFinal < 60.0 ) {

            System.out.println("Reprovado");
        }

        sc.close();
    }
}

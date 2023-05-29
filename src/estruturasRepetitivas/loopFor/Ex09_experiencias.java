package estruturasRepetitivas.loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex09_experiencias {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos casos de teste serão digitados? ");
        int n = sc.nextInt();

        int coelhos = 0, sapos = 0, ratos = 0, totalCobaias = 0;
        double percentCoelhos = 0, percentSapos = 0, percentRatos = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Quantidade de cobaias: ");
            int cobaias = sc.nextInt();

            System.out.print("Tipo de cobaia: ");
            char tipoCobaia = sc.next().toLowerCase().charAt(0);

            if (tipoCobaia == 'c') {
                coelhos += cobaias;
            }
            else if (tipoCobaia == 'r') {
                ratos += cobaias;
            }
            else if (tipoCobaia == 's') {
                sapos += cobaias;
            }

            totalCobaias = coelhos + ratos + sapos;

            percentCoelhos = ((double) coelhos / totalCobaias) * 100;
            percentRatos = ((double) ratos / totalCobaias) * 100;
            percentSapos = ((double) sapos / totalCobaias) * 100;
        }

        System.out.println();
        System.out.println("RELTÓRIO FINAL:");

        System.out.printf("Total: %d cobais %n", totalCobaias);
        System.out.printf("Total de coelhos: %d%n", coelhos);
        System.out.printf("Total de Ratos: %d%n", ratos);
        System.out.printf("Total de sapos: %d%n", sapos);

        System.out.printf("Percentual de coelhos: %.2f%n", percentCoelhos);
        System.out.printf("Percentual de ratos: %.2f%n", percentRatos);
        System.out.printf("Percentual de sapos: %.2f%n", percentSapos);

        sc.close();
    }
}

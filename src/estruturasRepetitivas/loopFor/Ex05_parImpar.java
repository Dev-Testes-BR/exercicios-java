package estruturasRepetitivas.loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_parImpar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("NULO");
            }
            else if (numero % 2 == 0) {

                if (numero < 0 ) {
                    System.out.println("PAR NEGATIVO");
                }
                else {
                    System.out.println("PAR POSITIVO");
                }
            }
            else {

                if (numero < 0) {
                    System.out.println("IMPAR NEGATIVO");
                }
                else {
                    System.out.println("IMPAR POSITIVO");
                }
            }
        }

        sc.close();
    }
}

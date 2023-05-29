package estruturasRepetitivas.loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_sequenciaImpares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if ( i % 2 != 0 ) {
                System.out.printf("%d%n", i);
            }
        }

        sc.close();
    }
}

package estruturasRepetitivas.loopWhile;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_crescente {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            System.out.println("Digite dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}

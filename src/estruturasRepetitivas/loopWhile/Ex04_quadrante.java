package estruturasRepetitivas.loopWhile;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_quadrante {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas X e Y: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Quadrante Q1");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Quadrante Q2");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Quadrante Q3");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Quadrante Q4");
            }

            System.out.println("Digite as coordenadas X e Y: ");

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}

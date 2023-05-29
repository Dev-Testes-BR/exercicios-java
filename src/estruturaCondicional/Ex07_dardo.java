package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_dardo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double d1, d2, d3, maiorDistancia;

        System.out.println("Digite as tres distancias: ");

        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        d3 = sc.nextDouble();

        if (d1 > d2 && d1 > d3) {
            maiorDistancia = d1;
        }
        else if (d2 > d1 && d2 > d3) {
            maiorDistancia = d2;
        }
        else {
            maiorDistancia = d3;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f", maiorDistancia );

        sc.close();
    }
}

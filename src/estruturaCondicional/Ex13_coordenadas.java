package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex13_coordenadas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Valor de Y: ");
        double y = sc.nextDouble();

        String posicao = null;

        if (x == 0 && y == 0) {
            posicao = "Origem";
        }
        else if (x > 0 && y == 0) {
            posicao = "Eixo X";
        }
        else if (y > 0 && x == 0) {
            posicao = "Eixo Y";
        }
        else if (x > 0 && y > 0) {
            posicao = "Q1";
        }
        else if (x > 0 && y < 0) {
            posicao = "Q4";
        }
        else if (x < 0 && y < 0) {
            posicao = "Q3";
        }
        else if (x < 0 && y > 0) {
            posicao = "Q2";
        }

        System.out.println(posicao);

        sc.close();
    }
}

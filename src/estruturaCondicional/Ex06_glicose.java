package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_glicose {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a media da glicose: ");
        double glicoseMedia = sc.nextDouble();

        String classificacao;

        if (glicoseMedia <= 100) {
            classificacao = "Normal";
        }
        else if (glicoseMedia <= 140) {
            classificacao = "Elevado";
        }
        else {
            classificacao = "Diabetes";
        }

        System.out.printf("Classificacao: %s", classificacao);

        sc.close();
    }
}

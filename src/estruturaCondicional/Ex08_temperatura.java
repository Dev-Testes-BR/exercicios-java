package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex08_temperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Você vai digitar a temperatura em qual escala (C/F)?");
        char resposta = sc.next().charAt(0);

        double fahrenheit;
        double celcius;

        if (resposta == 'C' || resposta == 'c') {

            System.out.print("Digite a temperatura celsius: ");
            celcius = sc.nextDouble();

            fahrenheit = celcius * 9.0 / 5.0 + 32.0;

            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahrenheit);
        }
        else if (resposta == 'F' || resposta == 'f') {
            System.out.print("Digite a temperatura fahrenheit: ");
            fahrenheit = sc.nextDouble();

            celcius = 5.0 / 9.0 * (fahrenheit - 32);

            System.out.printf("Temperatura equivalente em Celcius: %.2f", celcius);
        }
        else {
            System.out.println("Escala inválida, tente novamente!!!");
        }

        sc.close();
    }
}

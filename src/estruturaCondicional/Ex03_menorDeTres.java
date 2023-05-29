package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_menorDeTres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Segundo Valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Terceiro valor: ");
        double valor3 = sc.nextDouble();

        double menor;

        if (valor1 < valor2 & valor2 < valor3  ) {
            menor = valor1;
        }
        else if (valor2 < valor1 & valor1 < valor3) {
            menor = valor2;
        }
        else {
            menor = valor3;
        }

        System.out.printf("Menor = %.2f", menor);

        sc.close();
    }
}

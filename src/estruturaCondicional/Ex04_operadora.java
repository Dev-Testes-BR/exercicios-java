package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_operadora {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorPlanoBase = 50.00;

        int minutosDisponiveis = 100;

        double valoMinutoExcedente = 2.00;

        double total;

        System.out.print("Digite a quantidade de minutos: ");
        int minutosConsumidos = sc.nextInt();

        if (minutosConsumidos <= minutosDisponiveis) {
            total = valorPlanoBase;
        }
        else {
            total = valorPlanoBase + ((minutosConsumidos - minutosDisponiveis) * valoMinutoExcedente);
        }

        System.out.printf("Valor a pagar: $ %.2f", total);

        sc.close();
    }
}

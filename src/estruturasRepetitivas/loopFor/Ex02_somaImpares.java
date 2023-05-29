package estruturasRepetitivas.loopFor;


import java.util.Locale;
import java.util.Scanner;

public class Ex02_somaImpares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");

        int aux, soma = 0;

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            aux = y;
            y = x;
            x = aux;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.printf("SOMA IMPARES = %d", soma);

        sc.close();
    }
}

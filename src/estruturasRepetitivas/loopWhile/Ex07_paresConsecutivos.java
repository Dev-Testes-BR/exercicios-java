package estruturasRepetitivas.loopWhile;


import java.util.Locale;
import java.util.Scanner;

public class Ex07_paresConsecutivos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {

            if (x % 2 != 0) {
                x ++;
            }

            soma = 5 * x + 20;

            System.out.printf("SOMA = %d%n", soma);

            System.out.print("Digite um número inteiro: ");
            x = sc.nextInt();
        }


        sc.close();
    }
}

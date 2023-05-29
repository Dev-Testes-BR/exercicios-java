package estruturasRepetitivas.loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_dentroFora {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int dentro = 0, fora = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro ++;
            }
            else {
                fora ++;
            }
        }

        System.out.printf("%d DENTRO %n", dentro);
        System.out.printf("%d FORA %n", fora);

        sc.close();
    }
}

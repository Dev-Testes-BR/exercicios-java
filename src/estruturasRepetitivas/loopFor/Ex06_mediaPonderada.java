package estruturasRepetitivas.loopFor;


import java.util.Locale;
import java.util.Scanner;

public class Ex06_mediaPonderada {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double x, y, z, media;

            System.out.println("Digite três números: ");

            x = sc.nextDouble() * 2;
            y = sc.nextDouble() * 3;
            z = sc.nextDouble() * 5;

            media = (x + y + z) / 10;

            System.out.printf("MÉDIA = %.1f%n", media);
        }

        sc.close();
    }
}

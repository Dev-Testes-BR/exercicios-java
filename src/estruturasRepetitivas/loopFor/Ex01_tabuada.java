package estruturasRepetitivas.loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_tabuada {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int n = sc.nextInt();

        for (int x = 1; x <= 10; x++) {
            System.out.printf("%d X %d = %d%n", n, x, n * x);
        }

        sc.close();
    }
}

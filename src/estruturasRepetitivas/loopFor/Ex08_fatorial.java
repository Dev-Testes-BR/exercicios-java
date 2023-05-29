package estruturasRepetitivas.loopFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex08_fatorial {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.printf("FATORIAL = %d", fat);

        sc.close();
    }
}

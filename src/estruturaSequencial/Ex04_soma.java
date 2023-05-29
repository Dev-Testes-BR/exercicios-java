package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_soma {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();
        sc.nextLine();

        int soma = x + y;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}

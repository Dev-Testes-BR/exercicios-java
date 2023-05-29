package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_circulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;

        System.out.print("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        double area = PI * (raio * raio);

        System.out.printf("AREA = %.3f", area);

        sc.close();
    }
}

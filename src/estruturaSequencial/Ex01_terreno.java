package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_terreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valorDoMetro = sc.nextDouble();

        double area = largura * comprimento;
        double valorTerrenno = area * valorDoMetro;

        System.out.printf("Area do terreno: %.2f", area);
        System.out.println();
        System.out.printf("Preco do terreno: %.2f", valorTerrenno);

        sc.close();
    }
}

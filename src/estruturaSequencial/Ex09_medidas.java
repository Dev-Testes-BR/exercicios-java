package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex09_medidas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double medidaA, medidaB, medidaC;
        double areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.print("Digite a medida A: ");
        medidaA = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        medidaB = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        medidaC = sc.nextDouble();

        areaQuadrado = medidaA * medidaA;

        areaTriangulo = ( medidaA * medidaB ) / 2;

        areaTrapezio = (( medidaA + medidaB ) * medidaC ) / 2;

        System.out.printf("AREA DO QUADRADO = %.4f", areaQuadrado);

        System.out.println();
        System.out.printf("AREA TRIANGULO = %.4f", areaTriangulo);

        System.out.println();
        System.out.printf("AREA TRAPEZIO = %.4f", areaTrapezio);

        sc.close();
    }
}

package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_somaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        double soma = 0.0;

        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }

        System.out.println();
        System.out.print("SOMA = " + soma);

        System.out.println();
        System.out.print("MEDIA = " + soma / arr.length);

        sc.close();
    }
}

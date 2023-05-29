package estruturasDeDados.Vetor;


import java.util.Locale;
import java.util.Scanner;

public class Ex07_abaixoDaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        double soma = 0;

        for (int i = 0; i < arr.length; i ++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextDouble();
            soma += arr[i];
        }

        double media = soma / arr.length;
        System.out.printf("MEDIA DO VETOR: %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < media) {
                System.out.printf("%.1f%n", arr[i]);
            }
        }

        sc.close();
    }
}

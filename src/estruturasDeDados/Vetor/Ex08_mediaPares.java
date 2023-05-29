package estruturasDeDados.Vetor;


import java.util.Locale;
import java.util.Scanner;

public class Ex08_mediaPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter no vetor? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int nPares = 0, pares = 0;

        double media;

        for (int i = 0; i < arr.length; i ++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 == 0) {
                nPares ++;
                pares += arr[i];
            }
        }

        if (nPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            media = pares / nPares;
            System.out.printf("MEDIA DOS NUMEROS PARES: %.1f", media);
        }

        sc.close();
    }
}

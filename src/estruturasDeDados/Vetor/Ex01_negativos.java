package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_negativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i ++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS NEGATIVOS: ");

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}

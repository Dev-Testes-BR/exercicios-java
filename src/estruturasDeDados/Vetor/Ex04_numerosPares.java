package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_numerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int qtdPares = 0;

        for (int i = 0; i < arr.length; i ++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                qtdPares ++;
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPares);

        sc.close();
    }
}

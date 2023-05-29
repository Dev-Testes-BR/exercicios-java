package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_somaVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];
        int[] arrC = new int[n];


        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < arrA.length; i ++) {
            arrA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < arrB.length; i ++) {
            arrB[i] = sc.nextInt();
        }

        for (int i = 0; i < arrC.length; i ++) {
            arrC[i] = arrA[i] + arrB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < arrB.length; i ++) {
            System.out.println(arrC[i]);
        }

        sc.close();
    }
}

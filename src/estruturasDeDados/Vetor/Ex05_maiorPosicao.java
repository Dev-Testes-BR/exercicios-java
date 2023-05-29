package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_maiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        double maior = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < arr.length; i ++) {
            System.out.print("Digite um número: ");
            arr[i] = sc.nextDouble();
        }

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > maior) {
                maior = arr[i];
                posicaoMaior = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + maior);

        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);

        sc.close();
    }
}

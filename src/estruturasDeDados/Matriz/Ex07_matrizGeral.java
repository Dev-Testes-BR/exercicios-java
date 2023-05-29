package estruturasDeDados.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_matrizGeral {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        double[][] mat = new double[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                mat[i][j] = sc.nextDouble();
            }
        }

        // Soma dos positivos

        int soma = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > 0) {
                    soma += mat[i][j];
                }
            }
        }

        System.out.println();
        System.out.printf("SOMA DOS POSITIVOS: %d%n", soma);

        // Escolhendo uma linha

        System.out.println();
        System.out.print("Escolha uma linha: ");
        int l = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[l][i] + " ");
        }
        System.out.println();

        // Escolhendo uma coluna

        System.out.println();
        System.out.print("Escolha uma coluna: ");
        int c = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][c] + " ");
        }
        System.out.println();

        // Diagonal principal
        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        // Alterando a matriz

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
            }
        }

        // Imprimindo a matriz alterada
        System.out.println();
        System.out.println("MATRIZ ALTERADA: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

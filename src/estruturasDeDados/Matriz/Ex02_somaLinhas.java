package estruturasDeDados.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_somaLinhas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de linhas da matriz? ");
        int linhas = sc.nextInt();

        System.out.print("Quantidade de colunas da matriz? ");
        int colunas = sc.nextInt();

        double[][] mat = new double[linhas][colunas];
        double[] vect = new double[2];

        for (int i = 0; i < mat.length; i ++) {
            System.out.println("Digite os elementos da " + (i+1) + "ª linha: ");
            for (int j = 0; j < mat[i].length; j ++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < mat.length; i ++) {

            for (int j = 0; j < mat[i].length; j ++) {
                vect[i] += mat[i][j];
            }
        }

        System.out.println("VETOR GERADO: ");

        for (int i = 0; i < vect.length; i ++) {
            System.out.println(vect[i]);
        }

        sc.close();
    }
}

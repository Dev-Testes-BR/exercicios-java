package estruturasDeDados.Matriz;


import java.util.Locale;
import java.util.Scanner;

public class Ex01_diagonalNegativos {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int negativos = 0;

        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat[i].length; j ++) {
                System.out.printf("Elemento[%d, %d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");

        for (int i = 0; i < mat.length; i ++) {
            System.out.print(mat[i][i] + " ");
            for (int j = 0; j < mat[i].length; j ++) {
                if (mat[i][j] < 0) {
                    negativos ++;
                }
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);

        sc.close();
    }
}

package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex11_dadosPessoais {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double maiorAltura, menorAltura, somaAlturaMulheres = 0;
        int nHomens = 0, nMulheres = 0;

        for (int i = 0; i < n; i ++) {
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            alturas[i] = sc.nextDouble();

            System.out.print("Genero da " + (i+1) + "ª pessoa: ");
            generos[i] = sc.next().toUpperCase().charAt(0);
        }

        maiorAltura = alturas[0];
        menorAltura = alturas[0];

        for (int i = 0; i < n; i ++) {

            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            else if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            if (generos[i] == 'M') {
                nHomens ++;
            }
            else if (generos[i] == 'F') {
                somaAlturaMulheres += alturas[i];
                nMulheres ++;
            }
        }

        System.out.printf("Menor altura: %.2f%n", menorAltura);

        System.out.printf("Maior altura: %.2f%n", maiorAltura);

        double mediaMulheres = somaAlturaMulheres / nMulheres;
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);

        System.out.printf("Numero de homens: %d", nHomens);

        sc.close();
    }
}

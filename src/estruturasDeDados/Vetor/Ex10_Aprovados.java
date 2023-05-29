package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex10_Aprovados {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] semestre1 = new double[n];
        double[] semestre2 = new double[n];

        double somaNotas = 0;
        double media = 0;

        for (int i = 0; i < n; i ++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "º aluno: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            semestre1[i] = sc.nextDouble();
            semestre2[i] = sc.nextDouble();
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < n; i ++) {
            somaNotas = semestre1[i] + semestre2[i];
            media = somaNotas / 2;

            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}

package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex09_maisVelho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        int idadePessoaMaisVelha = 0;
        String nomePessoaMaisVelha = "";

        for (int i = 0; i < n; i ++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i ++) {
            if (idades[i] > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idades[i];
                nomePessoaMaisVelha = nomes[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nomePessoaMaisVelha);

        sc.close();
    }
}

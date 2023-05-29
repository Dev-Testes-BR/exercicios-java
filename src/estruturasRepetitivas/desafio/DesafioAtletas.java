package estruturasRepetitivas.desafio;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de atletas: ");
        int n = sc.nextInt();

        int atletas = 0, mulheres = 0, homens = 0;
        double maiorAltura = 0, peso = 0, pesoAtletas = 0, alturaMulheres = 0;
        String nomeAtletaMaisAlto = "";

        for (int i = 1; i <= n; i++) {

            System.out.println("Digite os dados do atleta " + i);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Sexo: ");
            char sexo = sc.next().toUpperCase().charAt(0);

            while (sexo != 'M' && sexo != 'F') {
                System.out.print("Valor inválido! Favor digitar 'F' ou 'M': ");
                sexo = sc.next().toUpperCase().charAt(0);
            }

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            while (altura <= 0) {
                System.out.print("Valor inválido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            if (sexo == 'F') {
                mulheres ++;
                alturaMulheres += altura;
            }
            else {
                homens ++;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeAtletaMaisAlto = nome;
            }

            System.out.print("Peso: ");
            peso = sc.nextDouble();

            while (peso <= 0) {
                System.out.print("Valor inválido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }

            atletas ++;
            pesoAtletas += peso;
        }

        double pesoMedioAtletas = (double) pesoAtletas / atletas;
        double percentHomens = ((double) homens / atletas) * 100;

        double alturaMediaMulheres;

        if (mulheres > 0) {
            alturaMediaMulheres = (double) alturaMulheres / mulheres;
        }
        else {
            alturaMediaMulheres = 0;
        }

        System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedioAtletas);
        System.out.printf("Atleta mais alto: %s%n", nomeAtletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.2f %%%n", percentHomens);

        if (alturaMediaMulheres > 0) {
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
        }
        else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }
}

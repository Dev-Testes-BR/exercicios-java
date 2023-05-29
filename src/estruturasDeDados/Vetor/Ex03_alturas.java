package estruturasDeDados.Vetor;

import java.util.Locale;
import java.util.Scanner;

import estruturasDeDados.Vetor.entities.Person;

public class Ex03_alturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double alturaTotal = 0;
        double alturaMedia = 0;
        double percentualMenores = 0;
        int menores = 0;

        Person[] arr;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        arr = new Person[n];

        for (int i = 0; i < arr.length; i ++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            Person person = new Person(nome, idade, altura);

            arr[i] = person;
        }

        for (int i = 0; i < arr.length; i ++) {

            alturaTotal += arr[i].getHeight();

            if (arr[i].getAge() < 16) {
                menores ++;
            }
        }

        alturaMedia = alturaTotal / arr.length;

        System.out.printf("Altura média: %.2f%n", alturaMedia);

        if (menores > 0) {
            percentualMenores = (double) menores / arr.length * 100;
            System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentualMenores);

            for (int i = 0; i < arr.length; i ++) {

                if (arr[i].getAge() < 16) {
                    System.out.println(arr[i].getName());
                }
            }
        }

        sc.close();
    }
}

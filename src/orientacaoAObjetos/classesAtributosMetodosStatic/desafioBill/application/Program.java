package orientacaoAObjetos.classesAtributosMetodosStatic.desafioBill.application;

import orientacaoAObjetos.classesAtributosMetodosStatic.desafioBill.entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("Sexo: ");
        char gender = sc.next().toUpperCase().charAt(0);

        while (gender != 'M' &&  gender != 'F') {
            System.out.print("Valor inválido! Favor digitar 'M ou F': ");
            gender = sc.next().toUpperCase().charAt(0);
        }

        bill.gender = gender;

        System.out.print("Quantidade de cervejas: ");
        int beer = sc.nextInt();

        while (beer < 0) {
            System.out.print("Valor inválido! Digite valor maior ou igual a 0: )");
            beer = sc.nextInt();
        }

        bill.beer = beer;

        System.out.print("Quantidade de refrigerantes: ");
        int softDrink = sc.nextInt();

        while (softDrink < 0) {
            System.out.print("Valor inválido! Digite um valor maior ou igual a 0: ");
            softDrink = sc.nextInt();
        }

        bill.softDrink = softDrink;

        System.out.print("Quantidade de barbecue: ");
        int barbecue = sc.nextInt();

        while (barbecue < 0) {
            System.out.print("Valor inválido! Digite um valor maior ou igual a 0: ");
            barbecue = sc.nextInt();
        }

        bill.barbecue = barbecue;

        System.out.println();

        System.out.println("RELATÓRIO: ");
        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());

        if(bill.cover() > 30) {
            System.out.println("Isento de Couvert");
        }
        else {
            System.out.printf("Couvert = R$ %.2f%n", bill.cover());
        }

        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());

        System.out.println();

        System.out.printf("Valor a pagar = R$ %.2f", bill.total());

        sc.close();
    }
}
package estruturasDeDados.Vetor;

import estruturasDeDados.Vetor.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductsVect {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product;

        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i ++) {
            String name = sc.nextLine();
            sc.nextLine();

            double price = sc.nextDouble();

            product = new Product(name, price);

            vect[i] = product;
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i ++) {
            sum += vect[i].getPrice();
        }

        double average = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f", average);

        sc.close();
    }
}

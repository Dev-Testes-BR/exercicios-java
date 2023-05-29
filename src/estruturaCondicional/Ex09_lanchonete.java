package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex09_lanchonete {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idProduto, quantidadeComprada;

        double valorProduto = 0;

        System.out.print("Código do produto comprado: ");
        idProduto = sc.nextInt();

        if (idProduto == 1) {
            valorProduto = 5.00;
        }
        else if (idProduto == 2) {
            valorProduto = 3.50;
        }
        else if (idProduto == 3) {
            valorProduto = 4.80;
        }
        else if (idProduto == 4) {
            valorProduto = 8.90;
        }
        else if (idProduto == 5) {
            valorProduto = 7.32;
        }

        System.out.print("Quantidade comprada: ");
        quantidadeComprada = sc.nextInt();

        double total = valorProduto * quantidadeComprada;

        System.out.printf("Valor a pagar: R$ %.2f", total);

        sc.close();
    }
}
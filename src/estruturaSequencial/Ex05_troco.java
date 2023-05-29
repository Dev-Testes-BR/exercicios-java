package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_troco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = sc.nextInt();
        sc.nextLine();

        double valorTotal = valorProduto * quantidadeComprada;

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        double troco = dinheiroRecebido - valorTotal;

        System.out.printf("TROCO = %.2f", troco);

        sc.close();
    }
}

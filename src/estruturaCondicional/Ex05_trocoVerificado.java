package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_trocoVerificado {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = sc.nextDouble();

        double valorCompra = precoUnitario * quantidade;

        double troco;

        if (dinheiroRecebido > valorCompra) {
            troco = dinheiroRecebido - valorCompra;
            System.out.printf("TROCO = %.2f", troco);
        }
        else {
            troco = valorCompra - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", troco);
        }

        sc.close();
    }
}

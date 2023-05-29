package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_idades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa: ");

        System.out.print("Nome: ");
        String nomePrimeiraPessoa = sc.nextLine();

        System.out.print("Idade: ");
        int idadePrimeiraPessoa = sc.nextInt();

        System.out.println("Dados da segunda pessoa: ");

        sc.nextLine();
        System.out.print("Nome: ");
        String nomeSegundaPessoa = sc.nextLine();

        System.out.println("Idade: ");
        int idadeSegundaPessoa = sc.nextInt();
        sc.nextLine();

        double idadeMedia = (idadePrimeiraPessoa + idadeSegundaPessoa) / 2;

        System.out.printf("A idade de %s e %s é de %.1f anos", nomePrimeiraPessoa, nomeSegundaPessoa, idadeMedia);

        sc.close();
    }
}

package estruturasRepetitivas.loopWhile;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_senhaFixa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;

        System.out.print("Digite a senha: ");
        int senhaDigitada = sc.nextInt();

        while (senhaDigitada != senhaCorreta) {
            System.out.print("Senha inválida! Tente novamente: ");
            senhaDigitada = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}

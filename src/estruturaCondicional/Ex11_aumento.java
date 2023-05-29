package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex11_aumento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite i salário da pessoa: ");
        double salario = sc.nextDouble();

        int porcentagem = 0;

        if (salario < 1000) {
            porcentagem = 20;
        }
        else if (salario <= 3000) {
            porcentagem = 15;
        }
        else if (salario <= 8000) {
            porcentagem = 10;
        }
        else {
            porcentagem = 5;
        }

        double novoSalario = salario + (salario * porcentagem / 100);

        double aumento = novoSalario - salario;

        System.out.printf("Novo salário = R$ %.2f\n", novoSalario);
        System.out.printf("Aumento = R$ %.2f\n", aumento);
        System.out.printf("Porcentagem = %d %%\n", porcentagem);

        sc.close();
    }
}

package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex10_duracao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duração em segundos: ");
        int duracaoEmSegundos = sc.nextInt();
        sc.nextLine();

        int horas = duracaoEmSegundos / 3600;

        int resto = duracaoEmSegundos % 3600;

        int minutos = resto / 60;

        int segundos = resto % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        sc.close();
    }
}

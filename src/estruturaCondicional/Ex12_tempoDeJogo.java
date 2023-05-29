package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex12_tempoDeJogo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();

        int tempoDeJogo;

        if (horaInicial == 0 && horaFinal == 0) {
            tempoDeJogo = 24;
        }
        else {
            if (horaInicial > horaFinal) {
                tempoDeJogo = 24 - horaInicial + horaFinal;
            }
            else {
                tempoDeJogo = horaFinal - horaInicial;
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", tempoDeJogo);

        sc.close();
    }
}

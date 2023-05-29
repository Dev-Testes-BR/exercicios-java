package orientacaoAObjetos.herancaEPolimorfismo.desafioPlataformaDeEnsino.application;

import orientacaoAObjetos.herancaEPolimorfismo.desafioPlataformaDeEnsino.entities.Lesson;
import orientacaoAObjetos.herancaEPolimorfismo.desafioPlataformaDeEnsino.entities.Task;
import orientacaoAObjetos.herancaEPolimorfismo.desafioPlataformaDeEnsino.entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> lessons = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Dados da %dª aula: %n", i);

            System.out.print("Conteudo ou tarefa (c/t)? ");
            char content = sc.next().toLowerCase().charAt(0);

            System.out.print("Título: ");
            sc.nextLine();
            String title = sc.nextLine();

            if (content == 'c') {
                System.out.print("URL do vìdeo: ");
                String url = sc.next();

                System.out.print("Duração em segundos: ");
                int duration = sc.nextInt();

                lessons.add(new Video(title, url, duration));
            }
            else {
                System.out.print("Descricao: ");
                String description = sc.nextLine();

                System.out.print("Quantidade de questões: ");
                int questions = sc.nextInt();

                lessons.add(new Task(title, description, questions));
            }
            System.out.println();
        }

        System.out.println();

        int sum = 0;

        for (Lesson lesson : lessons) {
            sum += lesson.duration();
        }

        System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos", sum);

        sc.close();
    }
}
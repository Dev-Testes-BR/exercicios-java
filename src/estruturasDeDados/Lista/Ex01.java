package estruturasDeDados.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Vinicius");
        list.add("Jhullhe");
        list.add("Guigo");
        list.add("Lete");
        list.add("Luiz");
        list.add("Venâncio");

        System.out.println(list.size());

        // Imprimindo cada item de list

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------");

        // Removendo todos os itens que comecem com "L"
        list.removeIf(x -> x.charAt(0) == 'L');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Index of Vinicius: " + list.indexOf("Vinicius"));
        System.out.println("Index of Guigo: " + list.indexOf("Guigo"));
        System.out.println("---------------------");

        // Retornando todas as ocorrências de nomes que começam com 'V'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------");

        // Imprimindo o primeiro nome que começa com a letra 'G'
        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);
        sc.close();
    }
}

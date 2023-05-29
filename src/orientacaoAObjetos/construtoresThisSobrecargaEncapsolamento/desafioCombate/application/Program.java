package orientacaoAObjetos.construtoresThisSobrecargaEncapsolamento.desafioCombate.application;

import orientacaoAObjetos.construtoresThisSobrecargaEncapsolamento.desafioCombate.entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int life, attack, armor;

        System.out.println("Digite os dados do primeiro campeão: ");

        System.out.print("Nome: ");
        name = sc.next();

        System.out.print("Vida inicial: ");
        life = sc.nextInt();

        System.out.print("Ataque: ");
        attack = sc.nextInt();

        System.out.print("Armadura: ");
        armor = sc.nextInt();

        Champion championOne = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");

        System.out.print("Nome: ");
        name = sc.next();

        System.out.print("Vida inicial: ");
        life = sc.nextInt();

        System.out.print("Ataque: ");
        attack = sc.nextInt();

        System.out.print("Armadura: ");
        armor = sc.nextInt();

        Champion championTwo = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int n = sc.nextInt();

        for (int i= 1; i <= n; i ++) {

            championOne.takeDamage(championTwo);
            championTwo.takeDamage(championOne);

            System.out.println();
            System.out.printf("Resultado do turno %d:%n", i);
            System.out.println(championOne.status());
            System.out.println(championTwo.status());

            if (championOne.getLife() <= 0 || championTwo.getLife() <= 0) {
                break;
            }
        }

        System.out.println();
        System.out.println("FIM DO COMBATE");
        sc.close();
    }
}

package modulo02.aula02;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um dia da semana (1-7): ");
        int diaSemana = scan.nextInt();
        switch (diaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Não é uma dia da semana válido");
        }

        switch (diaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é uma dia da semana válido");
        }
    }
}

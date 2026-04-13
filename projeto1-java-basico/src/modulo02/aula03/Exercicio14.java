package modulo02.aula03;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / (double) 2.0F;
        String aproveitamento = "";
        if (media >= (double) 9.0F && media <= (double) 10.0F) {
            aproveitamento = "A";
        } else if (media >= (double) 7.5F && media < (double) 9.0F) {
            aproveitamento = "B";
        } else if (media >= (double) 6.0F && media < (double) 7.5F) {
            aproveitamento = "C";
        } else if (media >= (double) 4.0F && media < (double) 6.0F) {
            aproveitamento = "D";
        } else if (media >= (double) 0.0F && media < (double) 4.0F) {
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);
        switch (aproveitamento) {
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO");
        }
    }
}

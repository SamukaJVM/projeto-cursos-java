package modulo02.aula03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / (double) 2.0F;
        if (media == (double) 10.0F) {
            System.out.println("Aprovado com distinção");
        } else if (media >= (double) 7.0F) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}


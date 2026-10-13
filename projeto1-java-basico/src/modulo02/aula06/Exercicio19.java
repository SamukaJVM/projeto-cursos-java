package modulo02.aula06;

import java.util.Scanner;

public class Exercicio19 {
    /* Curso de Java - Correção Exercícios Aula 17 (while, do-while, for) Parte 3 */
    /* Faça um programa que calcule o mostre a média aritmética de N notas */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o número de notas: ");
        int notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0; i < notas; i++) {
            System.out.println("Entre com a nota = " + (i + 1));
            nota = scan.nextDouble();
            soma += nota;
        }

        media = soma / notas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}

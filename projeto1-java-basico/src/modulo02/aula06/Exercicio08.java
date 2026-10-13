package modulo02.aula06;

import java.util.Scanner;

public class Exercicio08 {
    /* Curso de Java - Correção Exercícios Aula 17 (while, do-while, for) Parte 2 */
    /* Faça um programa que leia 5 números e informe a soma e a média dos números */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um número: ");
            num = scan.nextInt();
            soma += num;
        }

        media = (double) soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}

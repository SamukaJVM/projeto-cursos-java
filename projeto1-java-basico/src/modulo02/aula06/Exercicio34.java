package modulo02.aula06;

import java.util.Scanner;

public class Exercicio34 {
    /* Curso de Java - Correção Exercícios Aula 17 (while, do-while, for) Parte 5 */
    /* Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N,
    Faça um programa que calcule o valor de H com N termos */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de n:");
        int n = scan.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += (double) 1 / i;
        }

        System.out.println("Soma = " + soma);
    }
}

package modulo02.aula03;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a quantidade (kg) de morango: ");
        double quantidadeMorango = scan.nextDouble();
        System.out.print("Entre com a quantidade (kg) de maça: ");
        double quantidadeMacas = scan.nextDouble();
        double precoKgMorango = (double) 0.0F;
        if (quantidadeMorango <= (double) 5.0F) {
            precoKgMorango = (double) 2.5F;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = (double) 0.0F;
        if (quantidadeMacas <= (double) 5.0F) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = (double) 1.5F;
        }

        double precoTotalMorango = quantidadeMorango * precoKgMorango;
        double precoTotalMaca = quantidadeMacas * precoKgMaca;
        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;
        if (quantidadeMorango + quantidadeMacas > (double) 8.0F || precoParcial > (double) 25.0F) {
            precoTotal = precoParcial - precoParcial / (double) 100.0F * (double) 10.0F;
        }

        System.out.println("Preço preço do Morango = " + precoTotalMorango);
        System.out.println("Preço preço da Maçã = " + precoTotalMaca);
        System.out.println("Preço total sem desconto = " + precoParcial);
        System.out.println("Preço total com desconto = " + precoTotal);
    }
}


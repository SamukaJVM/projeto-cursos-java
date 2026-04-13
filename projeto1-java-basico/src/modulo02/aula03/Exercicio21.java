package modulo02.aula03;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a qtd de litros vendidos: ");
        double litros = scan.nextDouble();
        System.out.print("Entre com o tipo de combustível G-(Gasolina) e A-(Álcool): ");
        String tipo = scan.next();
        double precoGasolina = (double) 2.5F;
        double precoAlcool = 1.9;
        int percentualDesconto = 0;
        double subTotal = (double) 0.0F;
        double totalDesconto = (double) 0.0F;
        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= (double) 20.0F) {
                percentualDesconto = 3;
            } else {
                percentualDesconto = 5;
            }

            subTotal = litros * precoAlcool;
        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= (double) 20.0F) {
                percentualDesconto = 4;
            } else {
                percentualDesconto = 6;
            }

            subTotal = litros * precoGasolina;
        }

        totalDesconto = subTotal / (double) 100.0F * (double) percentualDesconto;
        double precoAPagar = subTotal - totalDesconto;
        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}


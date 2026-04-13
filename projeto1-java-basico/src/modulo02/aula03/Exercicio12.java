package modulo02.aula03;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();
        System.out.print("Entre com as horas trabalhadas no mês: ");
        double quantidadeHora = scan.nextDouble();
        double salarioBruto = valorHora * quantidadeHora;
        int percentualIR = 0;
        if (!(salarioBruto <= (double) 900.0F)) {
            if (salarioBruto > (double) 900.0F && salarioBruto <= (double) 1500.0F) {
                percentualIR = 5;
            } else if (salarioBruto > (double) 1500.0F && salarioBruto <= (double) 2500.0F) {
                percentualIR = 10;
            } else if (salarioBruto > (double) 2500.0F) {
                percentualIR = 20;
            }
        }

        double ir = salarioBruto / (double) 100.0F * (double) percentualIR;
        double inss = salarioBruto / (double) 100.0F * (double) 10.0F;
        double fgts = salarioBruto / (double) 100.0F * (double) 11.0F;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário Bruto: (" + valorHora + " * " + quantidadeHora + "): " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("(-) INSS ( 10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Liquido: " + salarioLiquido);
    }
}

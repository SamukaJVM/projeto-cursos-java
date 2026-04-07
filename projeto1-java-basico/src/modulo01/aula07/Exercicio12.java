package modulo01.aula07;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o valor da hora: ");
        double valorHora = scan.nextDouble();
        System.out.print("Entre com um número de horas trabalhadas: ");
        double horaTrabalha = scan.nextDouble();
        double salarioBruto = valorHora * horaTrabalha;
        double inss = salarioBruto / (double) 100.0F * (double) 8.0F;
        double sindicato = salarioBruto / (double) 100.0F * (double) 5.0F;
        double impostoRenda = salarioBruto / (double) 100.0F * (double) 11.0F;
        double totalDescontos = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println(" Salário Bruto: " + salarioBruto);
        System.out.println(" Desconto de INSS: " + inss);
        System.out.println(" Desconto de Sindicato: " + sindicato);
        System.out.println(" Desconto Imposto Renda: " + impostoRenda);
        System.out.println(" Total de Descontos: " + totalDescontos);
        System.out.println(" Salário Líquido: " + salarioLiquido);
    }
}
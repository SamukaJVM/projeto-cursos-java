package modulo02.aula03;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = scan.nextDouble();
        int percentual = 0;
        if (salario <= (double) 280.0F) {
            percentual = 20;
        } else if (salario > (double) 280.0F && salario < (double) 700.0F) {
            percentual = 15;
        } else if (salario >= (double) 700.0F && salario < (double) 1500.0F) {
            percentual = 10;
        } else if (salario >= (double) 1500.0F) {
            percentual = 5;
        }

        double aumento = salario / (double) 100.0F * (double) percentual;
        double salarioAjustado = salario + aumento;
        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}

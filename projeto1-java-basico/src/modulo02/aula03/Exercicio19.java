package modulo02.aula03;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.print("Entre com o segundo número: ");
        int numero2 = scan.nextInt();
        System.out.print("Entre com a operação (+ - / *): ");
        String operacao = scan.next();
        double resultado = (double) 0.0F;
        boolean valida = true;
        switch (operacao) {
            case "+":
                resultado = (double) (numero1 + numero2);
                break;
            case "-":
                resultado = (double) (numero1 - numero2);
                break;
            case "*":
                resultado = (double) (numero1 * numero2);
                break;
            case "/":
                resultado = (double) numero1 / (double) numero2;
                break;
            default:
                System.out.println("Operação inválida");
                valida = false;
        }

        if (valida) {
            System.out.println("Resultado: " + resultado);
            if (resultado >= (double) 0.0F) {
                System.out.println("resultado positivo");
            } else {
                System.out.println("resultado negativo");
            }

            if (resultado % (double) 2.0F == (double) 0.0F) {
                System.out.println("resultado par");
            } else {
                System.out.println("resultado ímpar");
            }
        }
    }
}

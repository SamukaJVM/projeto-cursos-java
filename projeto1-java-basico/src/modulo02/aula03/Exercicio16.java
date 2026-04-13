package modulo02.aula03;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o valor de a: ");
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println("Não é equação de segundo grau");
        } else {
            System.out.print("Entre com o valor de b: ");
            int b = scan.nextInt();
            System.out.print("Entre com o valor de c: ");
            int c = scan.nextInt();
            double delta = Math.pow((double) b, (double) 2.0F) - (double) (4 * a * c);
            if (delta < (double) 0.0F) {
                System.out.println("detla negativo");
            } else {
                System.out.println("delta: " + delta);
                double x1 = ((double) (-b) + Math.sqrt(delta)) / (double) (2 * a);
                double x2 = ((double) (-b) - Math.sqrt(delta)) / (double) (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}


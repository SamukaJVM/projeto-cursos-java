package modulo01.aula07;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();
        double pesoIdeal = 72.7 * altura - (double) 58.0F;
        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}


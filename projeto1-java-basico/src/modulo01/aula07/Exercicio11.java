package modulo01.aula07;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a altura Homem: ");
        double alturaHomen = scan.nextDouble();
        System.out.print("Entre com a altura Mulher: ");
        double alturaMulher = scan.nextDouble();
        double pesoIdealHomem = 72.7 * alturaHomen - (double) 58.0F;
        double pesoIdealMulher = 62.1 * alturaMulher - 44.7;
        System.out.println("O peso ideal do Homem é: " + pesoIdealHomem);
        System.out.println("O peso ideal do Homem é: " + pesoIdealMulher);
    }
}


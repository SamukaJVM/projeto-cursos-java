package modulo01.aula07;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Entre com o segundo número: ");
        int num2 = scan.nextInt();
        int resultado = num1 + num2;
        System.out.println("A soma dos números é: " + resultado);
    }
}


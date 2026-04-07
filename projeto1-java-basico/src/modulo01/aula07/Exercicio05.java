package modulo01.aula07;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, (double) 2.0F);
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + area * (double) 2.0F);
    }
}
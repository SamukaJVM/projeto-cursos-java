package modulo01.aula07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();
        double celsius = (double) 5.0F * (farenheit - (double) 32.0F) / (double) 9.0F;
        System.out.println("A temperatura " + farenheit + "F é igual a " + celsius + "C");
    }
}


package modulo01.aula07;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Celsius: ");
        double celsius = scan.nextDouble();
        double farenheit = celsius * 1.8 + (double) 32.0F;
        System.out.println("A temperatura " + celsius + " C é igual a " + farenheit + " F");
    }
}


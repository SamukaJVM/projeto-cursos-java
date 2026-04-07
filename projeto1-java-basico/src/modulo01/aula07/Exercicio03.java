package modulo01.aula07;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com a quantidade de metros: ");
        double metros = scan.nextDouble();
        double cm = metros * (double) 100.0F;
        System.out.println(metros + " m é igual a " + cm + " cm");
    }
}

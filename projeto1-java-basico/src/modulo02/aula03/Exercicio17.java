package modulo02.aula03;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o ano: ");
        int ano = scan.nextInt();
        if (ano % 400 != 0 && (ano % 4 != 0 || ano % 100 == 0)) {
            System.out.println("não é bissexto");
        } else {
            System.out.println("é bissexto");
        }
    }
}

package modulo02.aula01;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com sua idade: ");
        int idade = scan.nextInt();
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }

        System.out.print("Entre com o preço do item: ");
        double valor = scan.nextDouble();
        if (valor <= (double) 10.0F) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > (double) 10.0F && valor < (double) 15.0F) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= (double) 15.0F && valor < (double) 17.0F) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }

    }
}

package modulo01.aula07;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a área a ser pintada em m2: ");
        double tamanhoAreaEmMetros = scan.nextDouble();
        double lataLitrosTinta = (double) 18.0F;
        double valorLataTinta = (double) 80.0F;
        double areaPintadaPorLata = tamanhoAreaEmMetros / lataLitrosTinta / (double) 3.0F;
        double quantidadeHaComprarDeLatas = valorLataTinta * areaPintadaPorLata;
        System.out.println("Valor de uma unidade Lata da Tinta: " + valorLataTinta + " R$");
        System.out.println("O Valor da área ser pintada: " + quantidadeHaComprarDeLatas);
    }
}

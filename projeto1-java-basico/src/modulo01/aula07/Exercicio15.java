package modulo01.aula07;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a área a ser pintada em m2: ");
        double tamanhoAreaEmMetros = scan.nextDouble();
        double lataLitrosTinta = (double) 18.0F;
        double valorLataTinta = (double) 80.0F;
        double galaoLitrosTinta = 3.6;
        double valorgalaoLitro = (double) 25.0F;
        double areaPintadaPorLata = tamanhoAreaEmMetros / lataLitrosTinta / (double) 6.0F;
        double quantidadeHaComprarDeLatas = valorLataTinta * areaPintadaPorLata;
        double areaPintadaPorGalao = tamanhoAreaEmMetros / galaoLitrosTinta / (double) 6.0F;
        double quantidadeHaComprarDeGalao = valorgalaoLitro * areaPintadaPorGalao;
        System.out.println("Valor de uma unidade de lata 18L: " + valorLataTinta + " R$");
        System.out.println("O Valor da área ser pintada com lata de 18L: " + quantidadeHaComprarDeLatas);
        System.out.println("------------------------------------------------------");
        System.out.println("Valor de uma unidade de Galão 3.6L: " + valorgalaoLitro + " R$");
        System.out.println("O Valor da área ser pintada com Galão 3.6L: " + quantidadeHaComprarDeGalao);
    }
}

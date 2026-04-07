package modulo01.aula07;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();
        System.out.print("Entre com a velocidade da internet: ");
        double velInternet = scan.nextDouble();
        double tempo = tamArquivo / velInternet;
        System.out.println("Tempo de download em minutos: " + tempo);
    }
}

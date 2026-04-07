package modulo01.aula03;

import java.util.Scanner;

public class LendoDadosTeclado {
    /* Curso de Java 12: Lendo dados do teclado usando a classe Scanner */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
        String primeiroNome = scan.next();
        scan.nextLine();
        int idade = scan.nextInt();
        scan.nextLine();
        byte qtdFilhos = scan.nextByte();
        scan.nextLine();
        float altura = scan.nextFloat();
        scan.nextLine();
        boolean temPet = scan.nextBoolean();
        scan.nextLine();
        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);
    }
}
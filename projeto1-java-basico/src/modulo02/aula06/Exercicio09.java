package modulo02.aula06;

public class Exercicio09 {
    /* Curso de Java - Correção Exercícios Aula 17 (while, do-while, for) Parte 2 */
    /* Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50*/
    public static void main(String[] args) {

        for (int i=1; i<50; i++){

            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}

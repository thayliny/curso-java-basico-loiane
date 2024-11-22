package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Nota 1 :");
        double nota1 = leitura.nextDouble();

        System.out.println("Nota 2 :");
        double nota2 = leitura.nextDouble();

        System.out.println("Nota 3 :");
        double nota3 = leitura.nextDouble();

        System.out.println("Nota 4 :");
        double nota4 = leitura.nextDouble();
        /*
        A média aritmética é uma das medidas de centralidade. Ela resulta da divisão entre a
        soma dos números de uma lista e a quantidade de números somados.
         */

        double resultadoMedia = (nota1+nota2+nota3+nota4)/4;

        System.out.printf("A média é: %.2f%n", resultadoMedia);
        // Formatação para Limitar casas decimais System.out.printf("A média é: %.2f%n", resultadoMedia);



    }
}

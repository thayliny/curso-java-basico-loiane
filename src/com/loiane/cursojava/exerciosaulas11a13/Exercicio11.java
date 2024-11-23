package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int num1;
        int num2;
        double num3;

        num1 = leitura.nextInt();
        num2 = leitura.nextInt();
        num3 = leitura.nextDouble();

        System.out.println(" Resultado produto: "+ ((num1*2)*(num2/2)));
        System.out.println(" Resultado soma: "+ ((num1*3)+num3));
        System.out.printf(" Resultado elevação ao cubo: %.2f", Math.pow(num3,3 ));




    }
}

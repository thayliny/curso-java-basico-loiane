package com.loiane.cursojava.exerciosaulas11a13;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //Pesca

        double quiloPesca;

        Scanner leitura = new Scanner(System.in);

        quiloPesca = leitura.nextDouble();

        if (quiloPesca > 50) {
            double execesso = (quiloPesca - 50);
            double valorMulta = execesso * 4.0;

            System.out.println("Excesso de pesca " + execesso);
            System.out.println("Valor da pesca " + valorMulta);
        } else {
            System.out.println("Excesso de pesca 0,0");
            System.out.println("Valor da pesca 0,0");
        }


    }
}

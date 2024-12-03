package com.loiane.cursojava.exerciciosaulas16a17;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota;

        nota = scan.nextDouble();
        do
        {
            System.out.println("Numero Incorreto");
            nota = scan.nextDouble();

        }while(nota >=0 && nota <= 10); // Fazer DEBUG









    }

}

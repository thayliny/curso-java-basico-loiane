package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();

        media = (nota1+nota2)/2;

        if( media == 10)
        {
            System.out.println("Aprovado com Distinção");
        }

        else if (media >= 7 && media <=9)
        {
            System.out.println("Aprovado");
        }
        else
        {

            System.out.println("Reprovado");

        }



    }
}

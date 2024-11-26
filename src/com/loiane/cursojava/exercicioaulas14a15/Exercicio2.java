package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero;
        numero = scan.nextDouble();

        if(numero < 0)
        {
            System.out.println("Esse numero é negativo  " + numero);
        } else if (numero > 0) {
            System.out.println("Esse numero é Positivo  " + numero);
        } else
        {
            System.out.println("Esse numero é 0 ");
        }

        scan.close();

    }
}

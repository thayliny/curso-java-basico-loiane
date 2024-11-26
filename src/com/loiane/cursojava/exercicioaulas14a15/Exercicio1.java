package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int numero1, numero2;
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();

        if(numero1 > numero2)
        {
            System.out.println(numero1);
        }
        else {
            System.out.println(numero2);
        }

    }
}

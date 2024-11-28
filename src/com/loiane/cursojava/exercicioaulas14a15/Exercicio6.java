package com.loiane.cursojava.exercicioaulas14a15;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();


        if ( num1 > num2 && num1 > num3)
        {
            System.out.println("num1 " + num1);
        }
        if ( num2 > num1 && num2 > num3)
        {
            System.out.println("num2 " + num2);
        }
        if ( num3 > num1 && num3 > num2)
        {
            System.out.println("num3 "+ num3);
        }

    }
}
